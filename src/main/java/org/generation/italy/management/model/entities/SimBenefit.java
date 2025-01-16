package org.generation.italy.management.model.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "sim_benefits")
public class SimBenefit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    private String simNumber;
    private String planType;
    private String operator;

    public SimBenefit(){}

    public SimBenefit(Long id, Benefit benefit, String simNumber, String planType, String operator) {
        this.id = id;
        this.benefit = benefit;
        this.simNumber = simNumber;
        this.planType = planType;
        this.operator = operator;
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
    public String getSimNumber() {
        return simNumber;
    }
    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }
    public String getPlanType() {
        return planType;
    }
    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
