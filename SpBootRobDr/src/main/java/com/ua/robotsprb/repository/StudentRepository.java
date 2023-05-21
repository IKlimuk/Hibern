package com.ua.robotsprb.repository;

import com.ua.robotsprb.domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentRepository implements StudentRepositoryInterface {
    private List<Student> studentsGroup = new ArrayList<>();

    public StudentRepository() {
        fillListStud();
    }

    public List<Student> findAll() {
        return studentsGroup;
    }

    public void fillListStud() {
        for (int i = 0; i < 4; i++) {
            Student student = getNewStudent();
            student.setId(i + 1);
            save(student);
        }
    }

    public void save(Student student) {
        studentsGroup.add(student);
    }

    public Student getNewStudent() {
        Random random = new Random();
        int nameSize = random.nextInt(3, 6);
        String firstName = generait(nameSize);
        String lastName = generait(nameSize);
        int rating = random.nextInt(1, 12);
//        Student.builder().id(0).firstName(firstName).lastName(lastName).rating(rating).build();
        return Student.builder().id(0).firstName(firstName).lastName(lastName).rating(rating).build();
    }

    public String generait(int nameSize) {
        String alphavit = "abcdefghijklmnopqrstuvxyz";
        Random random = new Random();
        StringBuilder newN = new StringBuilder();
        int a = random.nextInt(1, 3);
        for (int i = 0; i < nameSize; i++) {
            for (int j = 0; j < a; j++) {
                newN.append(alphavit.charAt(random.nextInt(0, alphavit.length())));
            }
        }
        String gener = newN.toString();
        gener = uperCase(gener, 0);

        return gener;

    }

    public String uperCase(String aa, int bb) {
        StringBuilder www = new StringBuilder();
        char[] c = aa.toCharArray();
        for (int i = 0; i < aa.length(); i++) {
            if (i == bb) {
                char a = Character.toUpperCase(c[i]);
                c[i] = a;
            }
            www.append(c[i]);
        }

        return www.toString();
    }
}
