package model;

import java.util.Date;
import java.util.UUID;

public class Experience {
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
}
