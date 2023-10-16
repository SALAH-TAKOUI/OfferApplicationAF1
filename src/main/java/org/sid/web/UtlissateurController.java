package org.sid.web;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.sid.entities.Utilisateur;
import org.sid.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UtlissateurController {

	@Autowired
	private IUtilisateurService utilisateurService;

	@RequestMapping("/*")
	public String index() {
		return "utilisateurs";
	}

	@RequestMapping("/chercherUtilisateur") 
	public String chercherUtilisateur(Model model, String identifiant) {
		model.addAttribute("identifiant", identifiant);
		try {
            Utilisateur u = utilisateurService.afficherUtilisateur(identifiant);
			model.addAttribute("utilisateur", u);

		} catch (Exception e) {
			model.addAttribute("exception", e);
		}

		return "utilisateurs";
	}
    @RequestMapping(value = "/saveUtilisateur", method = RequestMethod.POST)
    public String saveUtilisateur(Model model,String identifiant, String nom, String prenom, String dateNaissance, String telephone,
			String gender, String nationalite) {	
		if(nationalite.equals("french"))
		{
				
				try {
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
					utilisateurService.enregistrerUtilisateur(new Utilisateur(identifiant, nom, prenom,formatter.parse(dateNaissance), telephone, gender, nationalite));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			model.addAttribute("valide", "valide");
			return "redirect:/utilisateurs?status=Inscription valide !";
		}
		else{
			model.addAttribute("error", "error");
			return "redirect:/utilisateurs?error=Inscription que pour Francais";
		}
  
    }
}
