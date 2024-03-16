package lk.ijse.gdse.aad65.student_managemant_system.controller;

import jakarta.validation.Valid;
import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;
import lk.ijse.gdse.aad65.student_managemant_system.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class Student {
    @Autowired
    StudentService studentService;

    @GetMapping("/health")
    public String healthCheckStudent(){
        return "Health Check Student";
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@Valid @RequestBody StudentDTO student, Errors errors){
        if(errors.hasFieldErrors()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    errors.getFieldErrors().get(0).getDefaultMessage());
        }
        studentService.saveStudent(student);
    }
    @GetMapping(value = "/{id}",produces = "application/json")
    ResponseEntity<StudentDTO> getSelectedStudent(@PathVariable ("id") String id){
        StudentDTO selectedStudent = studentService.getSelectedStudent(id);
        return selectedStudent != null ? ResponseEntity.ok(selectedStudent) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping(produces = "application/json")
    List<StudentDTO> getAllStudent(){
        return studentService.getAllStudent();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable ("id") String id){
        studentService.deleteStudent(id);
    }
}
