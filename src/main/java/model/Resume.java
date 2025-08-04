package model;

import java.util.UUID;

public class Resume {
    private UUID id;

    private String name;
    private String description;
    private String summary;
    private Education[] educations;
    private Experience[] experiences;
    private String[] languages;
    private String[] projects;
    private String[] certificates;

    public Resume(UUID id, String name, String description, String summary, Education[] educations, Experience[] experiences, String[] languages, String[] projects, String[] certificates) {
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
}
