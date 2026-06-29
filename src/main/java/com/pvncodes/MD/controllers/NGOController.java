package com.pvncodes.MD.controllers;

import com.pvncodes.MD.models.NGO;
import com.pvncodes.MD.services.NGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ngos")
public class NGOController {

    @Autowired
    private NGOService ngoService;

    @PostMapping("/register")
    public ResponseEntity<NGO> registerNGO(@RequestBody NGO ngo) {
        NGO savedNGO = ngoService.saveNGO(ngo);
        return ResponseEntity.ok(savedNGO);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginNGO(@RequestBody NGO ngo) {
        NGO loggedInNGO = ngoService.login(ngo.getEmail(), ngo.getPassword());
        if (loggedInNGO != null) {
            return ResponseEntity.ok(loggedInNGO);
        } else {
            return ResponseEntity.badRequest().body("Invalid email or password");
        }
    }
}









//// src/main/java/com/pvncodes/MD/controllers/NGOController.java
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.NGO;
//import com.pvncodes.MD.services.NGOService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/ngos")
//public class NGOController {
//
//    @Autowired
//    private NGOService ngoService;
//
//    @PostMapping("/register")
//    public NGO registerNGO(@RequestBody NGO ngo) {
//        return ngoService.saveNGO(ngo);
//    }
//
//    @PostMapping("/login")
//    public NGO loginNGO(@RequestBody NGO ngo) {
//        return ngoService.findByEmail(ngo.getEmail())
//                .filter(n -> n.getPassword().equals(ngo.getPassword()))
//                .orElse(null);
//    }
//}
