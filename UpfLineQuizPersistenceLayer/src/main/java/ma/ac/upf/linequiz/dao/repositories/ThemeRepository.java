package ma.ac.upf.linequiz.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.ac.upf.linequiz.dao.entities.ThemeEntity;

@Repository("themeRepo")
public interface ThemeRepository extends CrudRepository<ThemeEntity, Long> {

}
