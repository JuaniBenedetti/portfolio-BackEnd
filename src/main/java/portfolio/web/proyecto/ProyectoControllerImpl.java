package portfolio.web.proyecto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Proyecto;
import portfolio.services.proyecto.ProyectoService;
import portfolio.web._CRUD.CRUDControllerImpl;

@RestController
@RequestMapping("/proyecto")
public class ProyectoControllerImpl extends CRUDControllerImpl<Proyecto> implements ProyectoController  {

    public ProyectoControllerImpl(ProyectoService proyectoService) { super(proyectoService); }
}
