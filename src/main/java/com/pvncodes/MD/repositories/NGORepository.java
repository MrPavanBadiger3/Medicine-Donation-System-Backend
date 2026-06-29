// src/main/java/com/pvncodes/MD/repositories/NGORepository.java
package com.pvncodes.MD.repositories;

import com.pvncodes.MD.models.NGO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NGORepository extends JpaRepository<NGO, Long> {
    NGO findByEmail(String email);
}
