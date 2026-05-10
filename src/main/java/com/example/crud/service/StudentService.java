package com.example.crud.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.crud.entity.Student;
import com.example.crud.repository.StudentRepo;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo repo;

    public Student create(Student student) {
        return repo.save(student);
    }

    public Student update(Long id, Student pastStudent) {
        Student student = getById(id);
        student.setName(pastStudent.getName());
        student.setAge(pastStudent.getAge());
        student.setEmail(pastStudent.getEmail());

        return repo.save(student);
    }

    public void delete(Long num) {
        repo.deleteById(num);
    }


    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(Long id) {
        return repo.findById(id).orElseThrow(MissingException::new);
    }
}
