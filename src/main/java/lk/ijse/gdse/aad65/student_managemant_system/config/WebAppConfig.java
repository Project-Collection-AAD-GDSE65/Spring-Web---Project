package lk.ijse.gdse.aad65.student_managemant_system.config;
import jakarta.servlet.annotation.MultipartConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "lk.ijse.gdse.aad65.student_managemant_system")
@Configuration
@EnableWebMvc
@MultipartConfig
public class WebAppConfig {

}
