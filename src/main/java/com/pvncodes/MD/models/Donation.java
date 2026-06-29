package com.pvncodes.MD.models;

import jakarta.persistence.*;

@Entity
@Table(name = "donations")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String medicineName;
    private String manufacturerName;
    private int quantity;
    private String description;
    private String expiryDate;
    private boolean isAccepted;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
}








//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String medicineName;
//    private String manufacturerName;
//    private int quantity;
//    private String description;
//    private String expiryDate;
//    private boolean isAccepted;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public boolean isAccepted() {
//        return isAccepted;
//    }
//
//    public void setAccepted(boolean isAccepted) {
//        this.isAccepted = isAccepted;
//    }
//}
//










//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String medicineName;
//    private String manufacturerName;
//    private int quantity;
//    private String description;
//    private String expiryDate;
//    private boolean isAccepted;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public boolean isAccepted() {
//        return isAccepted;
//    }
//
//    public void setAccepted(boolean isAccepted) {
//        this.isAccepted = isAccepted;
//    }
//}












//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String medicineName;
//    private String manufacturerName;
//    private int quantity;
//    private String description;
//    private String expiryDate;
//    private boolean isAccepted;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public boolean isAccepted() {
//        return isAccepted;
//    }
//
//    public void setAccepted(boolean isAccepted) {
//        this.isAccepted = isAccepted;
//    }
//}
//









//correct code ***
//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    private String medicineName;
//    private String manufacturerName;
//    private int quantity;
//    private String description;
//    private String expiryDate;
//    private boolean isAccepted;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public boolean getIsAccepted() {
//        return isAccepted;
//    }
//
//    public void setIsAccepted(boolean isAccepted) {
//        this.isAccepted = isAccepted;
//    }
//}











//package com.pvncodes.MD.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    private String medicineName;
//    private String manufacturerName;
//    private int quantity;
//    private String description;
//    private String expiryDate;
//    private boolean isAccepted;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public String getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(String expiryDate) {
//        this.expiryDate = expiryDate;
//    }
//
//    public boolean isAccepted() {
//        return isAccepted;
//    }
//
//    public void setAccepted(boolean isAccepted) {
//        this.isAccepted = isAccepted;
//    }
//}

















//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String firstName;
//    private String lastName;
//    private String address;
//    private String contactNumber;
//    private String email;
//    private String medicineName;
//    private String manufacturerName;
//    private LocalDate manufacturedDate;
//    private LocalDate expiryDate;
//    private Integer quantity;
//    private String description;
//    private Boolean isAccepted = false;
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
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public LocalDate getManufacturedDate() {
//        return manufacturedDate;
//    }
//
//    public void setManufacturedDate(LocalDate manufacturedDate) {
//        this.manufacturedDate = manufacturedDate;
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
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
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
//    public Boolean getIsAccepted() {
//        return isAccepted;
//    }
//
//    public void setIsAccepted(Boolean accepted) {
//        isAccepted = accepted;
//    }
//}
//






















//package com.pvncodes.MD.models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "donations")
//public class Donation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String firstName;
//    private String lastName;
//    private String address;
//    private String contactNumber;
//    private String email;
//    private String medicineName;
//    private String manufacturerName;
//    private LocalDate manufacturedDate;
//    private LocalDate expiryDate;
//    private int quantity;
//    private String description;
//    private boolean isAccepted;
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
//    public String getMedicineName() {
//        return medicineName;
//    }
//
//    public void setMedicineName(String medicineName) {
//        this.medicineName = medicineName;
//    }
//
//    public String getManufacturerName() {
//        return manufacturerName;
//    }
//
//    public void setManufacturerName(String manufacturerName) {
//        this.manufacturerName = manufacturerName;
//    }
//
//    public LocalDate getManufacturedDate() {
//        return manufacturedDate;
//    }
//
//    public void setManufacturedDate(LocalDate manufacturedDate) {
//        this.manufacturedDate = manufacturedDate;
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
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
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
//    public boolean isAccepted() {
//        return isAccepted;
//    }
//
//    public void setAccepted(boolean accepted) {
//        isAccepted = accepted;
//    }
//}
