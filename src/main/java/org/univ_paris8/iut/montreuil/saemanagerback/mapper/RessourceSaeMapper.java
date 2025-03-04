package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.RessourceSaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.RessourceSAE;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.composite.RessourceSaeId;

public class RessourceSaeMapper {



        public RessourceSaeDTO toDTO(RessourceSAE ressourceSAE) {
            return new RessourceSaeDTO(
                    ressourceSAE.getId().getIdSae(),  // Récupère l'ID SAE depuis la clé composite
                    ressourceSAE.getId().getIdRessource(), // Récupère l'ID Ressource depuis la clé composite
                    ressourceSAE.getMisEnAvant()
            );
        }

        public RessourceSAE toEntity(RessourceSaeDTO ressourceSaeDTO) {
            RessourceSaeId ressourceSaeId = new RessourceSaeId(
                    ressourceSaeDTO.getIdSAE(),
                    ressourceSaeDTO.getiDRessource()
            );

            RessourceSAE ressourceSAE = new RessourceSAE();
            ressourceSAE.setId(ressourceSaeId); // Assigne la clé composite
            ressourceSAE.setMisEnAvant(ressourceSaeDTO.getMisEnAvant());

            return ressourceSAE;
        }


}
