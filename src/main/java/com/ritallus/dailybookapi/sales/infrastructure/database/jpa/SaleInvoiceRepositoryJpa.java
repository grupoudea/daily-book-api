package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.core.dtos.SaleInvoiceReportResponse;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SaleInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface SaleInvoiceRepositoryJpa extends JpaRepository<SaleInvoiceEntity, Long> {

    @Query(value = "SELECT new com.ritallus.dailybookapi.sales.core.dtos.SaleInvoiceReportResponse(" +
            "s.total, s.invoiceDate) " +
            "FROM SaleInvoiceEntity s " +
            "WHERE s.idCompany = 1 " +
            "AND s.status = 'CLOSED' " +
            "AND s.invoiceDate BETWEEN :startDay AND :endDay "
    )
    List<SaleInvoiceReportResponse> getDailyReport(@Param("startDay") LocalDateTime startDay, @Param("endDay") LocalDateTime endDay);
}
