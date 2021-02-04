package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.UtilisateurEntity;
import ma.ac.upf.linequiz.dao.repositories.UtilisateurRepository;
import ma.ac.upf.linequiz.services.businessservices.UtilisateurService;

@Service("utilisateurService")
public class UtilisateurServiceImpl extends CrudServiceImpl<UtilisateurEntity, Long, UtilisateurRepository> implements UtilisateurService {

	@Override
	public Boolean checkAccount(String login, String password) {
		return false;//repository.checkAccount(login, password);
	}

}
