/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.model;

import Builder.Objects.Student;
import java.util.Date;

/**
 *
 * @author dennys
 */
public class StudentBuilder implements Builder{
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String uuid;
    private String socialEconomicLevel;
    

    @Override
    public void Reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    @Override
    public void setBirthDay(Date fecha) {
        this.birthdate = fecha;
    }

    @Override
    public void setUUID(String uuid) {
        this.uuid= uuid;
    }
    
    public void setSocialEconomicLevel(String socialEconomicLevel){
        this.socialEconomicLevel= socialEconomicLevel;
    }

    @Override
    public String fullName(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Student getResult(){
        return new Student(firstName, lastName, birthdate, uuid, socialEconomicLevel);
    }
}
