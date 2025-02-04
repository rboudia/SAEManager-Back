package org.univ_paris8.iut.montreuil.saemanagerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<PersonneEntity, Integer> {

    List<PersonneEntity> findByEstProf(Integer estProf);
}
