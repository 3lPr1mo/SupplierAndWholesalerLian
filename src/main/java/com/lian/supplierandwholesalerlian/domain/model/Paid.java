package com.lian.supplierandwholesalerlian.domain.model;

public class Paid {
    private Long id;
    private Float pricePaid;
    private Long clientId;

    public Paid(Long id, Float pricePaid, Long clientId) {
        this.id = id;
        this.pricePaid = pricePaid;
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Float pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
