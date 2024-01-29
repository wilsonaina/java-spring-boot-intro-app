package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;
import static java.util.Calendar.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student wilson = new Student(
                    "Wilson Aina",
                    "wilsonaina@hotmail.com",
                    LocalDate.of(1987, 1, 27)
            );
            Student grace = new Student(
                    "Grace Aina",
                    "graceaina@hotmail.com",
                    LocalDate.of(1979, 12, 12)
            );

            repository.saveAll(
                    List.of(wilson, grace)
            );
        };
    }
}
