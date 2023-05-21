package com.ua.robotsprb.rest;

import com.ua.robotsprb.domain.Student;
import com.ua.robotsprb.servis.StudentServise;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController


public class StudentController {
    private final StudentServise studentServise;
    @GetMapping("/stud")
    public List<Student> findAll () {
        return studentServise.findAll();
    }
}
