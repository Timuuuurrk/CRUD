package com.example.crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.entity.Student;
public interface StudentRepo extends JpaRepository<Student,Long> {

}
