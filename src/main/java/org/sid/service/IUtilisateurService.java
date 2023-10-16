package org.sid.service;

import org.sid.entities.Utilisateur;

public interface IUtilisateurService {

	public Utilisateur afficherUtilisateur(String identifiant);
	public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur);
}
