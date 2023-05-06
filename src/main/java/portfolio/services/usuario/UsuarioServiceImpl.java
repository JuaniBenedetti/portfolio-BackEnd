package portfolio.services.usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import portfolio.model.Usuario;
import portfolio.security.UserDetailsImpl;
import portfolio.security.UserDetailsServiceImpl;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UserDetailsServiceImpl userDetailsServiceImpl;

    @Override
    public Usuario usuarioActual() throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl usuarioActual = userDetailsServiceImpl.loadUserByUsername(authentication.getPrincipal().toString());
        return usuarioActual.getUsuario();
    }

    @Override
    public Usuario usuarioByUsername(String username) throws Exception {
        UserDetailsImpl user = userDetailsServiceImpl.loadUserByUsername(username);
        return user.getUsuario();
    }
}
