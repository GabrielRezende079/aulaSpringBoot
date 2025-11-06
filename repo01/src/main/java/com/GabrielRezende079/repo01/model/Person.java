package com.GabrielRezende079.repo01.model;

import java.io.Serializable;
import java.util.Objects;



public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String FirstName;
    private String LastName;
    private String Address;
    private String Gender;

    // Constructor 
    public Person(){}


    // Getters and Setters
    // ID ---------------------------------------------------------------
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    // First Name --------------------------------------------------------
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }


    // Last Name ---------------------------------------------------------
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        this.LastName = lastName;
    }


    // Address ----------------------------------------------------------
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }


    // Gender -----------------------------------------------------------
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        this.Gender = gender;
    } 

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getAddress(), person.getAddress()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAddress(), getGender());
    }

}
