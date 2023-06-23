package io.sajeewa.api.resource;

import io.sajeewa.api.model.Student;
import io.sajeewa.api.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")

public class StudentResource {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity <List<Student>> getStudents(){
        return   ResponseEntity.ok(studentService.getAllStudents());
    }
    @GetMapping("{id}")
    public ResponseEntity <Student> getStudent(@PathVariable ("id") Integer id){
        return   ResponseEntity.ok(studentService.findById(id));
    }
    @GetMapping
    public ResponseEntity <Student> addStudent(@RequestBody Student student){
        student.setId(studentService.getAllStudents().size()+1);
        return   ResponseEntity.created( getLocation(student.getId())).body();
    }

    private URI getLocation(Integer id) {
    }

    @GetMapping
    public ResponseEntity <List<Student>> getStudents(){
        return   ResponseEntity.created(studentService.getAllStudents());
    }
    @GetMapping
    public ResponseEntity <List<Student>> getStudents(){
        return   ResponseEntity.ok(studentService.getAllStudents());
    }

}
