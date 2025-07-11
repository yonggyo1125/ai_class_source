package org.koreait.global.rests;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONError<T> {
    private HttpStatus status;
    private T message;
}
