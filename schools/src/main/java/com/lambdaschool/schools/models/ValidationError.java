package com.lambdaschool.schools.models;

// this is a POJO spring is not using this
public class ValidationError
{
    private String code; // this is the thing the caused the problem (i.e. password. username. etc.)

    private String message; // this explains what the problem is.


    public ValidationError()
    {
        // default constructor
    }

    // getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
