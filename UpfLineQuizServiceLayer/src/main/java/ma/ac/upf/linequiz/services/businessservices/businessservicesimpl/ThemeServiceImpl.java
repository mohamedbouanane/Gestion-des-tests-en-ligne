package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.ThemeEntity;
import ma.ac.upf.linequiz.dao.repositories.ThemeRepository;
import ma.ac.upf.linequiz.services.businessservices.ThemeService;

@Service("themeService")
public class ThemeServiceImpl extends CrudServiceImpl<ThemeEntity, Long, ThemeRepository> implements ThemeService {

}
