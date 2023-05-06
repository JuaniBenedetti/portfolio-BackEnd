package portfolio.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.dao.usuario.UsuarioDao;
import portfolio.model.Usuario;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioDao usuarioDao;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = usuarioDao
                .findOneByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con username " + username + " no existe."));

        return new UserDetailsImpl(user);
    }
}
