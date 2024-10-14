package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
public class Skill extends AbstractEntity {


    @NotBlank
    @Size(min = 3, max = 50)
    public String description;


    public Skill(){

    }
}
