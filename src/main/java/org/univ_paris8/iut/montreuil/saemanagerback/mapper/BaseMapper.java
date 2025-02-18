package org.univ_paris8.iut.montreuil.saemanagerback.mapper;

public abstract class BaseMapper<E, D> {

    public abstract D toDTO(E entity);
    public abstract E toEntity(D dto);
}
