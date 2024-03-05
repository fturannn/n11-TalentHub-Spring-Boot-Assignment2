package org.example.service.Impl;

import org.example.entity.Invoice;
import org.example.service.InvoiceService;

import java.time.Month;
import java.util.List;

public class InvoiceServiceImpl implements InvoiceService {

    private final List<Invoice> invoiceList;

    public InvoiceServiceImpl(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public double totalInvoiceAmountForJuneRegistrants() {
        return invoiceList.stream()
                .filter(invoice -> invoice.getCustomer().getRegistrationDate().getMonth().equals(Month.JUNE))
                .mapToDouble(Invoice::getPrice).sum();
    }

    @Override
    public List<Invoice> findAllInvoices() {
        return invoiceList;
    }

    public List<Invoice> findAllInvoicesOver1500() {
        return invoiceList.stream().filter(invoice -> invoice.getPrice() > 1500).toList();
    }

    public double getAverageOfInvoicesOver1500() {
        double totalOfInvoicesOver1500 = invoiceList
                .stream()
                .filter(invoice -> invoice.getPrice() > 1500).mapToDouble(Invoice::getPrice).sum();;
        int size = this.findAllInvoicesOver1500().size();
        return totalOfInvoicesOver1500 / size;
    }

    public List<String> customerNamesWithInvoicesBelow500() {
        return invoiceList
                .stream()
                .filter(invoice -> invoice.getPrice() > 1500)
                .map(invoice -> invoice.getCustomer().getName())
                .toList();
    }

    public List<String> sectorsOfCompaniesWithInvoicesBelow750InJune() {
        return invoiceList.stream()
                .filter(invoice -> invoice.getCustomer().getRegistrationDate().getMonth().equals(Month.JUNE))
                .filter(invoice -> invoice.getPrice() < 750)
                .map(invoice -> invoice.getSeller().getSectorName()).toList();
    }
}
