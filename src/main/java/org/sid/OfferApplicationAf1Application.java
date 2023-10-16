package org.sid;

import java.util.Date;

import org.sid.dao.UtilisateurRepository;
import org.sid.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class OfferApplicationAf1Application implements CommandLineRunner {

	@Autowired
	private UtilisateurRepository utilisateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(OfferApplicationAf1Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws  Exception {
		utilisateurRepository.save(new Utilisateur("1237AFKLM","TAKOUI","SALAH-EDDINE",new Date("04/07/1994"), "+33619230666", "M", "FRANCE"));
		//System.out.println("IDENTIFIANT : "+utilisateurRepository.findByIdentifiant("1237AFKLM").getIdentifiant());
	}
	

}
