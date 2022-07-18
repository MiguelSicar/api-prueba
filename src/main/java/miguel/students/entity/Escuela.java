package miguel.students.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Escuelas")
public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @OneToMany
    private List<Student> studentsOfEscuela;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Student> getStudentsOfEscuela() {
        return studentsOfEscuela;
    }

    public void setStudentsOfEscuela(Student student) {
        this.studentsOfEscuela.add(student);
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
