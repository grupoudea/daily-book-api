package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.core.dtos.SaleInvoiceReportResponse;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SaleInvoiceRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.SaleInvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SaleInvoiceRepositoryAdapter implements SaleInvoiceRepositoryPort {

    private final SaleInvoiceRepositoryJpa saleInvoiceRepositoryJpa;
    private final SaleInvoiceMapper saleInvoiceMapper;

    @Override
    public SaleInvoice save(SaleInvoice saleInvoice) {
        return saleInvoiceMapper.toModel(saleInvoiceRepositoryJpa.save(saleInvoiceMapper.toEntity(saleInvoice)));
    }

    @Override
    public List<SaleInvoiceReportResponse> getDailyReport() {
        // Fecha proporcionada
        String dateStr = "2024-11-17 23:59:59.000";

        // Define el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        // Convierte la cadena de texto a LocalDateTime
        LocalDateTime dateTime = LocalDateTime.parse(dateStr, formatter);

        // Obtener el inicio del día (00:00:00)
        LocalDateTime startOfDay = dateTime.toLocalDate().atStartOfDay();

        // Obtener el final del día (23:59:59.999)
        LocalDateTime endOfDay = dateTime.toLocalDate().atTime(23, 59, 59, 999999999);

        return saleInvoiceRepositoryJpa.getDailyReport(startOfDay, endOfDay);
    }
}
