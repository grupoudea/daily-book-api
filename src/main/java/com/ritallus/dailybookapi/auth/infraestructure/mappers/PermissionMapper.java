package com.ritallus.dailybookapi.auth.infraestructure.mappers;


import com.ritallus.dailybookapi.auth.domain.models.Permission;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.PermissionEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface PermissionMapper extends EntityMapper<Permission, PermissionEntity> {

}
