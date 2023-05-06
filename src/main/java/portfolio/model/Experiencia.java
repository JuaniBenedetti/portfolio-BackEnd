package portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import portfolio.model.interfaces.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "experiencias")
public class Experiencia implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExperiencia;

    @NotNull
    private ZonedDateTime fechaInicio;

    private ZonedDateTime fechaFin;

    @NotNull
    private String tituloPuesto;

    private String descripcion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "id_img_logo_empresa",
            foreignKey = @ForeignKey(name = "FK_experiencias_imagenes")
    )
    private Imagen imgLogoEmpresa;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "idUsuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_experiencias_usuarios")
    )
    private Usuario usuario;
}
