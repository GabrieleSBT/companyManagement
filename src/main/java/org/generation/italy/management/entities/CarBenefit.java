package org.generation.italy.management.entities;

import jakarta.persistence.*;



@Entity
@Table(name = "car_benefits")
public class CarBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    private String model;
    private String licensePlate;
    private String type;
    private String color;
    private Integer registrationYear;

    public CarBenefit(){}

    public CarBenefit(Long id, Benefit benefit, String model, String licensePlate, String type, String color, Integer registrationYear) {
        this.id = id;
        this.benefit = benefit;
        this.model = model;
        this.licensePlate = licensePlate;
        this.type = type;
        this.color = color;
        this.registrationYear = registrationYear;
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
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getRegistrationYear() {
        return registrationYear;
    }
    public void setRegistrationYear(Integer registrationYear) {
        this.registrationYear = registrationYear;
    }
}
