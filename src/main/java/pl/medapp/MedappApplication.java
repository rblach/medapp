package pl.medapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
//@ComponentScan({"pl.medapp.infrastructure.database.repository.mapper"})
public class MedappApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedappApplication.class, args);
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

