package io.sajeewa.api.service;

import io.sajeewa.api.model.Student;

import java.util.List;

public interface StudentService {
    //save a student
    Student addStudent(Student student);

    //get all student
    List<Student> getAllStudents();

    //get a student
    Student findById(Integer id);

    //update student
    void updateStudent(Student student);

    //delete student
    boolean deleteById(Integer id);
}
