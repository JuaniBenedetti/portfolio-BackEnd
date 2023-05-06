package portfolio.services.proyecto;

import org.springframework.stereotype.Service;
import portfolio.dao.proyecto.ProyectoDao;
import portfolio.model.Proyecto;
import portfolio.services.educacion._CRUD.CRUDServiceImpl;

@Service
public class ProyectoServiceImpl extends CRUDServiceImpl<Proyecto> implements ProyectoService {

    public ProyectoServiceImpl(ProyectoDao proyectoDao) {
        super(proyectoDao);
    }
}
