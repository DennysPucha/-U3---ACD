/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.Date;
import java.util.UUID;
import model.Person;
import model.Student;

/**
 *
 * @author dennys
 */
public class main {
    public static void main(String[] args) {
        IES ies = IES.getInstance();

        Student student = new Student();
        student.setFirstName("Dennys");
        student.setLastName("Pucha");
        student.setBirthdate(new Date());
        student.setUuid(UUID.randomUUID().toString());
        student.setSocialEconomicLevel("Bajo");

        ies.addPerson(student);

        System.out.println("Personas registradas:");
        for (Person p : ies.listPersons()) {
            System.out.println(p.fullName() + " - " + p.getClass().getSimpleName());
        }
    }
}
