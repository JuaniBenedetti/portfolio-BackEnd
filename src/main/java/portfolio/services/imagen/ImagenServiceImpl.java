package portfolio.services.imagen;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import portfolio.dao.imagen.ImagenDao;
import portfolio.model.Imagen;

@Service
@RequiredArgsConstructor
public class ImagenServiceImpl implements ImagenService {

    private final ImagenDao imagenDao;

    public Imagen upload(Imagen img) {
        return imagenDao.save(img);
    }

    @Override
    public Imagen find(Long id) throws Exception {
        return imagenDao.findById(id).orElseThrow();
    }
}
