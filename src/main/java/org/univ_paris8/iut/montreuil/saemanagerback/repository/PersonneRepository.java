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


    @Query("SELECT p FROM PersonneEntity p WHERE LOWER(p.prenom) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<PersonneEntity> searchByNamePersonne(String keyword);

}
