package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student bob = new Student(
          "bob",
          "bob@test",
          LocalDate.of(2020, JANUARY, 01)
      );

      Student alex = new Student(
          "alex",
          "alex@test",
          LocalDate.of(2005, JANUARY, 01)
      );

      repository.saveAll(
          List.of(bob, alex)
      );
    };
  }
}
