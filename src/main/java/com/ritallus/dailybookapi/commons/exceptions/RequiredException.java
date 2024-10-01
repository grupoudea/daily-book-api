package com.ritallus.dailybookapi.commons.exceptions;


import com.ritallus.dailybookapi.commons.MessageResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequiredException extends RuntimeException {

    private String description;

    public RequiredException(String exception) {
        super(exception);
    }

    public RequiredException(String message, Exception exception) {
        super(message, exception);
    }

    public RequiredException(MessageResponse message) {
        super(message.getMessage());
        this.description = message.getDescription();
    }
}
