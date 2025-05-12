package org.koreait.global.validators;

import org.koreait.global.exceptions.BadRequestException;

public interface RequiredFieldValidator {
    default void checkString(String str, String message) {
        if (str == null || str.isBlank()) {
            throw new BadRequestException(message);
        }
    }
}
