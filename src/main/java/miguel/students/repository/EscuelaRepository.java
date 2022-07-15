package miguel.students.repository;

import miguel.students.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscuelaRepository extends JpaRepository <Escuela,Integer> {
}
