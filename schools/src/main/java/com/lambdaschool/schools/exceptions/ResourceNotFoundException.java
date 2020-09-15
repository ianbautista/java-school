package com.lambdaschool.schools.exceptions;

public class ResourceNotFoundException extends RuntimeException // extending this makes it an exception
{
    public ResourceNotFoundException(String message)
    { // this message is before the actual message
        super("Found an error with School: " + message);
    }
}
