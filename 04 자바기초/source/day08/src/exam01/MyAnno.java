package exam01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, TYPE, CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min(); // 최소값 추가 정보(설정)
    int max(); // 최대값 추가 정보(설정)
}
