package com.atsdev.tuto2spring.services;

import com.atsdev.tuto2spring.domaine.Employe;
import com.atsdev.tuto2spring.repository.EmployeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployesService {


    private final EmployeRepository employeRepository;

    public EmployesService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public Employe save(Employe employe){
        return employeRepository.save(employe);
    }

   public List<Employe> getAllEmploye(){
        return employeRepository.findAll();
    }
}
