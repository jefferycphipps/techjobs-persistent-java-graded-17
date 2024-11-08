package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "description cannot be blank")
    @Size(min = 3, max = 200, message = "Must between 3 and 200 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    @JoinColumn
    private static List<Job> jobs = new ArrayList<>();

    public Skill(){

    }

    public Skill(String someName, String someDescription){
        super();
        this.setName(someName);
        this.description = someDescription;
    }

    public static List<Job> getJobs() {
        return jobs;
    }

    public static void setJobs(List<Job> jobs) {
        Skill.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank @Size(min = 3, max = 200) String description) {
        this.description = description;
    }
}
