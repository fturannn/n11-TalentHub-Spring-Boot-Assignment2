package org.example;

import org.example.entity.Customer;
import org.example.entity.Invoice;
import org.example.entity.Seller;
import org.example.service.Impl.CustomerServiceImpl;
import org.example.service.Impl.InvoiceServiceImpl;
import org.example.service.Impl.SellerServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();
        List<Customer> customerList = database.customerList();
        List<Seller> sellerList = database.sellerList();
        List<Invoice> invoiceList = database.invoiceList();

        CustomerServiceImpl customerService = new CustomerServiceImpl(customerList);
        SellerServiceImpl sellerService = new SellerServiceImpl(sellerList);
        InvoiceServiceImpl invoiceService = new InvoiceServiceImpl(invoiceList);

        List<Customer> allCustomers = customerService.findAll();
        List<Customer> customerWithLetterC = customerService.findCustomersWithLetterC();
        List<Invoice> allInvoices = invoiceService.findAllInvoices();
        List<Invoice> invoiceOver1500 = invoiceService.findAllInvoicesOver1500();
        List<String> customerNamesWithInvoicesBelow500 = invoiceService.customerNamesWithInvoicesBelow500();
        List<String> sectorsOfCompaniesWithInvoicesBelow750InJune = invoiceService.sectorsOfCompaniesWithInvoicesBelow750InJune();


        System.out.println("Tüm müşteriler: ");
        for(Customer customer : allCustomers) {
            System.out.println(customer.getName() + " " + customer.getSurname());
        }
        System.out.println("-------------------");

        customerService.save(new Customer());

        System.out.println("İçerisinde ‘C’ harfi olan müşteriler: ");
        for(Customer customer : customerWithLetterC) {
            System.out.println(customer.getName() + " " + customer.getSurname());
        }
        System.out.println("-------------------");

        System.out.println("Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarı: " +
                invoiceService.totalInvoiceAmountForJuneRegistrants());
        System.out.println("-------------------");

        System.out.println("Sistemdeki tüm faturalar: ");
        for(Invoice invoice : allInvoices) {
            System.out.println("id: " + invoice.getId() + " - " + "Tutar: " + invoice.getPrice());
        }
        System.out.println("-------------------");

        System.out.println(" Sistemdeki 1500TL üstündeki faturalar: ");
        for(Invoice invoice : invoiceOver1500) {
            System.out.println("id: " + invoice.getId() + " - " + "Tutar: " + invoice.getPrice());
        }
        System.out.println("-------------------");

        System.out.println("Sistemdeki 1500TL üstündeki faturaları ortalaması: " +
                invoiceService.getAverageOfInvoicesOver1500());
        System.out.println("-------------------");

        System.out.println("Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri: ");
        for(String name : customerNamesWithInvoicesBelow500) {
            System.out.println(name);
        }
        System.out.println("-------------------");

        System.out.println("Haziran ayının faturalarının  750 altı olan firmaların hangi sektörde olduğunu listele: ");
        for(String sector : sectorsOfCompaniesWithInvoicesBelow750InJune) {
            System.out.println(sector);
        }

    }
}