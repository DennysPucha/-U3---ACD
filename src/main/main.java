/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Builder.Objects.Student;
import Builder.model.StudentBuilder;
import Prototype.model.Teacher;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author dennys
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Student dennys = new Student();
       
       //dennys.setFirstName("dennys");
       //dennys.setLastName("pucha");
       
       //System.out.println(dennys.fullName());
        
        //BUILDER
       
       StudentBuilder builder = new StudentBuilder();
       
       builder.setFirstName("Dennys");
       builder.setLastName("Pucha");
       builder.setSocialEconomicLevel("Clase Media");
       builder.setBirthDay(new Date());
       
       Student dennys = builder.getResult();
       
        //System.out.println(dennys);
    
        
        Teacher jhon = new Teacher();
        
        jhon.setAcademicDegree("Universitario");
        jhon.setBirthdate(new Date());
        jhon.setFirstName("jhon");
        jhon.setLastName("mendez");
        
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        jhon.setUuid(uuid);
        
        System.out.println(jhon);
        
        Teacher copyJhon = (Teacher) jhon.clone();
        
        System.out.println("COPIA DE JHON" + copyJhon);
        
        
    }
    
}
