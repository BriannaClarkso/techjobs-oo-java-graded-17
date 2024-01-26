package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

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
        this.name= name;
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
//        return getId() == job.getId() && Objects.equals(getName(), job.getName()) && Objects.equals(getEmployer(), job.getEmployer()) && Objects.equals(getLocation(), job.getLocation()) && Objects.equals(getPositionType(), job.getPositionType()) && Objects.equals(getCoreCompetency(), job.getCoreCompetency());
 return id == job.id;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
        return Objects.hash(id);
    }


    @Override
    public String toString() {

        return

                System.lineSeparator()  +
                        "ID: " + getId() + "\n" +
                        "Name: " + (this.name == null ? "Data not available" : this.name) + "\n"  +
//                        "Employer: " + (this.employer == null ? "Data not available" : this.employer) + System.lineSeparator() +
                        "Employer: " + (!Objects.equals(this.getEmployer().getValue(), "") ? this.getEmployer().getValue() : "Data not available") + "\n"  +
                        "Location: " + (this.location == null ? "Data not available" : this.location) + "\n"  +
//                        "Position Type: " + (this.positionType == null ? "Data not available" : this.positionType)+ System.lineSeparator() +
                        "Position Type: " + (!Objects.equals(this.getPositionType().getValue(), "") ? this.getPositionType().getValue() : "Data not available")+ "\n"  +
                        "Core Competency: " + (this.coreCompetency == null ? "Data not available" : this.coreCompetency)
                + System.lineSeparator() ;

//                System.lineSeparator() + "ID: " + getId() + "\n" +
//                        "Name: " + getName() + "\n" +
//                        "Employer: " + getEmployer() + "\n" +
//                        "Location: " + getLocation() + "\n" +
//                        "Position Type: " + getPositionType() + "\n" +
//                        "Core Competency: " + getCoreCompetency() + System.lineSeparator();



//
//
//                        "Position Type: " + (this.getPositionType().getValue() != "" ? this.getPositionType().getValue() : "Data not available")+ System.lineSeparator() +
//

//                "\n" +
//                        "ID: " + this.id + System.lineSeparator() +
//                        "Name: " + (Objects.equals(this.name, "") ? "Data not available" : this.name) + System.lineSeparator() +
//                        "Employer: " + (Objects.equals(this.employer, "") ? "Data not available" : this.employer) + System.lineSeparator() +
//

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
}
