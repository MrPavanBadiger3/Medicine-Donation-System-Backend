package com.pvncodes.MD.services;

import com.pvncodes.MD.models.Donation;
import com.pvncodes.MD.models.User;
import com.pvncodes.MD.repositories.DonationRepository;
import com.pvncodes.MD.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    @Autowired
    private UserRepository userRepository;

    public Donation saveDonation(Donation donation) {
        // Check if user already exists
        Optional<User> existingUserOptional = userRepository.findByEmail(donation.getUser().getEmail());
        User user = existingUserOptional.orElse(donation.getUser());

        User savedUser = userRepository.save(user);

        donation.setUser(savedUser);
        return donationRepository.save(donation);
    }

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public void deleteDonation(Long id) {
        donationRepository.deleteById(id);
    }

    public Donation acceptDonation(Long id) {
        Optional<Donation> optionalDonation = donationRepository.findById(id);
        if (optionalDonation.isPresent()) {
            Donation donation = optionalDonation.get();
            donation.setIsAccepted(true);
            return donationRepository.save(donation);
        }
        return null;
    }
}










//Source code ****
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setIsAccepted(true);
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}
//








//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.repositories.DonationRepository;
//import com.pvncodes.MD.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Donation saveDonation(Donation donation) {
//        Optional<User> userOptional = userRepository.findById(donation.getUser().getId());
//        if (userOptional.isPresent()) {
//            donation.setUser(userOptional.get());
//            return donationRepository.save(donation);
//        }
//        throw new RuntimeException("User not found");
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        Optional<Donation> donationOptional = donationRepository.findById(id);
//        if (donationOptional.isPresent()) {
//            donationRepository.deleteById(id);
//        } else {
//            throw new RuntimeException("Donation not found");
//        }
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setAccepted(true);
//            return donationRepository.save(donation);
//        }
//        throw new RuntimeException("Donation not found");
//    }
//}
//
//








//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.models.User;
//import com.pvncodes.MD.repositories.DonationRepository;
//import com.pvncodes.MD.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Donation saveDonation(Donation donation) {
//        Optional<User> userOptional = userRepository.findById(donation.getUser().getId());
//        if (userOptional.isPresent()) {
//            donation.setUser(userOptional.get());
//            return donationRepository.save(donation);
//        }
//        throw new RuntimeException("User not found");
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setAccepted(true);
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}
//












//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setAccepted(true);  // Correct method name
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}
//






//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setIsAccepted(true);
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}










//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setAccepted(true);
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}
//













//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Optional<Donation> optionalDonation = donationRepository.findById(id);
//        if (optionalDonation.isPresent()) {
//            Donation donation = optionalDonation.get();
//            donation.setIsAccepted(true);
//            return donationRepository.save(donation);
//        }
//        return null;
//    }
//}

















//// src/main/java/com/pvncodes/MD/services/DonationService.java
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class DonationService {
//
//    private List<Donation> donations = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public Donation saveDonation(Donation donation) {
//        donation.setId(idCounter.incrementAndGet());
//        donations.add(donation);
//        return donation;
//    }
//
//    public List<Donation> getAllDonations() {
//        return donations;
//    }
//
//    public void deleteDonation(Long id) {
//        donations.removeIf(donation -> donation.getId().equals(id));
//    }
//
//    public Donation getDonationById(Long id) {
//        return donations.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Donation donation = getDonationById(id);
//        if (donation != null && donation.getExpiryDate().isAfter(LocalDate.now())) {
//            donation.setAccepted(true);
//        }
//        return donation;
//    }
//}
//
















//// src/main/java/com/pvncodes/MD/services/DonationService.java
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Service
//public class DonationService {
//
//    private List<Donation> donations = new ArrayList<>();
//    private AtomicLong idCounter = new AtomicLong();
//
//    public Donation saveDonation(Donation donation) {
//        donation.setId(idCounter.incrementAndGet());
//        donations.add(donation);
//        return donation;
//    }
//
//    public List<Donation> getAllDonations() {
//        return donations;
//    }
//
//    public void deleteDonation(Long id) {
//        donations.removeIf(donation -> donation.getId().equals(id));
//    }
//
//    public Donation getDonationById(Long id) {
//        return donations.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
//    }
//
//    public Donation acceptDonation(Long id) {
//        Donation donation = getDonationById(id);
//        if (donation != null && donation.getExpiryDate().isAfter(LocalDate.now())) {
//            donation.setAccepted(true);
//        }
//        return donation;
//    }
//}
//


















//
//
//
//package com.pvncodes.MD.services;
//
//import com.pvncodes.MD.models.Donation;
//import com.pvncodes.MD.repositories.DonationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DonationService {
//    @Autowired
//    private DonationRepository donationRepository;
//
//    public Donation saveDonation(Donation donation) {
//        return donationRepository.save(donation);
//    }
//
//    public List<Donation> getAllDonations() {
//        return donationRepository.findAll();
//    }
//
//    public Optional<Donation> findById(Long id) {
//        return donationRepository.findById(id);
//    }
//
//    public void deleteDonation(Long id) {
//        donationRepository.deleteById(id);
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
////package com.pvncodes.MD.services;
////
////import com.pvncodes.MD.models.DonationResponse;
////import com.pvncodes.MD.repositories.DonationRepository;
////import org.springframework.stereotype.Service;
////
////import java.util.List;
////
////@Service
////public class DonationService {
////    private final DonationRepository donationRepository;
////
////    public DonationService(DonationRepository donationRepository) {
////        this.donationRepository = donationRepository;
////    }
////
////    public List<DonationResponse> getAllDonations() {
////        return donationRepository.findAllDonations();
////    }
////}