package com.lambdaschool.schools.controllers;

import com.lambdaschool.schools.models.Instructor;
import com.lambdaschool.schools.models.Student;
import com.lambdaschool.schools.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/instructors")
public class InstructorController
{
    @Autowired
    InstructorService instructorService;
    // /instructors/instructor/{instructorid}/advice
    @GetMapping(value = "/instructor/{instructorid}/advice", produces = {"application/json"})
    public ResponseEntity<?> getInstructorById(@PathVariable Long instructorid)
    {
        Instructor i = instructorService.getInstructorById(instructorid);
        return new ResponseEntity<>(i, HttpStatus.OK);
    }
}
