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
@Table(name = "proyectos")
public class Proyecto implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;

    @NotNull
    private ZonedDateTime fecha;

    @NotNull
    private String nombre;

    private String descripcion;

    private String evidenciaURL;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "idUsuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_proyectos_usuarios")
    )
    private Usuario usuario;
}
