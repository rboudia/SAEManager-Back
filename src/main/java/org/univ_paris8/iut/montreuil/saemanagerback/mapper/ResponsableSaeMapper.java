package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

import org.springframework.stereotype.Component;
import org.univ_paris8.iut.montreuil.saemanagerback.dto.ResponsablesSaeDTO;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.PersonneEntity;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.ResponsablesSae;
import org.univ_paris8.iut.montreuil.saemanagerback.entity.Sae;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class ResponsableSaeMapper {

    public ResponsablesSaeDTO toDto(ResponsablesSae entity) {
        if (entity == null) {
            return null;
        }
        return new ResponsablesSaeDTO(
                entity.getSae().getIdSAE(),
                entity.getResponsable().getIdPersonne()
        );
    }

/*


    public ResponsablesSae toEntity(ResponsablesSaeDTO dto) {

        ResponsablesSae entity = new ResponsablesSae();

        entity.setIdResp(dto.getIdResp());
        entity.setSae(dto.getSae());

        return entity ;
    }
 */

    public ResponsablesSae toEntity(ResponsablesSaeDTO dto, Sae sae, PersonneEntity responsable) {
        if (dto == null || sae == null || responsable == null) {
            return null;
        }

        ResponsablesSae entity = new ResponsablesSae();
        entity.setSae(sae);
        entity.setResponsable(responsable);

        return entity;
    }

    public List<ResponsablesSaeDTO> toDtoList(List<ResponsablesSae> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<ResponsablesSae> toEntityList(List<ResponsablesSaeDTO> dtos, List<Sae> saes, List<PersonneEntity> responsables) {
        if (dtos == null || saes == null || responsables == null || dtos.size() != saes.size() || dtos.size() != responsables.size()) {
            return null;
        }

        return IntStream.range(0, dtos.size())
                .mapToObj(i -> toEntity(dtos.get(i), saes.get(i), responsables.get(i)))
                .collect(Collectors.toList());
    }


}
