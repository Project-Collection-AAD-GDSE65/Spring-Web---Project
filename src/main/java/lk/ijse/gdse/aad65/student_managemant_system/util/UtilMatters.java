package lk.ijse.gdse.aad65.student_managemant_system.util;

import java.util.UUID;

public class UtilMatters {
    public static String generateId(){
       return UUID.randomUUID().toString();
    }
}
