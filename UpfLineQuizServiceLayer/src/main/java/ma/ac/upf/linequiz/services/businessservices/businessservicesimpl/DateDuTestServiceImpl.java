package ma.ac.upf.linequiz.services.businessservices.businessservicesimpl;

import org.springframework.stereotype.Service;

import ma.ac.upf.linequiz.dao.entities.DateDuTestEntity;
import ma.ac.upf.linequiz.dao.repositories.DateDuTestRepository;
import ma.ac.upf.linequiz.services.businessservices.DateDuTestService;

@Service("dateDuTestService")
public class DateDuTestServiceImpl extends CrudServiceImpl<DateDuTestEntity, Long, DateDuTestRepository> implements DateDuTestService {

}
