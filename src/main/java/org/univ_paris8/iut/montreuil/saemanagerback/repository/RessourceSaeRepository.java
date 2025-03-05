package org.univ_paris8.iut.montreuil.saemanagerback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.RessourceSAE;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.composite.RessourceSaeId;

import java.util.List;

@Repository
public interface RessourceSaeRepository extends JpaRepository<RessourceSAE, RessourceSaeId> {
    List<RessourceSAE> findById_IdSae(Integer idSae);
}
