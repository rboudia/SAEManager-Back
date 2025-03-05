package org.univ_paris8.iut.montreuil.saemanagerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Rendu;

import java.util.List;

@Repository
public interface RenduRepository extends JpaRepository<Rendu, Integer> {
    List<Rendu> findBySae_IdSAE(Integer idSAE);

}
