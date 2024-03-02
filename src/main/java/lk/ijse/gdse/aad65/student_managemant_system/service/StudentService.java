package lk.ijse.gdse.aad65.student_managemant_system.service;

import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> saveStudent(StudentDTO student);
    List<StudentDTO> getAllStudent();
    StudentDTO getSelectedStudent(String id);
    void deleteStudent(String id);
}
