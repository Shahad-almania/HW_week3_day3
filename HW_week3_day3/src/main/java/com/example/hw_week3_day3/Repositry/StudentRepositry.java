package com.example.hw_week3_day3.Repositry;

import com.example.hw_week3_day3.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepositry extends JpaRepository<Student,Integer> {


    @Query(value = "SELECT a * from Student a where a.name="shahad")
    Student findbyFirstname(String name);

    List<Student>

}

