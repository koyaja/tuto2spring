package com.atsdev.tuto2spring.repository;

import com.atsdev.tuto2spring.domaine.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
