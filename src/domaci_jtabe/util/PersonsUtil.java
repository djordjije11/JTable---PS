/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domaci_jtabe.util;

import domaci_jtable.domain.City;
import domaci_jtable.domain.Person;
import domaci_jtable.domain.Gender;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Djordjije
 */
public class PersonsUtil {
    public static Collection<Person> getPersons(){
        Collection<Person> persons = new ArrayList();
        persons.add(new Person("Pera", "Peric", LocalDate.of(1966, 2, 15), new City("Beograd", 11000l), Gender.MALE, true, "0123456789123"));
        persons.add(new Person("Zika", "Zikiic", LocalDate.of(1991, 4, 11), new City("Nis", 18000l), Gender.MALE, true, "1123456789123"));
        persons.add(new Person("Jana", "Janic", LocalDate.of(2000, 1, 1), new City("Novi Sad", 21101l), Gender.FEMALE, false, "2123456789123"));
        persons.add(new Person("Milica", "Micic", LocalDate.of(1976, 1, 24), new City("Krusevac", 37000l), Gender.FEMALE, false, "3123456789123"));
        persons.add(new Person("Marko", "Milivojevic", LocalDate.of(2002, 10, 1), new City("Kraljevo", 36000l), Gender.MALE, false, "4123456789123"));
        persons.add(new Person("Janko", "Jankovic", LocalDate.of(1990, 1, 1), new City("Nis", 18000l), Gender.MALE, false, "2123426789123"));
        persons.add(new Person("Mladen", "Mladenovic", LocalDate.of(1946, 10, 4), new City("Kursumlija", 18430l), Gender.MALE, true, "3023456789123"));
        persons.add(new Person("Milena", "Manojlovic", LocalDate.of(1996, 4, 4), new City("Valjevo", 14000l), Gender.FEMALE, false, "8123456789123"));
        return persons;
    }
}
