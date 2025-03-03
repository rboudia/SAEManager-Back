package org.univ_paris8.iut.montreuil.saemanagerback.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<PersonneEntity, Integer> {

    List<PersonneEntity> findByEstProf(Integer estProf);

    @Modifying
    @Transactional
    @Query("UPDATE PersonneEntity p SET p.estProf = ?1 where p.idPersonne = ?2")
    void updateEstProf(Integer estProf, Integer id);


    @Query("SELECT p FROM PersonneEntity p WHERE LOWER(p.prenom) LIKE LOWER(CONCAT('%', ?1, '%')) OR LOWER(p.nom) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<PersonneEntity> searchByNamePersonne(String keyword);


    @Query(value = """
                SELECT p.* 
                FROM EleveInscritSae e
                INNER JOIN Personne p ON p.idPersonne = e.idEleve
                WHERE e.idSAE = ?1
                AND e.idEleve NOT IN (
                    SELECT pe.idEleve FROM PropositionsEleve pe
                    INNER JOIN PropositionsGroupe pg using(idProposition)
                    WHERE pg.idSAE = ?1
                )
                AND e.idEleve NOT IN (
                    SELECT eg.idEtudiant FROM EtudiantGroupe eg
                    INNER JOIN Groupe g ON eg.idGroupe = g.idgroupe
                    WHERE g.idSAE = ?1
                )
            """, nativeQuery = true)
    List<PersonneEntity> getEtudiantsBySAE(Integer idSae);

}