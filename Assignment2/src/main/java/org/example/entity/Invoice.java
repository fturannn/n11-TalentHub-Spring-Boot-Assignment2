package org.example.entity;

public class Invoice {
    private Long id;
    private double price;
    private Seller seller;
    private Customer customer;

    public Invoice(Long id, double price, Seller seller, Customer customer) {
        this.id = id;
        this.price = price;
        this.seller = seller;
        this.customer = customer;
    }

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
