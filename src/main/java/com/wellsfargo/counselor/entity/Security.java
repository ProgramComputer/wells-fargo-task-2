package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;


    @ManyToOne
    @JoinColumn(name="portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;


    protected Security() {

    }

    public Security(String name, String category, Double purchasePrice, Date purchaseDate) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}

