/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.model;

import model.*;
import java.util.Date;

/**
 *
 * @author dennys
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String uuid;
    
    public Person(){}
    
    public Person(Person person){
        if(person != null){
            this.firstName= person.firstName;
            this.lastName = person.lastName;
            this.birthdate = person.birthdate;
            this.uuid = person.uuid;
        }
    }
    
    
    public String fullName(){
        return this.firstName + " " + this.lastName + "{uuid:" + this.uuid +"}";
    }
    
    public abstract void task();
    
    @Override
    public abstract Person clone();

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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    
}

