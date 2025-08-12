package com.andresbonilla.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity(name="Experience")
@Table(name="experience")
public class Experience {
    @Id
    private UUID id;
    private String company;
    private String position;
    private String location;
    private Date startDate;
    private Date endDate;

    public Experience(UUID id, String company, String position, String location, Date startDate, Date endDate) {
        this.id = id;
        this.company = company;
        this.position = position;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Experience() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
