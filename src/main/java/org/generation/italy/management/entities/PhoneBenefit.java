package org.generation.italy.management.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "phone_benefits")
public class PhoneBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    private String phoneNumber;
    private String type;
    private String brand;
    private String model;

    public PhoneBenefit(){}

    public PhoneBenefit(Long id, Benefit benefit, String phoneNumber, String type, String brand, String model) {
        this.id = id;
        this.benefit = benefit;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Benefit getBenefit() {
        return benefit;
    }
    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
