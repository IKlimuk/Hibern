package com.ua.robotsprb.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private String name;
    private String lastName;
    private int age;
    private String group;
}
