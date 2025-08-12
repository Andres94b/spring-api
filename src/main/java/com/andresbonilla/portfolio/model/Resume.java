package com.andresbonilla.portfolio.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;



@Entity(name = "Resume")
@Table(name = "resume")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "summary")
    private String summary;

    @Column(name = "educations")
    @ManyToMany()
    private ArrayList<Education> educations;

    @Column(name = "experiences")
    @ManyToMany()
    private ArrayList<Experience> experiences;
    @Column(name = "languages")
    @ElementCollection
    private ArrayList<String> languages;

    @Column(name = "projects")
    @ElementCollection
    private ArrayList<String> projects;

    @Column(name = "certificates")
    @ElementCollection
    private ArrayList<String> certificates;

    public Resume(UUID id, String name, String description, String summary, ArrayList<Education> educations, ArrayList<Experience> experiences, ArrayList<String> languages, ArrayList<String> projects, ArrayList<String> certificates) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.summary = summary;
        this.educations = educations;
        this.experiences = experiences;
        this.languages = languages;
        this.projects = projects;
        this.certificates = certificates;
    }

    public Resume() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public ArrayList<String> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<String> projects) {
        this.projects = projects;
    }

    public ArrayList<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<String> certificates) {
        this.certificates = certificates;
    }
}
