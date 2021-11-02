package kz.greetgo.react.studentsproject.api;

import kz.greetgo.react.studentsproject.entities.Students;
import kz.greetgo.react.studentsproject.services.StudentService;
import kz.greetgo.react.studentsproject.services.impl.StudentServiceImpl;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class MainController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value="/addstudent")
    public ResponseEntity<Students> AddStudent(@RequestBody Students student){
        student = studentService.addStudent(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping(value = "/allstudents")
    public ResponseEntity<List<Students>> getAllStudents() {
        List<Students> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deletestudent")
    public ResponseEntity<String> deleteStudent(@RequestParam(name="id") Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>("DELETED", HttpStatus.OK);
    }
}
