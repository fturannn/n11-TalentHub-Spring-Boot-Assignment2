package org.example.entity;

public class Seller {
    private Long id;
    private String name;
    private String sectorName;

    public Seller(Long id, String name, String sectorName) {
        this.id = id;
        this.name = name;
        this.sectorName = sectorName;
    }

    public Seller() {
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

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
