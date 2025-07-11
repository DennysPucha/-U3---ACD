/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype.model;

import model.*;

/**
 *
 * @author dennys
 */
public class AdministrativePersonal extends Person {
    
    private String charge;
    
    public AdministrativePersonal(){}
    
    
    public AdministrativePersonal(AdministrativePersonal ad){
        super(ad);
        
        if(ad!=null){
            this.charge=ad.charge;
        }
    }
    
    
    @Override
    public void task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "AdministrativePersonal{" + "charge=" + charge + '}';
    }

    @Override
    public Prototype.model.Person clone() {
        return new AdministrativePersonal(this);
    }
    
    
    
    
}
