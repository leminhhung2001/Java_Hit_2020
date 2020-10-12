/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String hoppy;

    public Person() {
        System.out.println(" ");
    }

    public Person(String name, String dateOfBirth, String gender, String hoppy) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.hoppy = hoppy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHoppy() {
        return hoppy;
    }

    public void setHoppy(String hoppy) {
        this.hoppy = hoppy;
    }
    
}
