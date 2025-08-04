package model;

import java.util.Date;
import java.util.UUID;


public class Education {

    private UUID id;
    private String institution;
    private String degreeLevel;
    private String title;
    private String location;
    private Date startDate;
    private Date endDate;

    public Education(UUID id, String institution, String degreeLevel, String title, Date startDate, Date endDate) {
        this.id = id;
        this.institution = institution;
        this.degreeLevel = degreeLevel;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
