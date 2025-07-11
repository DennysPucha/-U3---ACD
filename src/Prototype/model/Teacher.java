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
public class Teacher extends Person {
    
    private String academicDegree;
    
    public Teacher(){}
    
    public Teacher(Teacher teacher){
        super(teacher);
        if(teacher!=null){
            this.academicDegree=teacher.academicDegree;
        }
    }
    
    
    
    @Override
    public void task() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public Prototype.model.Person clone() {
        return new Teacher(this);
    }

    @Override
    public String toString() {
        return super.fullName()+ "Teacher{" + "academicDegree=" + academicDegree + '}';
    }
    
}
