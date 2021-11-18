package com.example.SystemReact.controller;

import com.example.SystemReact.model.Student;
import com.example.SystemReact.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student", method = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return  "New Student is Added";
    }


}
