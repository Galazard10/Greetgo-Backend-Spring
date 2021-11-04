package kz.greetgo.react.studentsproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "university")
    private String university;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "year_of_study")
    private int year_of_study;

}
