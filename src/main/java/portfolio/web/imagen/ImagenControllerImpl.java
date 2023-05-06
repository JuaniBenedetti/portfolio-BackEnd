package portfolio.web.imagen;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import portfolio.model.Educacion;
import portfolio.model.Experiencia;
import portfolio.model.Imagen;
import portfolio.model.Informacion;
import portfolio.services.educacion.EducacionService;
import portfolio.services.experiencia.ExperienciaService;
import portfolio.services.imagen.ImagenServiceImpl;
import portfolio.services.informacion.InformacionService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/imagen")
public class ImagenControllerImpl implements ImagenController {

    private final InformacionService informacionService;
    private final ExperienciaService experienciaService;
    private final EducacionService educacionService;
    private final ImagenServiceImpl imgService;

    @Override
    @GetMapping("/find")
    public Imagen find(@RequestParam(name = "id") Long id) throws Exception {
        return imgService.find(id);
    }

    @Override
    @PostMapping("/upload/informacion/profile")
    public Imagen uploadProfile(
            @RequestParam("img") MultipartFile image,
            @RequestParam("idInformacion") Long idInformacion
    ) {
        try {
            Imagen img = new Imagen(null, image.getBytes());
            Informacion info = this.informacionService.find(idInformacion);
            this.idProfile(info, img);
            return this.informacionService.update(info).getImgFotoPerfil();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    @PostMapping("/upload/informacion/cover")
    public Imagen uploadCover(
            @RequestParam("img") MultipartFile image,
            @RequestParam("idInformacion") Long idInformacion
    ) {
        try {
            Imagen img = new Imagen(null, image.getBytes());
            Informacion info = this.informacionService.find(idInformacion);
            this.idCover(info, img);
            return this.informacionService.update(info).getImgFotoPortada();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    @PostMapping("/upload/experiencia/logoEmpresa")
    public Imagen uploadLogoEmpresa(
            @RequestParam("img") MultipartFile image,
            @RequestParam("idExperiencia") Long idExperiencia
    ) {
        try {
            Imagen img = new Imagen(null, image.getBytes());
            Experiencia xp = this.experienciaService.find(idExperiencia);
            if(xp.getImgLogoEmpresa() != null) img.setIdImagen(xp.getImgLogoEmpresa().getIdImagen());
            xp.setImgLogoEmpresa(this.imgService.upload(img));
            return this.experienciaService.update(xp).getImgLogoEmpresa();
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    @PostMapping("/upload/educacion/logoInstitucion")
    public Imagen uploadLogoInstitucion(
            @RequestParam("img") MultipartFile image,
            @RequestParam("idEducacion") Long idEducacion
    ) {
        try {
            Imagen img = new Imagen(null, image.getBytes());
            Educacion educacion = this.educacionService.find(idEducacion);
            if(educacion.getImgLogoInstitucion() != null) img.setIdImagen(educacion.getImgLogoInstitucion().getIdImagen());
            educacion.setImgLogoInstitucion(this.imgService.upload(img));
            return this.educacionService.update(educacion).getImgLogoInstitucion();
        } catch (Exception ex) {
            return null;
        }
    }


    private void idProfile(Informacion info, Imagen img) {
        if (info.getImgFotoPerfil() != null) {
            img.setIdImagen(info.getImgFotoPerfil().getIdImagen());
        }
        info.setImgFotoPerfil(this.imgService.upload(img));
    }

    private void idCover(Informacion info, Imagen img) {
        if (info.getImgFotoPortada() != null) {
            img.setIdImagen(info.getImgFotoPortada().getIdImagen());
        }
        info.setImgFotoPortada(this.imgService.upload(img));
    }
}
