package com.example.viikko2tehtavat234.web;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.viikko2tehtavat234.domain.Student;

import org.springframework.ui.Model;


@Controller
public class StudentController {

    @GetMapping("/hello")
    public String MyController(Model model) {

        List<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student("Kate", "Cole"));
        studentList.add(new Student("Dan", "Brown"));
        studentList.add(new Student("Mike", "Mars"));
        

        
        model.addAttribute("students", studentList);
        return "hello";
    }

    
    
}