package portfolio.services.usuario;

import portfolio.model.Usuario;

public interface UsuarioService {

    Usuario usuarioActual() throws Exception;

    Usuario usuarioByUsername(String username) throws Exception;
}
