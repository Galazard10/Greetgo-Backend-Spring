package kz.greetgo.react.studentsproject.api;

import kz.greetgo.react.studentsproject.entities.Students;
import kz.greetgo.react.studentsproject.mappers.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class MainController {

    @Autowired
    private StudentsMapper studentsMapper;

    @GetMapping("/allstudents")
    public ResponseEntity<List<Students>> getAllStudents() {
        List<Students> students = studentsMapper.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping(value="/addstudent")
    public ResponseEntity<String> AddStudent(@RequestBody Students student){
        studentsMapper.insert(student);
        return new ResponseEntity<>("ADDED", HttpStatus.OK);
    }

    @DeleteMapping(value = "/deletestudent")
    public ResponseEntity<String> deleteStudent(@RequestParam(name="id") Long id){
        studentsMapper.delete(id);
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }
}
