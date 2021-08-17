package com.abdellatif.BackExample.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Developer {
    private final UUID id;
    private final String fName;
    private final String lName;


    public Developer(@JsonProperty("id") UUID id,@JsonProperty("first name") String fName,@JsonProperty("last name") String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public UUID getId() {return id;}

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
