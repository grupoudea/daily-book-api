package com.ritallus.dailybookapi.auth.infraestructure.mappers;


import com.ritallus.dailybookapi.auth.domain.models.Role;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.RoleEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface RoleMapper extends EntityMapper<Role, RoleEntity> {

}
