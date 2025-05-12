package org.koreait.filters;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {
    public CommonResponseWrapper(ServletResponse response) {
        super((HttpServletResponse) response);

        System.out.println("응답 공통 코드...");
    }
}
