package com.pvncodes.MD.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ngos")
public class NGO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String organizationName;
    private String dateOfEstablishment;
    private String address;
    private String phoneNumber;
    private String email;
    private String headName;
    private String password;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(String dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



















//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "ngos")
//public class NGO {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String organizationName;
//    private String dateOfEstablishment;
//    private String address;
//    private String phoneNumber;
//    private String email;
//    private String headName;
//    private String password;
//
//    // Getters and setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getOrganizationName() {
//        return organizationName;
//    }
//
//    public void setOrganizationName(String organizationName) {
//        this.organizationName = organizationName;
//    }
//
//    public String getDateOfEstablishment() {
//        return dateOfEstablishment;
//    }
//
//    public void setDateOfEstablishment(String dateOfEstablishment) {
//        this.dateOfEstablishment = dateOfEstablishment;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getHeadName() {
//        return headName;
//    }
//
//    public void setHeadName(String headName) {
//        this.headName = headName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
//






















//// src/main/java/com/pvncodes/MD/models/NGO.java
//package com.pvncodes.MD.models;
//
//public class NGO {
//    private Long id;
//    private String organizationName;
//    private String dateOfEstablishment;
//    private String address;
//    private String phoneNumber;
//    private String email;
//    private String headName;
//    private String password;
//
//    // Getters and setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getOrganizationName() {
//        return organizationName;
//    }
//
//    public void setOrganizationName(String organizationName) {
//        this.organizationName = organizationName;
//    }
//
//    public String getDateOfEstablishment() {
//        return dateOfEstablishment;
//    }
//
//    public void setDateOfEstablishment(String dateOfEstablishment) {
//        this.dateOfEstablishment = dateOfEstablishment;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getHeadName() {
//        return headName;
//    }
//
//    public void setHeadName(String headName) {
//        this.headName = headName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
