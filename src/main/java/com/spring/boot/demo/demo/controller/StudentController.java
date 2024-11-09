package com.spring.boot.demo.demo.controller;

import com.spring.boot.demo.demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students=new ArrayList<>(List.of(new Student(1,"Shaubham",20),
            new Student(2,"Niharika",50)));

    @GetMapping("/students")
    public List<Student> getStudent(){

       return students;
    }
    @PostMapping("/students")
    public List<Student> addStudent(@RequestBody Student student){
      students.add(student);
        return students;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getCSRFToken(HttpServletRequest httpServletRequest)
    {
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }
    @GetMapping("/test")
    public String test(){

        return "TestWorking";
    }
}
