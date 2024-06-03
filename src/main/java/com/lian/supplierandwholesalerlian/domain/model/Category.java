package com.lian.supplierandwholesalerlian.domain.model;

public class Category {
    private Long id;
    private String nameCategory;

    public Category(Long id, String nameCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
