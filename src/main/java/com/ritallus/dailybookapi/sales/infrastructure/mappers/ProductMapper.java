package com.ritallus.dailybookapi.sales.infrastructure.mappers;


import com.ritallus.dailybookapi.commons.EntityMapper;
import com.ritallus.dailybookapi.sales.domain.models.Product;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.ProductEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface ProductMapper extends EntityMapper<Product, ProductEntity> {

}
