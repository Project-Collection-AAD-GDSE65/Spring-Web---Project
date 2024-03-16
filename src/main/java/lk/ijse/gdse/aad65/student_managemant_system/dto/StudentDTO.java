package lk.ijse.gdse.aad65.student_managemant_system.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO implements SuperDTO {
    @Null(message = "Id is auto generated")
    private String id;
    @NotNull(message = "First cannot be null")
    private String firstName;
    @NotNull(message = "Lastname cannot be null")
    private String lastName;
    @NotNull(message = "Level cannot be null")
    private String level;
    private String profilePic;

}
