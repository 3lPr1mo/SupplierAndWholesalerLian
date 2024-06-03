package com.lian.supplierandwholesalerlian.domain.model;

public class Client {
    private Long id;
    private String name;
    private Float priceOwe;

    public Client(Long id, String name, Float priceOwe) {
        this.id = id;
        this.name = name;
        this.priceOwe = priceOwe;
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

    public Float getPriceOwe() {
        return priceOwe;
    }

    public void setPriceOwe(Float priceOwe) {
        this.priceOwe = priceOwe;
    }
}
