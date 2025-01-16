package org.generation.italy.management.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String vatNumber;

    private String address;
    private String city;
    private String postalCode;
    private String province;
    private String country;
    private String phone;
    private String email;
    private String website;
    private String industry;

    @Temporal(TemporalType.DATE)
    private Date foundingDate;
    private BigDecimal annualRevenue;

    public Company(){}

    public Company(Long id, String name, String vatNumber, String address, String city, String postalCode, String province, String country, String phone, String email, String industry, String website, Date foundingDate, BigDecimal annualRevenue) {
        this.id = id;
        this.name = name;
        this.vatNumber = vatNumber;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.industry = industry;
        this.website = website;
        this.foundingDate = foundingDate;
        this.annualRevenue = annualRevenue;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getVatNumber() {
        return vatNumber;
    }
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getIndustry() {
        return industry;
    }
    public void setIndustry(String industry) {
        this.industry = industry;
    }
    public Date getFoundingDate() {
        return foundingDate;
    }
    public void setFoundingDate(Date foundingDate) {
        this.foundingDate = foundingDate;
    }
    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
}
