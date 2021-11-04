package kz.greetgo.react.studentsproject;

import kz.greetgo.react.studentsproject.entities.Students;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Students.class)
@MapperScan("kz.greetgo.react.studentsproject.mappers")
@SpringBootApplication
public class StudentsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsprojectApplication.class, args);
	}
}
