package miguel.students.repository;

import miguel.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student,Integer> {
}
