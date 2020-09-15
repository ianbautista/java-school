package com.lambdaschool.schools.services;

import com.lambdaschool.schools.exceptions.ResourceNotFoundException;
import com.lambdaschool.schools.models.Instructor;
import com.lambdaschool.schools.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "instructorService")
public class InstructorServiceImpl implements InstructorService
{
    @Autowired
    InstructorRepository instructorRepository;

    @Override
    public Instructor getInstructorById(Long instructorid)
    {
        return instructorRepository.findById(instructorid)
                .orElseThrow(() -> new ResourceNotFoundException("Instructor id " + instructorid + " not found!"));
    }
}
