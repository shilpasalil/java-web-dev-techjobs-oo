package org.launchcode.techjobs_oo;
import java.util.Objects;


public class PositionType {
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString(){ return valure; }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
       // if (!super.equals(o)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    public int hashCode() {
       // return java.util.Objects.hash(super.hashCode(), getId());
        return Objects.hash(getId());
    }
    
    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
