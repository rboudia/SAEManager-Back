package org.univ_paris8.iut.montreuil.saemanagerback.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.univ_paris8.iut.montreuil.saemanagerback.filter.JwtFilter;
import org.univ_paris8.iut.montreuil.saemanagerback.service.CustomUserDetailsService;

import java.util.List;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomUserDetailsService customUserDetailsService;
    private final JwtUtils jwtUtils;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }

    /**
     * Configuration CORS + règles de sécurité.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // 1) Activer et configurer CORS
        http.cors(cors -> cors.configurationSource(request -> {
            CorsConfiguration config = new CorsConfiguration();
            // Autorise l'origine du front Angular
            config.setAllowedOrigins(List.of("http://localhost:4200"));
            // Méthodes autorisées
            config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
            // En-têtes autorisés
            config.setAllowedHeaders(List.of("Content-Type", "Authorization"));
            // Autoriser l'envoi de cookies/credentials si besoin
            config.setAllowCredentials(true);
            return config;
        }));

        // 2) Désactiver CSRF (ou configure-le si nécessaire)
        http.csrf(AbstractHttpConfigurer::disable);

        // 3) Règles d'accès
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**").permitAll()
                .requestMatchers("/api/admin/**").hasAuthority("ADMIN")
                .requestMatchers("/api/etudiant/**").hasAuthority("ETUDIANT")
                .anyRequest().authenticated()
        );

        // 4) Ajout du filtre JWT
        http.addFilterBefore(new JwtFilter(customUserDetailsService, jwtUtils), UsernamePasswordAuthenticationFilter.class);

        // 5) Construire et retourner la config
        return http.build();
    }

}
