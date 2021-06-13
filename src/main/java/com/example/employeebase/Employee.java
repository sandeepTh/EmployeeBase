package com.example.employeebase;

import javax.persistence.*;


@Entity
@Table(name="Employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String firstName;
private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
