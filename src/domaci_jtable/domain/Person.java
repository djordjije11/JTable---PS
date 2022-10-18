/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domaci_jtable.domain;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Djordjije
 */
public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private City city;
    private Gender gender;
    private boolean married;
    private String jmbg;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthday, City city, Gender gender, boolean married, String jmbg) {
        if(!jmbg.matches("[0-9]{13}"))
            return;
        this.jmbg = jmbg;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.city = city;
        this.gender = gender;
        this.married = married;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public boolean isMarried() {
        return married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }
    public String getJmbg() {
        return jmbg;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.jmbg.equals(person.getJmbg());
    }
}
