package miguel.students.service;

import miguel.students.entity.Student;

import java.util.List;

public interface IStudentsService {
    List<Student> getStudents();
    void newStudent(Student student);
    void removeStudent(Integer idStudent);
    Student searchStudentById(Integer idStudent);
}
