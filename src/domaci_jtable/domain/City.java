/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domaci_jtable.domain;

/**
 *
 * @author Djordjije
 */
public class City {
    private String name;
    private Long zipcode;

    public City() {
    }

    public City(String name, Long zipcode) {
        this.name = name;
        this.zipcode = zipcode;
    }
    
    

    @Override
    public String toString() {
        return getName() + ", " + getZipcode();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the zipcode
     */
    public Long getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }
}
