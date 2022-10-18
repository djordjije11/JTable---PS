/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domaci_jtable.ui;

import domaci_jtable.domain.City;
import domaci_jtable.domain.Gender;
import domaci_jtable.domain.Person;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Djordjije
 */
public class MyTableModel extends AbstractTableModel {

    private List<Person> persons;
    private final String[] columnNames = {"First name", "Last name", "Birthday", "City", "Gender", "Married", "JMBG"};
    private final Class[] columnTypes = {String.class, String.class, LocalDate.class, City.class, Gender.class, Boolean.class, String.class};
    
    public MyTableModel(Collection<Person> persons){
        this.persons = (List<Person>) persons;
    }
    
    @Override
    public int getRowCount() {
        if(persons == null) return 0;
        return persons.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = persons.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return person.getFirstName();
            case 1:
                return person.getLastName();
            case 2:
                return person.getBirthday();
            case 3:
                return person.getCity();
            case 4:
                return person.getGender();
            case 5:
                return person.isMarried();
            case 6:
                return person.getJmbg();
            default:
                return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnTypes[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0 || columnIndex == 1 || columnIndex == 5) return true;
        else return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Person person = persons.get(rowIndex);
        switch (columnIndex) {
            case 0:
                if(aValue.toString().matches("[A-Z][a-z]*")){
                    person.setFirstName(aValue.toString());
                }
                break;
            case 1:
                if(aValue.toString().matches("[A-Z][a-z]*")){
                    person.setLastName(aValue.toString());   
                }
                break;
            case 5:
                person.setMarried((Boolean) aValue);
                break;
        }
    }
    
    public void addPerson(Person person){
        persons.add(person);
        fireTableDataChanged();
    }
    
    public boolean personExists(Person person){
        return persons.contains(person);
    }
    
    public void removePerson(int rowIndex){
        persons.removeIf(person -> person.getJmbg().equals(getValueAt(rowIndex, 6).toString()));
        fireTableDataChanged();
    }
}