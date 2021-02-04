package ma.ac.upf.linequiz.controllers.servicescontrollers;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ma.ac.upf.linequiz.dao.entities.ThemeEntity;
import ma.ac.upf.linequiz.services.businessservices.ThemeService;*/
import ma.ac.upf.linequiz.services.businessservices.businessservicesimpl.CrudServiceImpl;

// En cous d'éllaboration
public abstract class CrudServiceController <Id, Entity, Service extends CrudServiceImpl<Entity, Id, CrudRepository<Entity,Id>>> {

/*
	@Autowired
	private Service service;
	
	// Retourne une liste d'objet sous foma JSON
	@GetMapping 
	public List<Entity> getAll() {
		return service.getAll().get();	
	}
	
	@GetMapping("/{id}")
	public Entity getById(@PathVariable String id) {
		If (Id instanceof Integer);
		 Long d;
		return service.getById(Id.parseLong(id)).get();	
	}
	
	@PostMapping("/")
	public void save(@RequestBody Entity obj) {
		service.save(obj);
	}
	
	// Renvoie touts les attributs pour la mise à jour
	@PutMapping("/{id}")
	public void update(@PathVariable String id, @RequestBody Entity obj) {
		service.save(obj);
	}
	*/
	/*
	// Renvoie que les attributs modifié 
	@PatchMapping("/{id}")
	public void liteUpdate(@PathVariable String id, @RequestBody Map obj) {
		//service.save(obj);
	}*/
	/*
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		//service.de(Long.parseLong(id));
	}
	*/
}
