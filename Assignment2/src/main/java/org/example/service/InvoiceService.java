package org.example.service;

import org.example.entity.Invoice;

import java.util.List;

public interface InvoiceService {

    List<Invoice> findAllInvoices();

}
