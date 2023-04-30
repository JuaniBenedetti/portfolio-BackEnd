package portfolio.web.educacion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Educacion;
import portfolio.services.educacion.EducacionService;
import portfolio.web._CRUD.CRUDControllerImpl;

@RestController
@RequestMapping("/educacion")
public class EducacionControllerImpl extends CRUDControllerImpl<Educacion> implements EducacionController {

    public EducacionControllerImpl(EducacionService educacionService) { super(educacionService); }
}
