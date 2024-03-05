package org.example.entity;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String name;
    private String surname;
    private LocalDate registrationDate;

    public Customer(Long id, String name, String surname, LocalDate registrationDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.registrationDate = registrationDate;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
