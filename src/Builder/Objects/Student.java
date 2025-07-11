/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder.Objects;

import java.util.Date;

/**
 *
 * @author dennys
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final Date birthdate;
    private final String uuid;
    private final String socialEconomicLevel;

    public Student(String firstName, String lastName, Date birthdate, String uuid, String socialEconomicLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.uuid = uuid;
        this.socialEconomicLevel = socialEconomicLevel;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate + ", uuid=" + uuid + ", socialEconomicLevel=" + socialEconomicLevel + '}';
    }
    
    
}
