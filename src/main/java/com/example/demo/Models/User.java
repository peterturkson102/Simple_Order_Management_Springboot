package com.example.demo.Models;

import javax.persistence.*;

@Entity
//Users
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String orderId;
    @Column
    private String occupation;

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }






    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

}
