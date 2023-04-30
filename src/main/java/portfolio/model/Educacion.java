package portfolio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEducacion;

    @NotNull
    private ZonedDateTime fechaInicio;

    private ZonedDateTime fechaFin;

    @NotNull
    private String titulo;

    @NotNull
    private String nombreInstitucion;

    private String descripcion;

    @Lob
    private byte[] logoInstitucion;

    @ManyToOne
    @JoinColumn(
            name = "idUsuario",
            foreignKey = @ForeignKey(name = "FK_educacion_usuarios")
    )
    private Usuario usuario;
}
