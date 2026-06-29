package com.pvncodes.MD.services;

import com.pvncodes.MD.models.NGO;
import com.pvncodes.MD.repositories.NGORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NGOService {

    @Autowired
    private NGORepository ngoRepository;

    public NGO saveNGO(NGO ngo) {
        return ngoRepository.save(ngo);
    }

    public NGO login(String email, String password) {
        NGO ngo = ngoRepository.findByEmail(email);
        if (ngo != null && ngo.getPassword().equals(password)) {
            return ngo;
        }
        return null;
    }
}





//// src/main/java/com/pvncodes/MD/services/NGOService.java
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.NGO;
//import com.pvncodes.MD.repositories.NGORepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class NGOService {
//
//    @Autowired
//    private NGORepository ngoRepository;
//
//    public NGO saveNGO(NGO ngo) {
//        return ngoRepository.save(ngo);
//    }
//
//    public Optional<NGO> findByEmail(String email) {
//        return Optional.ofNullable(ngoRepository.findByEmail(email));
//    }
//}
//



















//// src/main/java/com/pvncodes/MD/services/NGOService.java
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.NGO;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class NGOService {
//    private List<NGO> ngos = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public NGO saveNGO(NGO ngo) {
//        ngo.setId(idCounter.incrementAndGet());
//        ngos.add(ngo);
//        return ngo;
//    }
//
//    public Optional<NGO> findByEmail(String email) {
//        return ngos.stream().filter(ngo -> ngo.getEmail().equals(email)).findFirst();
//    }
//}
