package org.koreait.global.exceptions;

import lombok.Getter;
import org.springframework.validation.Errors;

import java.util.List;

@Getter
public class BadRequestException extends RuntimeException {

    public List<String> messages;

    public BadRequestException(Errors errors) {
        List<String> errorMessags = errors.getFieldErrors().stream().map(e -> e.getDefaultMessage()).toList();
        this.messages = errorMessags;
    }
}
