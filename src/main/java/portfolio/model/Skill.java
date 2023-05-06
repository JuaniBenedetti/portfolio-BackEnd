package portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import portfolio.model.interfaces.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
@Table(name = "skills")
public class Skill implements User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSkill;

    @NotNull
    private String nombre;

    // Prefiero que sea entero
    private int porcentaje;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "idUsuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_skills_usuarios")
    )
    private Usuario usuario;
}
