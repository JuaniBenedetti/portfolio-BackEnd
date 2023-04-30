package portfolio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "experiencias")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperiencia;

    @NotNull
    private ZonedDateTime fechaInicio;

    private ZonedDateTime fechaFin;

    @NotNull
    private String tituloPuesto;

    private String descripcion;

    @Lob
    private byte[] logoEmpresa;

    @ManyToOne
    @JoinColumn(
            name = "idUsuario",
            foreignKey = @ForeignKey(name = "FK_experiencias_usuarios")
    )
    private Usuario usuario;
}
