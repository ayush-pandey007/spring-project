package com.student.studentdetails.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "department")
@Getter
@Setter
public class Department {
    
    @Id
    private Long dept_id;
    private String dept_name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department")
    Set<Student> students;
}
