/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder.model;

import java.util.Date;

/**
 *
 * @author dennys
 */
public interface Builder {
    void Reset();
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setBirthDay(Date fecha);
    void setUUID(String uuid);
    
    public String fullName();
    public void task();
}
