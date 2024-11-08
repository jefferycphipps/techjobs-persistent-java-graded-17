package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;
import org.launchcode.techjobs.persistent.models.Job;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message = "location cannot be blank")
    @Size(min = 3, max = 100, message = "Must between 3 and 100 characters")
    private String location;


    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private static List<Job> jobs = new ArrayList<>();


    public Employer(){

    }

    public Employer(String someName, String someLocation){
        super();
        this.setName(someName);
        this.location = someLocation;
    }




    public String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank @Size(min = 3, max = 100) String location) {
        this.location = location;
    }
}
