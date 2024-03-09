package lk.ijse.gdse.aad65.student_managemant_system.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad65.student_managemant_system.conversion.ConversionData;
import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;
import lk.ijse.gdse.aad65.student_managemant_system.entity.StudentEntity;
import lk.ijse.gdse.aad65.student_managemant_system.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class StudentServiceIMPL implements StudentService{
    @Autowired
   private StudentDao studentDao;
    @Autowired
    private ConversionData convert;

    @Override
    public StudentDTO saveStudent(StudentDTO student) {
        StudentEntity studentEntity = convert.convertToStudentEntity(student);
        studentEntity = studentDao.save(studentEntity);
        return convert.convertToStudentDTO(studentEntity);
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return List.of();
    }

    @Override
    public StudentDTO getSelectedStudent(String id) {
        return null;
    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public void updateStudent(String id, StudentDTO student) {

    }
}


