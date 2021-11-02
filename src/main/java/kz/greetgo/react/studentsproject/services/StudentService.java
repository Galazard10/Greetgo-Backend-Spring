package kz.greetgo.react.studentsproject.services;

import kz.greetgo.react.studentsproject.entities.Students;

import java.util.List;
import java.util.Optional;

public interface StudentService{

    List<Students> getAllStudents();
    Students addStudent(Students student);
    void deleteStudent(Long id);

}
