/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domaci_jtable.domain;

/**
 *
 * @author Djordjije
 */
public enum Gender {
    MALE,
    FEMALE;
    
    @Override    
    public String toString() {
        return super.toString().toLowerCase();
    }
}
