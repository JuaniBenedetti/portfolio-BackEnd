package portfolio.services.informacion;

import org.springframework.stereotype.Service;
import portfolio.dao.informacion.InformacionDao;
import portfolio.model.Informacion;
import portfolio.services.educacion._CRUD.CRUDServiceImpl;

@Service
public class InformacionServiceImpl extends CRUDServiceImpl<Informacion> implements InformacionService{

    public InformacionServiceImpl(InformacionDao informacionDao) { super(informacionDao); }
}
