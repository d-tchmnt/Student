package com.example.student.controller;

import com.example.student.model.GenderEnum;
import com.example.student.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "api/v1/students")
public class StudentController {


    @GetMapping(path = "/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        log.info("found me!");
        List<Student> students = List.of(new Student(1L, "Nicholas Le Black", "mavroforosnicholas@gmail.com", GenderEnum.MALE), new Student(2L, "Tzi El", "karamelopoulou@saxlamara.com", GenderEnum.FEMALE));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
