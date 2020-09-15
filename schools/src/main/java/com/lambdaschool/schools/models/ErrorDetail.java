package com.lambdaschool.schools.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorDetail
{
    // title: "title"
    // status: 401
    // details:
    // timestamp:
    // developerMessage:
    // errors: list of validation errors

    // fields
    private String title;
    private int status;
    private String details;
    private Date timestamp;
    private String developermessage;
    private List<ValidationError> errors = new ArrayList<>();

    public ErrorDetail()
    {
        //default constructor
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDevelopermessage() {
        return developermessage;
    }

    public void setDevelopermessage(String developermessage) {
        this.developermessage = developermessage;
    }

    public List<ValidationError> getErrors() {
        return errors;
    }

    public void setErrors(List<ValidationError> errors) {
        this.errors = errors;
    }
}
