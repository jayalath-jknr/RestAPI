package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InmemoryStudentRepository implements StudentRepository {
    //map is like dictionary
    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        //todo : save
        database.put(student.id, student);
        System.out.println("Student saved in database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }
}
