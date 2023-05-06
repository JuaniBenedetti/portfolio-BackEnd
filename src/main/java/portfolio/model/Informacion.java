package portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import portfolio.model.interfaces.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@Table(name = "informacion")
public class Informacion implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInformacion;

    @NotNull
    private String apellidoNombre;

    private String titulo;

    private String info;

    @Column(name = "linkedin_url")
    private String linkedInURL;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "id_img_perfil",
            foreignKey = @ForeignKey(name = "FK_informacion_imagenes")
    )
    private Imagen imgFotoPerfil;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "id_img_portada",
            foreignKey = @ForeignKey(name = "FK_informacion_imagenes_2")
    )
    private Imagen imgFotoPortada;

    @OneToOne
    @JsonBackReference
    @JoinColumn(
            name = "idUsuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_informacion_usuarios")
    )
    private Usuario usuario;
}
