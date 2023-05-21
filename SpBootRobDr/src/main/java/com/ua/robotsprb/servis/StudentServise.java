package com.ua.robotsprb.servis;

import com.ua.robotsprb.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServise {

    public List<Student> findAll() {

       return List.of(
               Student.builder().name("Red").lastName("Fiyt").age(21).group("OP-1").build(),
               Student.builder().name("Com").lastName("Dsf").age(24).group("OP-4").build(),
               Student.builder().name("Mopl").lastName("Dpopk").age(26).group("OP-2").build()
               );
    }
}
