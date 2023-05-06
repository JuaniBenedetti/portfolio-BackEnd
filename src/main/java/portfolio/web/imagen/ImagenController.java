package portfolio.web.imagen;

import org.springframework.web.multipart.MultipartFile;
import portfolio.model.Imagen;

public interface ImagenController {

    public Imagen find(Long id) throws Exception;

    public Imagen uploadProfile(MultipartFile multipartFile, Long idInformacion) throws Exception;

    public Imagen uploadCover(MultipartFile multipartFile, Long idInformacion) throws Exception;

    public Imagen uploadLogoEmpresa(MultipartFile multipartFile, Long idInformacion) throws Exception;

    public Imagen uploadLogoInstitucion(MultipartFile multipartFile, Long idInformacion) throws Exception;
}
