package kz.greetgo.react.studentsproject.mappers;

import kz.greetgo.react.studentsproject.entities.Students;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface StudentsMapper {

    @Select("select * from t_students")
    List<Students> findAll();

    @Insert("insert into t_students(full_name, university, faculty, year_of_study) values(#{full_name}, #{university}, #{faculty}, #{year_of_study})")
    void insert(Students student);

    @Delete("delete from t_students where id=#{id}")
    void delete(@PathVariable("id") Long id);
}