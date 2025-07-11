/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author dennys
 */
public class IES {
    private static IES instance;

    private List<Person> persons;

    private IES() {
        this.persons = new ArrayList<>();
    }

    public static IES getInstance() {
        if (instance == null) {
            instance = new IES();
        }
        return instance;
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public List<Person> listPersons() {
        return persons;
    }

    public Person findByUUID(String uuid) {
        return persons.stream()
                .filter(p -> p.getUuid().equals(uuid))
                .findFirst()
                .orElse(null);
    }
}