package lk.ijse.gdse.aad65.student_managemant_system.controller;

import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;
import lk.ijse.gdse.aad65.student_managemant_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
public class Student {
    @Autowired
    StudentService studentService;

    @GetMapping("/health")
    public String healthCheckStudent(){
        return "Health Check Student";
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@RequestBody StudentDTO student){
        studentService.saveStudent(student);
    }
    @GetMapping(value = "/{id}")
    StudentDTO getSelectedStudent(@PathVariable ("id") String id){
       return studentService.getSelectedStudent(id);
    }
}
