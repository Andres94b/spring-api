package com.andresbonilla.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.UUID;

@Entity(name = "Education")
@Table(name = "education")
public class Education {
    @Id
    private UUID id;
    @Column(name = "institution")
    private String institution;
    private String degreeLevel;
    private String title;
    private String location;
    private Date startDate;
    private Date endDate;

    public Education(UUID id, String institution, String degreeLevel, String title, String location, Date startDate, Date endDate) {
        this.id = id;
        this.institution = institution;
        this.degreeLevel = degreeLevel;
        this.title = title;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Education() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
