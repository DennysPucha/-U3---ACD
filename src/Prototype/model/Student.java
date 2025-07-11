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
public class Student extends Person {
    
    private String socialEconomicLevel;
    
    public Student(){}
    
    public Student(Student student){
        super(student);
        if(student!=null){
            this.socialEconomicLevel=student.socialEconomicLevel;
        }
    }
    
    public void task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getSocialEconomicLevel() {
        return socialEconomicLevel;
    }

    public void setSocialEconomicLevel(String socialEconomicLevel) {
        this.socialEconomicLevel = socialEconomicLevel;
    }

    @Override
    public Prototype.model.Person clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return super.fullName() + "Student{" + "socialEconomicLevel=" + socialEconomicLevel + '}';
    }
    
    
    
}
