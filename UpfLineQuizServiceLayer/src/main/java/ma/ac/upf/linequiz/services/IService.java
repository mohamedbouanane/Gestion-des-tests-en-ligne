package ma.ac.upf.linequiz.services;

import java.util.List;
import java.util.Optional;

public interface IService <T,ID> {

	// Optional : https://www.youtube.com/watch?v=1xCxoOuDZuU
	
	/**
	 * Get object from database by id.
	 */
	Optional<T> getById(ID id);	
	
	/**
	 * Fetch all objects from database.
	 */
	Optional<List<T>> getAll();
	
	/**
	 * Preserve / Update object in database.
	 */
	void save(T obj);	
	
	/**
	 * Preserve list of objects in database.
	 */
	void save(Iterable<T> objs);

	/**
	 * Delete object from database by id.
	 */
	void deleteById(ID id);
	
	/**
	 * Delete object from database.
	 */
	void delete(T obj);
	
	/**
	 * Delete list of objects from database.
	 */
	void deleteAll(Iterable<T> objs);
	
	/**
	 * Check if object exist in database.
	 */
	boolean exists (T obj);
	
	/**
	 * Check if object exist in database by id.
	 */
	boolean existsById (ID id);

}
