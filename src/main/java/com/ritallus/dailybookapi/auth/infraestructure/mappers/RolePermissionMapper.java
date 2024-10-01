package com.ritallus.dailybookapi.auth.infraestructure.mappers;


import com.ritallus.dailybookapi.auth.domain.models.RolePermission;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.RolePermissionEntity;
import com.ritallus.dailybookapi.commons.EntityMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true), uses = {RoleMapper.class, PermissionMapper.class})
public interface RolePermissionMapper extends EntityMapper<RolePermission, RolePermissionEntity> {

}
