package com.pvncodes.MD.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String password;
    private String role;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}













//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String email;
//    private String firstName;
//    private String lastName;
//    private String address;
//    private String contactNumber;
//    private String password;
//    private String role;
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
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
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
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
//    public String getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(String contactNumber) {
//        this.contactNumber = contactNumber;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}















//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String email;
//    private String password;
//    private String role;
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
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//}






//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String firstName;
//    private String lastName;
//    private String address;
//    private String contactNumber;
//    private String email;
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
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
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
//    public String getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(String contactNumber) {
//        this.contactNumber = contactNumber;
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
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.pvncodes.MD.models;
////
////import jakarta.persistence.Entity;
////import jakarta.persistence.GeneratedValue;
////import jakarta.persistence.GenerationType;
////import jakarta.persistence.Id;
////import jakarta.persistence.Table;
////
////@Entity
////@Table(name = "users")
////public class User {
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////    private String username;
////    private String email;
////    private String password;
////
////    // Getters and setters
////
////    public Long getId() {
////        return id;
////    }
////
////    public void setId(Long id) {
////        this.id = id;
////    }
////
////    public String getUsername() {
////        return username;
////    }
////
////    public void setUsername(String username) {
////        this.username = username;
////    }
////
////    public String getEmail() {
////        return email;
////    }
////
////    public void setEmail(String email) {
////        this.email = email;
////    }
////
////    public String getPassword() {
////        return password;
////    }
////
////    public void setPassword(String password) {
////        this.password = password;
////    }
////}
////
////
//
//
//
//
//
//
//
//
////// src/main/java/com/pvncodes/MD/models/User.java
////package com.pvncodes.MD.models;
////
////public class User {
////    private Long id;
////    private String username;
////    private String email;
////    private String password;
////
////    // Getters and setters
////
////    public Long getId() {
////        return id;
////    }
////
////    public void setId(Long id) {
////        this.id = id;
////    }
////
////    public String getUsername() {
////        return username;
////    }
////
////    public void setUsername(String username) {
////        this.username = username;
////    }
////
////    public String getEmail() {
////        return email;
////    }
////
////    public void setEmail(String email) {
////        this.email = email;
////    }
////
////    public String getPassword() {
////        return password;
////    }
////
////    public void setPassword(String password) {
////        this.password = password;
////    }
////}
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
//////package com.pvncodes.MD.models;
//////
//////import jakarta.persistence.*;
//////
//////@Entity
//////public class User {
//////    @Id
//////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//////    private Long id;
//////
//////    private String firstName;
//////    private String lastName;
//////    private String address;
//////    private String contactNumber;
//////    private String email;
//////    private String password;
//////
//////    // Getters and Setters
//////    public Long getId() {
//////        return id;
//////    }
//////
//////    public void setId(Long id) {
//////        this.id = id;
//////    }
//////
//////    public String getFirstName() {
//////        return firstName;
//////    }
//////
//////    public void setFirstName(String firstName) {
//////        this.firstName = firstName;
//////    }
//////
//////    public String getLastName() {
//////        return lastName;
//////    }
//////
//////    public void setLastName(String lastName) {
//////        this.lastName = lastName;
//////    }
//////
//////    public String getAddress() {
//////        return address;
//////    }
//////
//////    public void setAddress(String address) {
//////        this.address = address;
//////    }
//////
//////    public String getContactNumber() {
//////        return contactNumber;
//////    }
//////
//////    public void setContactNumber(String contactNumber) {
//////        this.contactNumber = contactNumber;
//////    }
//////
//////    public String getEmail() {
//////        return email;
//////    }
//////
//////    public void setEmail(String email) {
//////        this.email = email;
//////    }
//////
//////    public String getPassword() {
//////        return password;
//////    }
//////
//////    public void setPassword(String password) {
//////        this.password = password;
//////    }
//////}
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
////////package com.pvncodes.MD.models;
////////
////////import jakarta.persistence.*;
////////
////////@Entity
////////@Table(name = "users", uniqueConstraints = {
////////        @UniqueConstraint(columnNames = "email")
////////})
////////public class User {
////////    @Id
////////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////////    private Long id;
////////
////////    @Column(nullable = false)
////////    private String firstName;
////////
////////    @Column(nullable = false)
////////    private String lastName;
////////
////////    @Column(nullable = false, unique = true)
////////    private String email;
////////
////////    @Column(nullable = false)
////////    private String password;
////////
////////    private String address;
////////
////////    private String contactNumber;
////////
////////    // Default constructor
////////    public User() {
////////    }
////////
////////    // Constructor with parameters
////////    public User(Long id, String firstName, String lastName, String email, String password, String address, String contactNumber) {
////////        this.id = id;
////////        this.firstName = firstName;
////////        this.lastName = lastName;
////////        this.email = email;
////////        this.password = password;
////////        this.address = address;
////////        this.contactNumber = contactNumber;
////////    }
////////
////////    // Getters and setters
////////    public Long getId() {
////////        return id;
////////    }
////////
////////    public void setId(Long id) {
////////        this.id = id;
////////    }
////////
////////    public String getFirstName() {
////////        return firstName;
////////    }
////////
////////    public void setFirstName(String firstName) {
////////        this.firstName = firstName;
////////    }
////////
////////    public String getLastName() {
////////        return lastName;
////////    }
////////
////////    public void setLastName(String lastName) {
////////        this.lastName = lastName;
////////    }
////////
////////    public String getEmail() {
////////        return email;
////////    }
////////
////////    public void setEmail(String email) {
////////        this.email = email;
////////    }
////////
////////    public String getPassword() {
////////        return password;
////////    }
////////
////////    public void setPassword(String password) {
////////        this.password = password;
////////    }
////////
////////    public String getAddress() {
////////        return address;
////////    }
////////
////////    public void setAddress(String address) {
////////        this.address = address;
////////    }
////////
////////    public String getContactNumber() {
////////        return contactNumber;
////////    }
////////
////////    public void setContactNumber(String contactNumber) {
////////        this.contactNumber = contactNumber;
////////    }
////////}
