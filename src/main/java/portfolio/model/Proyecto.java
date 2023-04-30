package portfolio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "proyectos")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;

    @NotNull
    private ZonedDateTime fecha;

    @NotNull
    private String nombre;

    private String descripcion;

    private String evidenciaURL;
}
