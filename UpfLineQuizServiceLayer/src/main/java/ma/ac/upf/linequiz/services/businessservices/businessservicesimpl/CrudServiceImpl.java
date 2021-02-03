package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import ma.ac.upf.linequiz.services.businessservices.CrudService;

// Generic type java Doc -> https://www.journaldev.com/1663/java-generics-example-method-class-interface
public abstract class CrudServiceImpl <Entity, Id, Repository extends CrudRepository<Entity, Id>> implements CrudService <Entity, Id> {

	@Autowired
	private Repository crudRepository;
	
	@Override
	public Optional<List<Entity>> getAll() {
		List<Entity> itemsCollection = new ArrayList<>();
		
		Iterable<Entity> itemsIterable = crudRepository.findAll();
		Iterator<Entity> itemsIterator = itemsIterable.iterator();
		
		while(itemsIterator.hasNext())
			itemsCollection.add(itemsIterator.next());
		
		//repository.findAll().forEach(itemsCollection::add);
		
		return Optional.ofNullable(itemsCollection);
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public Optional<List<Entity>> getByIds(Id... ids) {
		List<Entity> itemsCollection = new ArrayList<>();
		Iterable<Entity> itemsIterable = crudRepository.findAllById(Arrays.asList(ids));
		Iterator<Entity> itemsIterator = itemsIterable.iterator();
		
		while(itemsIterator.hasNext())
			itemsCollection.add(itemsIterator.next());
		
		return Optional.ofNullable(itemsCollection);
	}
	
	@Override
	public Optional<Entity> getById(Id id) {
		//return Optional.ofNullable(repository.findById(id));
		return Optional.ofNullable(null);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void saveAll(Entity... objs) {
		crudRepository.saveAll(Arrays.asList(objs));
	}

	@Override
	public void save(Entity obj) {
		crudRepository.save(obj);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void deleteAll(Entity... objs) {
		crudRepository.deleteAll(Arrays.asList(objs));
	}

	@Override
	public boolean existsById(Id id) {
		return crudRepository.existsById(id);
	}
	
}
