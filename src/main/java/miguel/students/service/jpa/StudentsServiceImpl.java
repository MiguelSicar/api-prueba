package miguel.students.service.jpa;

import miguel.students.entity.Student;
import miguel.students.repository.StudentsRepository;
import miguel.students.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsServiceImpl implements IStudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    @Override
    public List<Student> getStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public void newStudent(Student student) {
        studentsRepository.save(student);
    }

    @Override
    public void removeStudent(Integer idStudent) {
        studentsRepository.deleteById(idStudent);
    }

    @Override
    public Student searchStudentById(Integer idStudent) {
        Optional<Student> optional= studentsRepository.findById(idStudent);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }
}
