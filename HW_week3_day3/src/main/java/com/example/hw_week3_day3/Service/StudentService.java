package com.example.hw_week3_day3.Service;

import com.example.hw_week3_day3.Dto.Api;
import com.example.hw_week3_day3.Model.Mojor;
import com.example.hw_week3_day3.Model.Student;
import com.example.hw_week3_day3.Repositry.StudentRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepositry studentRepositry;

    public List<Student> getStudent() {
        return studentRepositry.findAll();
    }

    public void addStudent(Student student) {
        studentRepositry.save(student);
    }

    public void updateStudent(Student student, Integer id) {
        Student Student = studentRepositry.getById(id);
        Student.setId(student.getId());
        Student.setName(student.getName());
        Student.setAge(student.getAge());
        Student.setMojor(student.getMojor());

        studentRepositry.save(Student);

    }

    public void deleteStudent(Integer id) {
        Student student = studentRepositry.getById(id);
        studentRepositry.delete(student);
    }

    public Student getById(Integer id) {
        Student student = studentRepositry.getById(id);{
            try {
                if (student.getId() == id) {
                    return student;
                } else {
                    return null;
                }
            }catch(Exception e){
                System.out.println("bad request..");
            }
        }
        return student;
    }
    public List <Student> getByFirstname(String name) {
        List Student = studentRepositry.findbyFirstname(name);
            try {
                if (student.getName() == name) {
                    return student;
                } else {
                    return null;
                }
            }catch(Exception e){
               System.out.println("bad request..");
            }
        return student;
   }
   public List <Student> getByMojor(Mojor mojor){
       Student students= studentRepositry.fineByMojor(mojor);
      if(students.getMojor()== mojor){
          return Mojor;

public List <Student> getStudentByMajor(String mojor){
        List<Student>students=studentRepositry.finStudentByMojer(mojor);
        if(students.isEmpty()) {
            throw new Api("error mojor", 400);
        }return students;
            public List<Student>getStudentsAge(Integer age){
                List<Student> students1=studentRepositry.findStudentByAge(Age);
                return students1;

        }

    }
}
