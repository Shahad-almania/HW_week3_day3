package com.example.hw_week3_day3.Controller;

import com.example.hw_week3_day3.Dto.Api;
import com.example.hw_week3_day3.Model.Student;
import com.example.hw_week3_day3.Model.Teacher;
import com.example.hw_week3_day3.Service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List> getTeacher(){
        List<Teacher>teachers=teacherService.getTeacher();
        return ResponseEntity.status(200).body(teachers);
    }
    @GetMapping("/teachertId")
    public ResponseEntity<Teacher> getById(@RequestPart Integer id){
        Teacher teacher =teacherService.getTeacherById(id);
        return ResponseEntity.status(200).body(teacher);
    }
    @GetMapping("/salary)
    public ResponseEntity<Teacher> getTecherBySAlary((@RequestPart Integer salary){
        List <Teacher>teacherList =getTecherBySAlary(salary);
        return ResponseEntity.status(200).body(teacherList);
    }

    @PostMapping
    public ResponseEntity<Api> addTeacher(@RequestBody @Valid Teacher teacher){
        teacherService.addTeacher(teacher);
        return ResponseEntity.status(201).body(new Api("new add teacher",201));
    }

    @PutMapping("/updateTeacher/{id}")
    public ResponseEntity<Api>updateTeacher(@RequestBody @Valid Teacher teacher, @PathVariable Integer id){
        teacherService.updateTeacher(teacher,id);
        return ResponseEntity.status(201).body(new Api("teacher update",201));
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public ResponseEntity<Api> deleteTeacher(@PathVariable Integer Id){
        teacherService.deleteTeacher(Id);
        return ResponseEntity.status(201).body(new Api("teacher delete",201));
    }
}
