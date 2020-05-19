package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String value;
  //  private int counter=0;

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

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        //if (!super.equals(o)) return false;
        Job job = (Job) o;
        //return getId() == job.getId();
        return id == job.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString(){


        //check if a Job only contains data for the id field and rest are blank... return"OOPS!This job does not seem to exist"
        if(this.getName().isEmpty() && this.getEmployer().getValue().isEmpty() && this.getLocation().getValue().isEmpty() && this.getPositionType().getValue().isEmpty() && this.getCoreCompetency().getValue().isEmpty()){
            value= "OOPS! This job does not seem to exist.";
        }else {

            //check if any field is empty and add "Data not available" after the label
            if (this.getName().isEmpty()) {
                this.setName("Data not available");
            }
            if(this.getEmployer().getValue().isEmpty()) {
                this.getEmployer().setValue("Data not available");
            }
            if(this.getLocation().getValue().isEmpty()) {
                this.getLocation().setValue("Data not available");
            }
            if(this.getPositionType().getValue().isEmpty()) {
                this.getPositionType().setValue("Data not available");
            }
            if(this.getCoreCompetency().getValue().isEmpty()){
                this.getCoreCompetency().setValue("Data not available");
            }
            //returning a string to display for each Job including \n in the beginning and ending
            value = "\nID:" + this.getId() + "\nName:" + this.getName() + "\nEmployer:" + this.getEmployer().getValue() + "\nLocation:" + this.getLocation().getValue() + "\nPosition Type:" + this.getPositionType().getValue() + "\nCore Competency:" + this.getCoreCompetency().getValue() + "\n";
        }

        return value;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

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
}
