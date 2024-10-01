package com.ritallus.dailybookapi.auth.infraestructure.mappers;

import java.util.List;
import java.util.Set;

public interface EntityMapper<D, E> {

    E toEntity(D model);

    D toModel(E entity);

    List<E> toEntity(List<D> modelList);

    List<D> toModel(List<E> entityList);

    Set<E> toEntity(Set<D> modelList);

    Set<D> toModel(Set<E> entityList);
}