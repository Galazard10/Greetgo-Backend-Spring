package kz.greetgo.react.studentsproject.repositories;

import kz.greetgo.react.studentsproject.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Students, Long> {
}
