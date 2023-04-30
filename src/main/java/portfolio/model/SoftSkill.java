package portfolio.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "softskills")
public class SoftSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSoftSkill;

    @NotNull
    private String nombre;

    // Prefiero que sea entero
    private int porcentaje;

    @ManyToOne
    @JoinColumn(
            name = "idUsuario",
            foreignKey = @ForeignKey(name = "FK_softskills_usuarios")
    )
    private Usuario usuario;
}
