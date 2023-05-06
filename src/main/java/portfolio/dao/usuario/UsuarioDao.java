package portfolio.dao.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import portfolio.model.Usuario;

import java.util.Optional;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findOneByUsername(String username);
}
