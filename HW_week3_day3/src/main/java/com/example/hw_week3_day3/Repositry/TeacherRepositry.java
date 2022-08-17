package com.example.hw_week3_day3.Repositry;

import com.example.hw_week3_day3.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepositry extends JpaRepository<Teacher,Integer> {
}
