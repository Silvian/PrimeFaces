package com.silvian.user;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by silvian on 04/06/2014.
 */
public class User implements Serializable{

    private String firstname;

    private String lastname;

    private Date dob;

    private String street;

    private String city;

    private String postalCode;

    private String info;

    private String email;

    private String phone;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return calculateAge();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer calculateAge() {
        Date dob = this.getDob();
        int age;

        if(dob != null) {
            Date currentDate = new Date(System.currentTimeMillis());
            age = currentDate.getYear() - dob.getYear();
            return age;
        }

        return 0;
    }

}
