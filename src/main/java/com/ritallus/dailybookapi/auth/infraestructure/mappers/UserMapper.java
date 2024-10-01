package com.ritallus.dailybookapi.auth.infraestructure.mappers;


import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.UserEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UserMapper extends EntityMapper<User, UserEntity> {

}
