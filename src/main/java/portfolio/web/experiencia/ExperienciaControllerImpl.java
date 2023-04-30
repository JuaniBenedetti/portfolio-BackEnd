package portfolio.web.experiencia;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Experiencia;
import portfolio.services.experiencia.ExperienciaService;
import portfolio.web._CRUD.CRUDControllerImpl;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaControllerImpl extends CRUDControllerImpl<Experiencia> implements ExperienciaController {

    public ExperienciaControllerImpl(ExperienciaService experienciaService) { super(experienciaService); }
}
