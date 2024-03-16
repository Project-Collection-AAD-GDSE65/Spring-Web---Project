package lk.ijse.gdse.aad65.student_managemant_system.repository;

import lk.ijse.gdse.aad65.student_managemant_system.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository <StudentEntity, String> {

}
