package com.lian.supplierandwholesalerlian.domain.model;

public class Product {
    private Long id;
    private String name;
    private Integer quantity;
    private Float priceSell;
    private Float priceBuy;
    private Long subcategoryId;

    public Product(Long id, String name, Integer quantity, Float priceSell, Float priceBuy, Long subcategoryId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.priceSell = priceSell;
        this.priceBuy = priceBuy;
        this.subcategoryId = subcategoryId;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(Float priceSell) {
        this.priceSell = priceSell;
    }

    public Float getPriceBuy() {
        return priceBuy;
    }

    public void setPriceBuy(Float priceBuy) {
        this.priceBuy = priceBuy;
    }

    public Long getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }
}
