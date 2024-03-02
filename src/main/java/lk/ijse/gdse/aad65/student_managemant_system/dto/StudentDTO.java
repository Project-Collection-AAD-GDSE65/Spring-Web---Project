package lk.ijse.gdse.aad65.student_managemant_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO implements SuperDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String level;

}
