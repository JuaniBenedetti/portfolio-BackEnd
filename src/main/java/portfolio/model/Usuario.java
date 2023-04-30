package portfolio.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotNull
    @Column(nullable = false, unique = true)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Column(nullable = false, unique = true)
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    @OneToOne(mappedBy = "usuario")
    private Informacion informacion;

    @OneToMany(mappedBy = "usuario")
    private Set<Educacion> educacion;

    @OneToMany(mappedBy = "usuario")
    private Set<Experiencia> experiencia;

    @OneToMany(mappedBy = "usuario")
    private Set<Proyecto> proyecto;

    @OneToMany(mappedBy = "usuario")
    private Set<SoftSkill> softSkill;
}
