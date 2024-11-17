package com.ritallus.dailybookapi.sales.infrastructure.mappers;


import com.ritallus.dailybookapi.commons.EntityMapper;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SaleInvoiceEntity;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface SaleInvoiceMapper extends EntityMapper<SaleInvoice, SaleInvoiceEntity> {

}
