package com.lambdaschool.schools.exceptions;

import com.lambdaschool.schools.services.HelperFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class CustomErrorDetails extends DefaultErrorAttributes
{
    @Autowired
    HelperFunctions helperFunctions;

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace)
    {
        // this calls the default ErrorAttributes
        Map<String, Object> defaultErrorAttributes =  super.getErrorAttributes(webRequest, includeStackTrace);

        // this is the new Error
        Map<String, Object> newErrorAttributes = new LinkedHashMap<>();

        // title: "title"
        // status: 401
        // details:
        // timestamp:
        // developerMessage:
        // errors: list of validation errors

        // remapping the data to the new attributes
        // this assigns the default attributes to the new attributes
        //                      new         |       default
        newErrorAttributes.put("title", "Resource Not Found");
        newErrorAttributes.put("status", defaultErrorAttributes.get("status"));
        newErrorAttributes.put("detail", defaultErrorAttributes.get("message"));
        newErrorAttributes.put("timestamp", defaultErrorAttributes.get("timestamp"));
        newErrorAttributes.put("developerMessage", "com.lambdaschool.schools.exceptions.ResourceNotFoundException");

//        System.out.println(webRequest);
        //webRequest has a lot of stuff but I just need the error.
        newErrorAttributes.put("error", helperFunctions.getConstraintViolation(this.getError(webRequest)));

        return newErrorAttributes;
    }
}
