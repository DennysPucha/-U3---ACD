/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.model;

import Builder.Objects.AdministrativePersonal;
import java.util.Date;

/**
 *
 * @author dennys
 */
public class AdministrativePersonalBuilder implements Builder{
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String uuid;
    private String charge;
    

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
    
    public void setCharge(String charge){
        this.charge=charge;
    }
    
    @Override
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public AdministrativePersonal getResult(){
        return new AdministrativePersonal(firstName, lastName, birthdate, uuid, charge);
    }


}
