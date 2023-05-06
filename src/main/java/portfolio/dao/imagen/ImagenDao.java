package portfolio.dao.imagen;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.model.Imagen;

public interface ImagenDao extends JpaRepository<Imagen, Long> {
}
