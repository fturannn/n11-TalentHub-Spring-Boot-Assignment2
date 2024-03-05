package org.example;

import org.example.entity.Customer;
import org.example.entity.Invoice;
import org.example.entity.Seller;
import org.example.service.CustomerService;
import org.example.service.InvoiceService;
import org.example.service.SellerService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<Customer> customerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1L, "Customer1", "Surname1",LocalDate.of(1997,6,12)));
        customerList.add(new Customer(2L, "Name2", "Surname2", LocalDate.of(1998,1,18)));
        customerList.add(new Customer(3L, "Customer3", "Surname3", LocalDate.of(2005,6,24)));
        customerList.add(new Customer(4L, "Name4", "Surname4", LocalDate.of(2003,12,2)));
        customerList.add(new Customer(5L, "Name5", "Surname5", LocalDate.of(2008,10,15)));
        return customerList;
    }

    public List<Seller> sellerList() {
        List<Seller> sellerList = new ArrayList<>();
        sellerList.add(new Seller(1L, "Seller 1", "Automotive"));
        sellerList.add(new Seller(2L, "Seller 2", "Agriculture"));
        sellerList.add(new Seller(3L, "Seller 3", "Textile"));
        sellerList.add(new Seller(4L, "Seller 4", "Technology"));
        sellerList.add(new Seller(5L, "Seller 5", "Automotive"));
        return sellerList;
    }

    public List<Invoice> invoiceList() {
        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(new Invoice(1L, 2500, this.sellerList().get(0), this.customerList().get(0)));
        invoiceList.add(new Invoice(2L, 300, this.sellerList().get(1), this.customerList().get(1)));
        invoiceList.add(new Invoice(3L, 200, this.sellerList().get(2), this.customerList().get(2)));
        invoiceList.add(new Invoice(4L, 450, this.sellerList().get(3), this.customerList().get(3)));
        invoiceList.add(new Invoice(5L, 1200, this.sellerList().get(4), this.customerList().get(4)));
        return invoiceList;
    }

}
