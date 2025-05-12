package org.koreait.global.validators;

public interface Validator<T> {
    void check(T form);
}
