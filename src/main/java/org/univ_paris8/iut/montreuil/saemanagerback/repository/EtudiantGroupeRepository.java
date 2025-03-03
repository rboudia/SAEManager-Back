package org.univ_paris8.iut.montreuil.saemanagerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.EtudiantGroupe;

@Repository
public interface EtudiantGroupeRepository extends JpaRepository<EtudiantGroupe, Integer> {
}
