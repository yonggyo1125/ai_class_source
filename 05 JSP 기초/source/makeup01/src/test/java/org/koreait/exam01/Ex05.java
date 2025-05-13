package org.koreait.exam01;

import com.github.javafaker.Faker;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class Ex05 {

    @Mock
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        //request = mock(HttpServletRequest.class);
        Faker faker = new Faker();
        // 스텁
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8,}"));
    }

    @Test
    void test1() {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.printf("email:%s, password=%s%n", email, password);
    }
}
