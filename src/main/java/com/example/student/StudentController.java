package com.example.student;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private Map<Integer, Student> db = new HashMap<>();

    @GetMapping
    public Collection<Student> getAll() {
        return db.values();
    }

    @GetMapping("/{id}")
    public Student getOne(@PathVariable int id) {
        return db.get(id);
    }

    @PostMapping
    public Student create(@RequestBody Student s) {
        db.put(s.getId(), s);
        return s;
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student s) {
        db.put(id, s);
        return s;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        db.remove(id);
        return "Deleted student with id: " + id;
    }
}
