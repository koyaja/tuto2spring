package com.atsdev.tuto2spring;

import com.atsdev.tuto2spring.domaine.Employe;
import com.atsdev.tuto2spring.services.EmployesService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tuto2springApplication  implements CommandLineRunner{
private final EmployesService employesService;

	public Tuto2springApplication(EmployesService employesService) {
		this.employesService = employesService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Tuto2springApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Employe a1 = new Employe("KOMACLO", "Jacques","66895585",22);
		Employe a2 = new Employe("Employe1", "Employe1","66895585",22);
		Employe a3 = new Employe("Employe2", "Employe2","66895585",22);
		System.out.println(".................Add new employe .....................");
		System.out.println ("Employe info "+employesService.save(a1));
		System.out.println ("Employe info "+employesService.save(a2));
		System.out.println ("Employe info "+employesService.save(a3));
		System.out.println(".................Lists employe .....................");
		 employesService.getAllEmploye().forEach(employe -> {
		 	System.out.println("Nom : " + employe.getFistName() +" \t Age "+ employe.getAge());
		 });

	}
}
