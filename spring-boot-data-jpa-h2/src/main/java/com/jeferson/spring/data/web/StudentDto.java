package com.jeferson.spring.data.web;

import lombok.Data;

@Data
public class StudentDto {
    private Long student_id;
    private String firstName;
    private String lastName;
    private int year;
}