package com.pvncodes.MD.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String manufacturer;
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    private String description;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}





















//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
//import java.time.LocalDate;
//
//@Entity
//public class Medicine {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String manufacturer;
//    private LocalDate manufactureDate;
//    private LocalDate expiryDate;
//    private String description;
//    private int quantity;
//
//    public Medicine() {
//    }
//
//    public Medicine(Long id, String name, String manufacturer, LocalDate manufactureDate, LocalDate expiryDate, String description, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.manufacturer = manufacturer;
//        this.manufactureDate = manufactureDate;
//        this.expiryDate = expiryDate;
//        this.description = description;
//        this.quantity = quantity;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getManufacturer() {
//        return manufacturer;
//    }
//
//    public void setManufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public LocalDate getManufactureDate() {
//        return manufactureDate;
//    }
//
//    public void setManufactureDate(LocalDate manufactureDate) {
//        this.manufactureDate = manufactureDate;
//    }
//
//    public LocalDate getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(LocalDate expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//}
