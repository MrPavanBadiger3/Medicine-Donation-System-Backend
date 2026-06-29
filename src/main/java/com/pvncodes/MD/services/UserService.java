package com.pvncodes.MD.services;

import com.pvncodes.MD.models.User;
import com.pvncodes.MD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        // Set default role to 'user' if not provided
        if (user.getRole() == null) {
            user.setRole("user");
        }
        return userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}










//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User saveUser(User user) {
//        // Set default role to 'user' if not provided
//        if (user.getRole() == null) {
//            user.setRole("user");
//        }
//        return userRepository.save(user);
//    }
//
//    public User findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }
//}










//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.User;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class UserService {
//    private List<User> users = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public User saveUser(User user) {
//        user.setId(idCounter.incrementAndGet());
//        // Set default role to 'user' if not provided
//        if (user.getRole() == null) {
//            user.setRole("user");
//        }
//        users.add(user);
//        return user;
//    }
//
//    public Optional<User> findByEmail(String email) {
//        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
//    }
//}













//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.User;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class UserService {
//    private List<User> users = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public User saveUser(User user) {
//        user.setId(idCounter.incrementAndGet());
//        users.add(user);
//        return user;
//    }
//
//    public Optional<User> findByEmail(String email) {
//        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
//    }
//}

















//// src/main/java/com/pvncodes/MD/services/UserService.java
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.User;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class UserService {
//    private List<User> users = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public User saveUser(User user) {
//        user.setId(idCounter.incrementAndGet());
//        users.add(user);
//        return user;
//    }
//
//    public Optional<User> findByEmail(String email) {
//        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
//    }
//}
