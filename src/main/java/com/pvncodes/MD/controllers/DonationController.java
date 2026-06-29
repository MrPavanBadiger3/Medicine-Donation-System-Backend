package com.pvncodes.MD.controllers;

import com.pvncodes.MD.models.Donation;
import com.pvncodes.MD.services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping
    public Donation createDonation(@RequestBody Donation donation) {
        return donationService.saveDonation(donation);
    }

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @DeleteMapping("/{id}")
    public void deleteDonation(@PathVariable Long id) {
        donationService.deleteDonation(id);
    }

    @PostMapping("/{id}/accept")
    public Donation acceptDonation(@PathVariable Long id) {
        return donationService.acceptDonation(id);
    }
}





//Source code *****
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public Donation createDonation(@RequestBody Donation donation) {
//        return donationService.saveDonation(donation);
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteDonation(@PathVariable Long id) {
//        donationService.deleteDonation(id);
//    }
//
//    @PostMapping("/{id}/accept")
//    public Donation acceptDonation(@PathVariable Long id) {
//        return donationService.acceptDonation(id);
//    }
//}









//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
//        try {
//            Donation savedDonation = donationService.saveDonation(donation);
//            return new ResponseEntity<>(savedDonation, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDonation(@PathVariable Long id) {
//        try {
//            donationService.deleteDonation(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping("/{id}/accept")
//    public ResponseEntity<Donation> acceptDonation(@PathVariable Long id) {
//        Donation acceptedDonation = donationService.acceptDonation(id);
//        if (acceptedDonation != null) {
//            return new ResponseEntity<>(acceptedDonation, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
//








//
//
//
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
//        try {
//            Donation savedDonation = donationService.saveDonation(donation);
//            return new ResponseEntity<>(savedDonation, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDonation(@PathVariable Long id) {
//        donationService.deleteDonation(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PostMapping("/{id}/accept")
//    public ResponseEntity<Donation> acceptDonation(@PathVariable Long id) {
//        Donation acceptedDonation = donationService.acceptDonation(id);
//        if (acceptedDonation != null) {
//            return new ResponseEntity<>(acceptedDonation, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
//
//









//
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000") // Replace with your frontend origin
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
//        Donation savedDonation = donationService.saveDonation(donation);
//        return new ResponseEntity<>(savedDonation, HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDonation(@PathVariable Long id) {
//        donationService.deleteDonation(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PostMapping("/{id}/accept")
//    public ResponseEntity<Donation> acceptDonation(@PathVariable Long id) {
//        Donation acceptedDonation = donationService.acceptDonation(id);
//        if (acceptedDonation != null) {
//            return new ResponseEntity<>(acceptedDonation, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//}
//





//
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public Donation saveDonation(@RequestBody Donation donation) {
//        return donationService.saveDonation(donation);
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteDonation(@PathVariable Long id) {
//        donationService.deleteDonation(id);
//    }
//
//    @PostMapping("/{id}/accept")
//    public Donation acceptDonation(@PathVariable Long id) {
//        return donationService.acceptDonation(id);
//    }
//}
//





























//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.services.DonationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/donations")
//public class DonationController {
//
//    @Autowired
//    private DonationService donationService;
//
//    @PostMapping
//    public Donation createDonation(@RequestBody Donation donation) {
//        return donationService.saveDonation(donation);
//    }
//
//    @GetMapping
//    public List<Donation> getAllDonations() {
//        return donationService.getAllDonations();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteDonation(@PathVariable Long id) {
//        donationService.deleteDonation(id);
//    }
//
//    @PostMapping("/{id}/accept")
//    public Donation acceptDonation(@PathVariable Long id) {
//        return donationService.acceptDonation(id);
//    }
//}