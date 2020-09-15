package com.lambdaschool.schools.exceptions;

public class ResourceFoundException extends RuntimeException // extending this makes it an exception
{
    public ResourceFoundException(String message)
    { // this message is before the actual message
        super("Found an error with School: " + message);
    }
}
