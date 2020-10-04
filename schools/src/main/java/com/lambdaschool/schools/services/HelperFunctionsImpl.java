package com.lambdaschool.schools.services;

import com.lambdaschool.schools.models.ValidationError;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "helperFunctions")
public class HelperFunctionsImpl implements HelperFunctions
{
    @Override
    public List<ValidationError> getConstraintViolation(Throwable cause)
    {
        // find all violations that will be bundled in ConstraintViolationExceptions
        // search for cause
        // gonna look to see if there are input violations
        while ((cause != null) && !(cause instanceof ConstraintViolationException))
        {
            cause = cause.getCause();

        }

        List<ValidationError> validationErrorList = new ArrayList<>();

        if (cause != null)
        {
            // loop through the cause
            ConstraintViolationException exceptions = (ConstraintViolationException) cause;
            for (ConstraintViolation cv : exceptions.getConstraintViolations() )
            {
                ValidationError newVE = new ValidationError();
                newVE.setCode(cv.getInvalidValue().toString()); // finding the invalid value
                newVE.setMessage(cv.getMessage()); // finding the message value
                validationErrorList.add(newVE); // adding those values to my validation error list
            }
        }

        return validationErrorList;
    }
}
