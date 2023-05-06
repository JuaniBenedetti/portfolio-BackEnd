package portfolio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull
    @Column(nullable = false, unique = true)
    @Email(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Informacion informacion;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Educacion> educacion;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Proyecto> proyectos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Skill> skills;
}
