package com.ritallus.dailybookapi.auth.infraestructure.mappers;


import com.ritallus.dailybookapi.auth.domain.models.UserRole;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.UserRoleEntity;
import com.ritallus.dailybookapi.commons.EntityMapper;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true), uses = {RoleMapper.class, UserRoleMapper.class})
public interface UserRoleMapper extends EntityMapper<UserRole, UserRoleEntity> {

}
