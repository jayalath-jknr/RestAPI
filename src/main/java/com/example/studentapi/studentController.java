package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {

    //rest end points
    StudentRepository repository = new InmemoryStudentRepository();
    //creatae student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        //save student

       repository.save(student);

    }


    //retrieve student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);

    }

    //update student
    // delete student
}

