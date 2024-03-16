package lk.ijse.gdse.aad65.student_managemant_system.conversion;

import lk.ijse.gdse.aad65.student_managemant_system.dto.StudentDTO;
import lk.ijse.gdse.aad65.student_managemant_system.entity.StudentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConversionData {
    final private ModelMapper modelMapper;

    public ConversionData(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    //Student Obj mapping
    public StudentDTO convertToStudentDTO(StudentEntity student) {
        return modelMapper.map(student, StudentDTO.class);
    }
    public StudentEntity convertToStudentEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, StudentEntity.class);
    }
    public List<StudentDTO> getStudentDTOList(List<StudentEntity> studentEntityList) {
        return modelMapper.map(studentEntityList,List.class);
    }
}
