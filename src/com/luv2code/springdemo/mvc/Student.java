package com.luv2code.springdemo.mvc;
import java.util.*;
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    
    private Map<String, String> options;
    private String favLang;
    private String[] operatingSystem;
    

    public Student() {
        options = new HashMap<>();
        options.put("BR", "Brazil");
        options.put("FR", "France");
        options.put("DE", "Germany");
        options.put("IN", "India");
    }
    
    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }
    
    public Map<String, String> getOptions() {
        return options;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
    
}
