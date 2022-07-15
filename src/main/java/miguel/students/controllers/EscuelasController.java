package miguel.students.controllers;

import miguel.students.entity.Escuela;
import miguel.students.entity.Student;
import miguel.students.service.IEscuelaService;
import miguel.students.service.IStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escuelas")
public class EscuelasController {

    @Autowired
    IEscuelaService escuelaService;

    @GetMapping("/all")
    public List<Escuela> getEscuelas() {
        return escuelaService.getEscuelas();
    }

    @PostMapping("/new")
    public Escuela newEscuela(@RequestBody Escuela escuela){
        escuelaService.newEscuela(escuela);
        return escuela;
    }

    @PutMapping("/edit")
    public Escuela editEscuela(@RequestBody Escuela escuela){
        escuelaService.newEscuela(escuela);
        return escuela;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEscuela(@PathVariable("id") int idEscuela){
        escuelaService.removeEscuela(idEscuela);
        return "Escuela eliminada";
    }

    @GetMapping("/get/{id}")
    public Escuela getEscuelaById(@PathVariable("id") int idEscuela){
        return escuelaService.searchEscuelaById(idEscuela);
    }

}
