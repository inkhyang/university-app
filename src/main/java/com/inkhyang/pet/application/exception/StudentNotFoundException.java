package com.inkhyang.pet.application.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String email) {
        super("Could not find student " + email);
    }
}
