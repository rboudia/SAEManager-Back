package org.univ_paris8.iut.montreuil.saemanagerback.entity;

import jakarta.persistence.*;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.composite.RessourceSaeId;

@Entity
@Table(name = "ressourcessae")
public class RessourceSAE {


        @EmbeddedId
        private RessourceSaeId id; // Clé composite

        @Column(name = "misEnAvant")
        private Integer misEnAvant;

        public RessourceSAE() {}

        public RessourceSAE(Integer idSae, Integer idRessource, Integer misEnAvant) {
            this.id = new RessourceSaeId(idSae, idRessource);
            this.misEnAvant = misEnAvant;
        }

        public RessourceSaeId getId() {
            return id;
        }

        public void setId(RessourceSaeId id) {
            this.id = id;
        }

        public Integer getMisEnAvant() {
            return misEnAvant;
        }

        public void setMisEnAvant(Integer misEnAvant) {
            this.misEnAvant = misEnAvant;
        }


}
