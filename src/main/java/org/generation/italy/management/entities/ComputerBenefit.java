package org.generation.italy.management.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "computer_benefits")
public class ComputerBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    private String model;
    private String brand;
    private String type;
    private String operatingSystem;
    private String configuration;

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
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getConfiguration() {
        return configuration;
    }
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
