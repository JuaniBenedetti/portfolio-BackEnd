package portfolio.web.usuario;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import portfolio.model.Usuario;
import portfolio.services.usuario.UsuarioService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioControllerImpl implements UsuarioController {

    private final UsuarioService usuarioService;

    @Override
    @GetMapping("/findByUsername")
    public Usuario findByUsername(@RequestParam(name = "username") String username) {
        try {
            return usuarioService.usuarioByUsername(username);
        } catch (Exception ex) {
            return null;
        }
    }

//    @PutMapping("/update")
//    public Usuario update(@RequestBody @Valid Usuario usuario) throws Exception {
//        asignarUsuario(usuario);
//        usuario.setPassword(usuarioActual().getPassword());
//        return usuarioService.update(usuario);
//    }
//
//    private void asignarUsuario(Usuario usuario) {
//        if(usuario.getInformacion() != null) usuario.getInformacion().setUsuario(usuario);
//        if(usuario.getEducacion() != null) usuario.getEducacion().forEach(educacion -> educacion.setUsuario(usuario));
//        if(usuario.getExperiencias() != null) usuario.getExperiencias().forEach(experiencia -> experiencia.setUsuario(usuario));
//        if(usuario.getProyectos() != null) usuario.getProyectos().forEach(proyecto -> proyecto.setUsuario(usuario));
//        if(usuario.getSkills() != null) usuario.getSkills().forEach(softSkill -> softSkill.setUsuario(usuario));
//    }


}
