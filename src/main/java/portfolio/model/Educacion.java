package portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import portfolio.model.interfaces.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "educacion")
public class Educacion implements User {

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "id_img_logo_institucion",
            foreignKey = @ForeignKey(name = "FK_educacion_imagenes")
    )
    private Imagen imgLogoInstitucion;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "idUsuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_educacion_usuarios")
    )
    private Usuario usuario;
}
