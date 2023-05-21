package com.ua.robotsprb.servis;

import com.ua.robotsprb.domain.Student;
import com.ua.robotsprb.repository.StudentRepository;
import com.ua.robotsprb.repository.StudentRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServise {
    public StudentRepositoryInterface studentRepositoryInt;
    public StudentServise() {
        studentRepositoryInt = new StudentRepository();
    }

    public List<Student> findAll() {

       return studentRepositoryInt.findAll();
    }
}
