package portfolio.services.informacion;

import portfolio.dao.informacion.InformacionDao;
import portfolio.model.Informacion;
import portfolio.services._CRUD.CRUDServiceImpl;

public class InformacionServiceImpl extends CRUDServiceImpl<Informacion> implements InformacionService {

    public InformacionServiceImpl(InformacionDao informacionDao) { super(informacionDao); }
}
