package portfolio.web.informacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Informacion;
import portfolio.services.informacion.InformacionService;
import portfolio.web._CRUD.CRUDControllerImpl;

@RestController
@RequestMapping("/informacion")
public class InformacionControllerImpl extends CRUDControllerImpl<Informacion> implements InformacionController {

    public InformacionControllerImpl(InformacionService informacionService) { super(informacionService); }
}
