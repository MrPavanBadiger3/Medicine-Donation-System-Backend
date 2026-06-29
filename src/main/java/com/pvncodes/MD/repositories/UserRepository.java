package com.pvncodes.MD.repositories;

import com.pvncodes.MD.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}












//package com.pvncodes.MD.repositories;
//
////import com.pvncodes.MD.models.User;
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.stereotype.Repository;
////
////import java.util.List;
////
////@Repository
////public interface UserRepository extends JpaRepository<User, Long> {
////    List<User> findByEmail(String email);
////}
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
////package com.pvncodes.MD.repositories;
////
////import com.pvncodes.MD.models.User;
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.stereotype.Repository;
////
////@Repository
////public interface UserRepository extends JpaRepository<User, Long> {
////    User findByEmail(String email);
////}
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
////package com.pvncodes.MD.repositories;
////
////import com.pvncodes.MD.models.User;
////import org.springframework.data.jpa.repository.JpaRepository;
////import org.springframework.stereotype.Repository;
////
////@Repository
////public interface UserRepository extends JpaRepository<User, Long> {
////    User findByEmail(String email);
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
//////package com.pvncodes.MD.repositories;
//////
//////import com.pvncodes.MD.models.User;
//////import org.springframework.data.jpa.repository.JpaRepository;
//////import org.springframework.stereotype.Repository;
//////
//////import java.util.Optional;
//////
//////@Repository
//////public interface UserRepository extends JpaRepository<User, Long> {
//////    Optional<User> findByEmail(String email);
//////}
