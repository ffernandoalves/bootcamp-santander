package com.project.bootcamp.exceptions;

public class ExceptionResponse {

    private String message;

    public ExceptionResponse(String message) {
        this.message = message;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }
}
