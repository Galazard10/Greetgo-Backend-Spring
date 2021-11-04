package kz.greetgo.react.studentsproject.config;

import kz.greetgo.react.studentsproject.entities.Students;
import kz.greetgo.react.studentsproject.mappers.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    private StudentsMapper studentsMapper;

    @Bean
    public void DataBaseInit(){
        Students student_1 = new Students();
        student_1.setFull_name("Iliyas Galym");
        student_1.setUniversity("KBTU");
        student_1.setFaculty("IS");
        student_1.setYear_of_study(3);
        Students student_2 = new Students();
        student_2.setFull_name("Nursultan Nazarbayev");
        student_2.setUniversity("ENU");
        student_2.setFaculty("GD");
        student_2.setYear_of_study(7);
        Students student_3 = new Students();
        student_3.setFull_name("Bill Gates");
        student_3.setUniversity("Cambridge University");
        student_3.setFaculty("CS");
        student_3.setYear_of_study(1);

        studentsMapper.insert(student_1);
        studentsMapper.insert(student_2);
        studentsMapper.insert(student_3);
    }
}
