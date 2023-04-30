package portfolio.services.educacion;

import org.springframework.stereotype.Service;
import portfolio.dao.educacion.EducacionDao;
import portfolio.model.Educacion;
import portfolio.services._CRUD.CRUDServiceImpl;

@Service
public class EducacionServiceImpl extends CRUDServiceImpl<Educacion> implements EducacionService {

    public EducacionServiceImpl(EducacionDao educacionDao) { super(educacionDao); }
}
