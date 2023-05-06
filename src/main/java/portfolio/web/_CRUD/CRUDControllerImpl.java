package portfolio.web._CRUD;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import portfolio.model.interfaces.User;
import portfolio.services.educacion._CRUD.CRUDService;
import portfolio.services.usuario.UsuarioService;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
public abstract class CRUDControllerImpl<T extends User> implements CRUDController<T> {

    private final CRUDService<T> crudService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    @GetMapping("/find")
    public T find(@RequestParam(name = "id") Long id) throws Exception {
        return crudService.find(id);
    }

    @Override
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public T save(@RequestBody @Valid T entity) throws Exception {
        entity.setUsuario(usuarioService.usuarioActual());
        return crudService.save(entity);
    }

    @Override
    @PutMapping("/update")
    public T update(@RequestBody @Valid T entity) throws Exception {
        entity.setUsuario(usuarioService.usuarioActual());
        return crudService.update(entity);
    }

    @Override
    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@RequestParam(name = "id") Long id) throws Exception {
        crudService.deleteById(id);
    }

    @Override
    @GetMapping("/findAll")
    public List<T> findAll() throws Exception {
        return crudService.findAll();
    }
}
