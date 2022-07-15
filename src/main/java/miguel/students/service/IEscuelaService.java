package miguel.students.service;

import miguel.students.entity.Escuela;
import miguel.students.entity.Student;

import java.util.List;

public interface IEscuelaService {
    void newEscuela(Escuela escuela);
    void removeEscuela(Integer idEscuela);
    Escuela searchEscuelaById(Integer idEscuela);
    List<Escuela> getEscuelas();

}
