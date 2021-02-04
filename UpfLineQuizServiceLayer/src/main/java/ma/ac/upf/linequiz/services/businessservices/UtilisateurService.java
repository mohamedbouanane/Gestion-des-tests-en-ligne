package ma.ac.upf.linequiz.services.businessservices;

import ma.ac.upf.linequiz.dao.entities.UtilisateurEntity;

public interface UtilisateurService extends CrudService<UtilisateurEntity ,Long> {

	
	Boolean checkAccount(String login, String password);
	
}
