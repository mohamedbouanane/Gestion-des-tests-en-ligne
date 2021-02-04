package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.CandidatEntity;
import ma.ac.upf.linequiz.dao.entities.UtilisateurEntity;

@Repository("utilisateurRepo")
public interface UtilisateurRepository extends CrudRepository<UtilisateurEntity, Long>{

	//UtilisateurEntity(CandidatEntity candidat, String login, String password) 
	//@Query("SELECT CASE WHEN count(e) > 0 THEN true ELSE false END FROM utilisateur e WHERE e.login = ?1 AND e.login = ?2")
	//Boolean checkAccount(String login, String password);
	
}
