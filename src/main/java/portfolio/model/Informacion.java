package portfolio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "informacion")
public class Informacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInformacion;

    @NotNull
    private String apellidoNombre;

    private String titulo;

    private String info;

    private String linkedInURL;

    @Lob
    private byte[] fotoPerfil;

    @OneToOne
    @JoinColumn(
            name = "idUsuario",
            foreignKey = @ForeignKey(name = "FK_informacion_usuarios")
    )
    private Usuario usuario;
}
