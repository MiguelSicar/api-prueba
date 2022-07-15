package miguel.students.service.jpa;

import miguel.students.entity.Escuela;
import miguel.students.entity.Student;
import miguel.students.repository.EscuelaRepository;
import miguel.students.repository.StudentsRepository;
import miguel.students.service.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EscuelaServiceImpl implements IEscuelaService {

    @Autowired
    EscuelaRepository escuelaRepository;

    @Autowired
    StudentsRepository studentsRepository;


    @Override
    public void newEscuela(Escuela escuela) {
        escuelaRepository.save(escuela);
    }

    @Override
    public void removeEscuela(Integer idEscuela) {
        escuelaRepository.deleteById(idEscuela);
    }

    @Override
    public Escuela searchEscuelaById(Integer idEscuela) {
        Optional<Escuela> optional = escuelaRepository.findById(idEscuela);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Escuela> getEscuelas() {
        return escuelaRepository.findAll();
    }



}
