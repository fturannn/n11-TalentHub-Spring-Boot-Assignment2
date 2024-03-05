package org.example.service;

import org.example.entity.Seller;

import java.util.List;

public interface SellerService {

    void save(Seller seller);
    Seller findById(Long id);
    List<Seller> findAll();
}
