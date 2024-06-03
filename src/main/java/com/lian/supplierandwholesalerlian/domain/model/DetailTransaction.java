package com.lian.supplierandwholesalerlian.domain.model;

public class DetailTransaction {
    private Long id;
    private Long transactionId;
    private Long productId;
    private Integer quantity;
    private Long clientId;

    public DetailTransaction(Long id, Long transactionId, Long productId, Integer quantity, Long clientId) {
        this.id = id;
        this.transactionId = transactionId;
        this.productId = productId;
        this.quantity = quantity;
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
