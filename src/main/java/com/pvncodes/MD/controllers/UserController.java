package com.pvncodes.MD.controllers;

import com.pvncodes.MD.models.User;
import com.pvncodes.MD.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public Map<String, String> loginUser(@RequestBody User user) {
        Optional<User> optionalUser = userService.findByEmail(user.getEmail());
        Map<String, String> response = new HashMap<>();
        if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(user.getPassword())) {
            User loggedInUser = optionalUser.get();
            response.put("role", loggedInUser.getRole());
            response.put("email", loggedInUser.getEmail());
        } else {
            response.put("error", "Invalid email or password");
        }
        return response;
    }

    @GetMapping("/role")
    public Map<String, String> getUserRole(@RequestParam String email) {
        Optional<User> optionalUser = userService.findByEmail(email);
        Map<String, String> response = new HashMap<>();
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            response.put("role", user.getRole());
        } else {
            response.put("error", "User not found");
        }
        return response;
    }
}














//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public User registerUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @PostMapping("/login")
//    public Map<String, String> loginUser(@RequestBody User user) {
//        Optional<User> optionalUser = userService.findByEmail(user.getEmail())
//                .filter(u -> u.getPassword().equals(user.getPassword()));
//        Map<String, String> response = new HashMap<>();
//        if (optionalUser.isPresent()) {
//            User loggedInUser = optionalUser.get();
//            response.put("role", loggedInUser.getRole());
//            response.put("email", loggedInUser.getEmail());
//        } else {
//            response.put("error", "Invalid email or password");
//        }
//        return response;
//    }
//
//    @GetMapping("/role")
//    public Map<String, String> getUserRole(@RequestParam String email) {
//        Optional<User> optionalUser = userService.findByEmail(email);
//        Map<String, String> response = new HashMap<>();
//        if (optionalUser.isPresent()) {
//            User user = optionalUser.get();
//            response.put("role", user.getRole());
//        } else {
//            response.put("error", "User not found");
//        }
//        return response;
//    }
//}
//














//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public User registerUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @PostMapping("/login")
//    public User loginUser(@RequestBody User user) {
//        return userService.findByEmail(user.getEmail())
//                .filter(u -> u.getPassword().equals(user.getPassword()))
//                .orElse(null);
//    }
//}



















//// src/main/java/com/pvncodes/MD/controllers/UserController.java
//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public User registerUser(@RequestBody User user) {
//        return userService.saveUser(user);
//    }
//
//    @PostMapping("/login")
//    public User loginUser(@RequestBody User user) {
//        return userService.findByEmail(user.getEmail())
//                .filter(u -> u.getPassword().equals(user.getPassword()))
//                .orElse(null);
//    }
//}
//
//


















//package com.pvncodes.MD.controllers;
//
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<User> registerUser(@RequestBody User user) {
//        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<User> loginUser(@RequestBody User user) {
//        Optional<User> foundUser = userService.findByEmail(user.getEmail());
//        if (foundUser.isPresent() && foundUser.get().getPassword().equals(user.getPassword())) {
//            return new ResponseEntity<>(foundUser.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
//    }
//
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.findAllUsers();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable Long id) {
//        Optional<User> user = userService.findById(id);
//        if (user.isPresent()) {
//            return new ResponseEntity<>(user.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//}
