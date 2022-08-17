package com.example.hw_week3_day3.Service;

import com.example.hw_week3_day3.Model.Student;
import com.example.hw_week3_day3.Model.Teacher;
import com.example.hw_week3_day3.Repositry.TeacherRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepositry teacherRepository;
    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
      public void updateTeacher(Teacher teacher,Integer id) {
         Teacher Teacher=teacherRepository.getById(id);
          Teacher.setId(teacher.getId());
          Teacher.setName(teacher.getName());
          Teacher.setSalary(teacher.getSalary());
          teacherRepository.save(Teacher);
      }

      public void deleteTeacher(Integer id){
          Teacher teacher=teacherRepository.getById(id);
          teacherRepository.delete(teacher);
      }

    public Teacher getTeacherById(Integer id) {
        Teacher teacher=teacherRepository.getById(id);{
            try {
                if (teacher.getId() == id) {
                    return teacher;
                } else {
                    return null;
                }
            }catch(Exception e){
                System.out.println("bad request..");
            }
        }
        return teacher;
    }
    public List<Teacher>getTecherBySAlary(Integer salary){
        List<Teacher>teacherList=teacherRepository.findTeacherBySalay(salary);
    } return teacher;
}