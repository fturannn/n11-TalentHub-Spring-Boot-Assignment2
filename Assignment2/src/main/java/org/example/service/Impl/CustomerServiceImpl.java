package org.example.service.Impl;

import org.example.entity.Customer;
import org.example.service.CustomerService;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CustomerServiceImpl implements CustomerService {

    private final List<Customer> customerList;

    public CustomerServiceImpl(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        return customerList
                .stream()
                .filter(customer -> Objects.equals(customer.getId(), id)).findFirst().get();
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> findCustomersWithLetterC() {
        return customerList
                .stream()
                .filter(customer -> customer.getName().startsWith("C"))
                .toList();
    }


}
