package portfolio.web.informacion;

import portfolio.model.Informacion;
import portfolio.services.informacion.InformacionService;
import portfolio.web._CRUD.CRUDControllerImpl;

public class InformacionControllerImpl extends CRUDControllerImpl<Informacion> implements InformacionController {

    public InformacionControllerImpl(InformacionService informacionService) { super(informacionService); }
}
