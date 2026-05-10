package com.example.crud.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.crud.entity.Student;
import com.example.crud.service.StudentService;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;


    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.create(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }



    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

}
