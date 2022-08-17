package com.example.hw_week3_day3.Controller;

import com.example.hw_week3_day3.Dto.Api;
import com.example.hw_week3_day3.Model.Student;
import com.example.hw_week3_day3.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aip/v1/student")
public class StudentCntroller {
    private final StudentService studentService;


    @GetMapping
    public ResponseEntity<List> getStudent(){
        List<Student> students=studentService.getStudent();
        return ResponseEntity.status(200).body(students);
    }
    @GetMapping("/sudentId")
    public ResponseEntity<Student> getById(@RequestPart Integer id){
        Student student =studentService.getById(id);
        return ResponseEntity.status(200).body(student);
    }
    @GetMapping("/sudentName")
    public ResponseEntity<Student> getbyFirstname(@RequestPart String name){
        Student student =studentService.getByFirstname(name);
        return ResponseEntity.status(200).body(student);
    }

    @PostMapping
    public ResponseEntity<Api> addStudent(@RequestBody @Valid Student student){
        studentService.addStudent(student);
        return ResponseEntity.status(201).body(new Api("new add student",200));
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<Api>updateStudent(@RequestBody @Valid Student student, @PathVariable Integer id){
        studentService.updateStudent(student,id);
        return ResponseEntity.status(201).body(new Api("student update",201));
    }

    @DeleteMapping("/id")
    public ResponseEntity<Api> deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return ResponseEntity.status(201).body(new Api("teacher delete",201));
    }

}
