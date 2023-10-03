package com.kafka.example.springbootkafkaexample.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("abhishek", 30);
        Student student1 = new Student("abhishek2", 80);
        Student student2 = new Student("abhishek3", 60);
        Student student3 = new Student("abhishek4", 51);
        Student student4 = new Student("abhishek5", 40);
        Student student5 = new Student("abhishek6", 20);
        Student student6 = new Student("abhishek7", 100);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        // List<Student> filteredStudent = students.stream().filter(x -> (x.getMarks()>50)).collect(Collectors.toList());
        List<Student> filteredStudent = students.stream().filter(x -> (x.getMarks()>50)).collect(Collectors.toList());
        System.out.println(filteredStudent);


    }
}
