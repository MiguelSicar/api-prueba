package miguel.students.controllers;

import miguel.students.entity.Escuela;
import miguel.students.entity.Student;
import miguel.students.service.IEscuelaService;
import miguel.students.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/students")
@RestController
public class StudentsController {

    @Autowired
    IStudentsService studentsService;

    @Autowired
    IEscuelaService escuelaService;

    @GetMapping("/all")
    public List<Student> getStudents (){
        return studentsService.getStudents();
    }

    @PostMapping("/new/{idEscuela}")
    public Student newStudent(@RequestBody Student student,@PathVariable("idEscuela") int idEscuela){
        student.setEscuela(escuelaService.searchEscuelaById(idEscuela));
        studentsService.newStudent(student);
        Escuela escuela = escuelaService.searchEscuelaById(idEscuela);
        escuela.setStudentsOfEscuela(student);
        //escuelaService.searchEscuelaById(idEscuela).setStudentsOfEscuela(student);

        return student;
    }

    @PatchMapping("/edit")
    public Student modifyStudent(@RequestBody Student student){
        studentsService.newStudent(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id")int idStudent){
        studentsService.removeStudent(idStudent);
        return "Alumno elminado";
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable("id")int idStudent){
        return studentsService.searchStudentById(idStudent);
    }

}
