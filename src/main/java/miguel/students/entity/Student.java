package miguel.students.entity;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer promedio;

    @ManyToOne
    @JoinColumn(name = "idEscuela")
    private Escuela escuela;


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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getPromedio() {
        return promedio;
    }

    public void setPromedio(Integer promedio) {
        this.promedio = promedio;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", promedio=" + promedio +
                ", escuela=" + escuela +
                '}';
    }
}
