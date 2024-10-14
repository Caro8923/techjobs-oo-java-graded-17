package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private String getId;
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String line = System.lineSeparator();
        String line1;
        String line2;
        String line3;
        String line4;
        String line5;

        if (name != null) {
            line1 = "Name: " + name + line;
        } else {
            line1 =  "Name: Data not available" + line;
        }
        if (employer != null) {
            line2 = "Employer: " + employer + line;
        } else {
            line2 = "Employer: Data not available" + line;
        }

        if (location != null) {
            line3 = "Location: " + location + line;
        } else {
            line3 = "Location: Data not available" + line;
        }

        if (positionType != null) {
            line4 = "Position Type: " + positionType+ line;
        } else {
            line4 = "Position Type: Data not available" + line;
        }

        if (coreCompetency != null) {
            line5 = "Core Competency: " + coreCompetency;
        } else {
            line5 = "Core Competency: Data not available";
        }

        return line +
                "ID: " + id + line +
                line1 +
                line2 +
                line3 +
                line4 +
                line5 + line;

//        return line +
//                "ID: " + id + line +
//                "Name: " + name + line +
//                "Employer: " + employer + line +
//                "Location: " + location+ line +
//                "Position Type: " + positionType+ line +
//                "Core Competency: " + coreCompetency + line;
    }
}
