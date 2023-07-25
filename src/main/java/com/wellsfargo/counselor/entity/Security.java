package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class Security {

    @Id
    @GeneratedValue
    long securityID;

    @ManyToOne
    @JoinColumn(name = "portfolioID")
    long portfolioID;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String category;

    @Column(nullable = false)
    long purchasePrice;

    @Column(nullable = false)
    Timestamp purchaseDate;

    @Column(nullable = false)
    long quantity;

    protected Security() {

    }
    public Security(long securityID, long portfolioID, String name, String category, long purchasePrice, Timestamp purchaseDate, long quantity){
        this.securityID = securityID;
        this.portfolioID = portfolioID;
        this.name= name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    //setters
    public void setSecurityID(long securityID) {
        this.securityID = securityID;
    }

    public void setPortfolioID(long portfolioID) {
        this.portfolioID = portfolioID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    //getters

    public long getSecurityID() {
        return securityID;
    }

    public long getPortfolioID() {
        return portfolioID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public long getQuantity() {
        return quantity;
    }


}
