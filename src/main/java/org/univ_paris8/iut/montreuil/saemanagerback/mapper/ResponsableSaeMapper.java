package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.univ_paris8.iut.montreuil.saemanagerback.dto.ResponsablesSaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.ResponsablesSae;

public class ResponsableSaeMapper {

    public ResponsablesSaeDTO toDTO(ResponsablesSae entity) {

        ResponsablesSaeDTO dto = new ResponsablesSaeDTO(
                entity.getIdResp(),
                entity.getSae()
        );

        return dto ;

    }

    public ResponsablesSae toEntity(ResponsablesSaeDTO dto) {

        ResponsablesSae entity = new ResponsablesSae();

        entity.setIdResp(dto.getIdResp());
        entity.setSae(dto.getSae());

        return entity ;

    }

}
