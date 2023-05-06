package portfolio.services.experiencia;

import org.springframework.stereotype.Service;
import portfolio.dao.experiencia.ExperienciaDao;
import portfolio.model.Experiencia;
import portfolio.services.educacion._CRUD.CRUDServiceImpl;

@Service
public class ExperienciaServiceImpl extends CRUDServiceImpl<Experiencia> implements ExperienciaService {

    public ExperienciaServiceImpl(ExperienciaDao experienciaDao) {
        super(experienciaDao);
    }
}
