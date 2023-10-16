package org.sid.service;

import org.sid.dao.UtilisateurRepository;
import org.sid.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UtilisateurService implements IUtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur afficherUtilisateur(String identifiant) {
		Utilisateur u =utilisateurRepository.findByIdentifiant(identifiant);
		if(u==null) throw new RuntimeException("Utilisateur introuvable !");
		return u;
		 
	}

	@Override
	public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
		
		return utilisateurRepository.save(utilisateur);
	}

}
