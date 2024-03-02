package lk.ijse.gdse.aad65.student_managemant_system.service;

import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService{
    List<StudentDTO>saveStudent = new ArrayList<>();

    @Override
    public List<StudentDTO> saveStudent(StudentDTO student) {
         saveStudent.add(student);
         System.out.println(saveStudent);
         return saveStudent;
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        return saveStudent;
    }
    @Override
    public StudentDTO getSelectedStudent(String id) {
        return null;
    }

    @Override
    public void deleteStudent(String id) {

    }
}
