package miguel.students.repository;

import miguel.students.entity.Escuela;
import miguel.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Student,Integer> {
    List<Student> findAllByEscuela(Escuela escuela);
}
