package lk.ijse.gdse.aad65.student_managemant_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
public class StudentEntity implements SuperEntity {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String level;
    private String profilePic;
}
