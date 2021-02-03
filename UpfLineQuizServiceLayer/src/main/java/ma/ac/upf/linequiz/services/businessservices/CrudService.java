package ma.ac.upf.linequiz.services.businessservices;

import java.util.List;
import java.util.Optional;

public interface CrudService <Entity, Id> {

	// Optional : https://www.youtube.com/watch?v=1xCxoOuDZuU
	
	/**
	 * Fetch all objects from database.
	 */
	Optional<List<Entity>> getAll();
	
	/**
	 * Get object from database by id.
	 */
	@SuppressWarnings("unchecked")
	Optional<List<Entity>> getByIds(Id... ids);	
	
	/**
	 * Get object from database by id.
	 */
	Optional<Entity> getById(Id id);	
	
	/**
	 * Preserve / Update objects in database.
	 */
	@SuppressWarnings("unchecked")
	void saveAll(Entity... objs);

	void save(Entity obj);
	
	/**
	 * Delete object from database by id.
	 *//*
	@SuppressWarnings("unchecked")
	void deleteByIds(Id... ids);	
	*/
	/**
	 * Delete list of objects from database.
	 */
	@SuppressWarnings("unchecked")
	void deleteAll(Entity... objs);
	
	/**
	 * Check if object exist in database by id.
	 */
	boolean existsById (Id id);
	
}
