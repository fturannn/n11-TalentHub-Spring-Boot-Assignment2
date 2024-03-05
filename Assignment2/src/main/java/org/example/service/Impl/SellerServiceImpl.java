package org.example.service.Impl;

import org.example.entity.Seller;
import org.example.service.SellerService;

import java.util.List;
import java.util.Objects;

public class SellerServiceImpl implements SellerService {

    private final List<Seller> sellerList;

    public SellerServiceImpl(List<Seller> sellerList) {
        this.sellerList = sellerList;
    }

    @Override
    public void save(Seller seller) {
        sellerList.add(seller);
    }

    @Override
    public Seller findById(Long id) {
        return sellerList
                .stream()
                .filter(seller -> Objects.equals(seller.getId(), id)).findFirst().get();
    }

    @Override
    public List<Seller> findAll() {
        return sellerList;
    }
}
