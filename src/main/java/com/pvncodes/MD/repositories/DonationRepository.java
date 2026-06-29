package com.pvncodes.MD.repositories;

import com.pvncodes.MD.models.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}










//package com.pvncodes.MD.repositories;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DonationRepository extends JpaRepository<Donation, Long> {
//}














//package com.pvncodes.MD.repositories;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface DonationRepository extends JpaRepository<Donation, Long> {
//}
//










//package com.pvncodes.MD.repositories;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface DonationRepository extends JpaRepository<Donation, Long> {
//}
//









//package com.pvncodes.MD.repositories;
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DonationRepository extends JpaRepository<Donation, Long> {
//}
//












//
//package com.pvncodes.MD.repositories;
//
//
//import com.pvncodes.MD.models.Donation;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface DonationRepository extends JpaRepository<Donation, Long> {
//}

















//package com.pvncodes.MD.repositories;
//
//import com.pvncodes.MD.models.DonationResponse;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface DonationRepository extends JpaRepository<DonationResponse, Long> {
//    @Query("SELECT new com.pvncodes.MD.models.DonationResponse(" +
//            "u.firstName AS userFirstName, " +
//            "u.lastName AS userLastName, " +
//            "u.contactNumber AS userContactNumber, " +
//            "u.address AS userAddress, " +
//            "m.name AS medicineName, " +
//            "m.manufactureDate AS medicineManufactureDate, " +
//            "m.expiryDate AS medicineExpiryDate, " +
//            "m.manufacturer AS medicineManufacturer, " +
//            "d.quantity AS quantity, " +
//            "m.description AS medicineDescription) " +
//            "FROM Donation d " +
//            "JOIN d.user u " +
//            "JOIN d.medicine m")
//    List<DonationResponse> findAllDonations();
//}