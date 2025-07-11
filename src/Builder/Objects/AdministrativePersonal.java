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
public class AdministrativePersonal {
    private final String firstName;
    private final String lastName;
    private final Date birthdate;
    private final String uuid;
    private final String charge;

    public AdministrativePersonal(String firstName, String lastName, Date birthdate, String uuid, String charge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.uuid = uuid;
        this.charge = charge;
    }
    
    
}
