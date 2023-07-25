package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.sql.Timestamp;

@Entity
class Portfolio {

    @Id
    @GeneratedValue
    long portfolioID;

    @ManyToOne
    @JoinColumn(name = "clientID")
    long clientID;

    @Column(nullable = false)
    Timestamp CreationDate;

    protected Portfolio() {

    }
    public Portfolio(long clientID, Timestamp CreationDate){
        this.clientID = clientID;
        this.CreationDate = CreationDate;
    }

    //getters
    public Long getPortfolioId() {
        return portfolioID;
    }

    public Long getClientId() {
        return clientID;
    }
    public Timestamp getCreationDate() {
        return CreationDate;
    }

    //setters
    public void setCreationDate(Timestamp CreationDate) {
        this.CreationDate = CreationDate;
    }

    public void setClientId(long id) {
        this.clientId = id;
    }

}
