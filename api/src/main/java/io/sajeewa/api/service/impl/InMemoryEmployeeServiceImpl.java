package io.sajeewa.api.service.impl;

import io.sajeewa.api.model.Student;
import io.sajeewa.api.repository.InMemoryRepository;
import io.sajeewa.api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service

public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryRepository inMemoryRepository;


    @Override
    public Student addStudent(Student student) {
       return inMemoryRepository.addStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return inMemoryRepository.getAllStudents();
    }

    @Override
    public Student findById(Integer id) {
        return inMemoryRepository.findById(id);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public boolean deleteById(Integer id) {
        return inMemoryRepository.deleteById(id);
    }
}
