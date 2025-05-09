package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class BoardFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("BoardFilter1 - 요청 전"); // 공통 기능(추가 기능)

        chain.doFilter(request, response); // 핵심 기능 대신 수행

        System.out.println("BoardFilter1 - 응답 후"); // 공통 기능(추가 기능)
    }
}
