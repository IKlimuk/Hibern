package com.ua.robotsprb.repository;

import com.ua.robotsprb.domain.Student;

import java.util.List;

public interface StudentRepositoryInterface {
    List<Student> findAll();
}
