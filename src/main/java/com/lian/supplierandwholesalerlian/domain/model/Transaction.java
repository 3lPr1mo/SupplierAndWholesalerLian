package com.lian.supplierandwholesalerlian.domain.model;

import java.util.Date;

public class Transaction {
    private Long id;
    private Long userId;
    private Long typeMovementId;
    private Date date;
    private String comment;

    public Transaction(Long id, Long userId, Long typeMovementId, Date date, String comment) {
        this.id = id;
        this.userId = userId;
        this.typeMovementId = typeMovementId;
        this.date = date;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTypeMovementId() {
        return typeMovementId;
    }

    public void setTypeMovementId(Long typeMovementId) {
        this.typeMovementId = typeMovementId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
