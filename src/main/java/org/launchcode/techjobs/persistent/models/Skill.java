package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "description cannot be blank")
    @Size(min = 3, max = 200, message = "Must between 3 and 200 characters")
    public String description;


    public Skill(){

    }

    public Skill(String someName, String someDescription){
        super();
        this.setName(someName);
        this.description = someDescription;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank @Size(min = 3, max = 200) String description) {
        this.description = description;
    }
}
