package portfolio.web.usuario;


import portfolio.model.Usuario;

public interface UsuarioController {

    Usuario findByUsername(String username) throws Exception;
}
