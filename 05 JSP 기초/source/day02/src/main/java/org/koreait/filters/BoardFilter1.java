package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class BoardFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("BoardFilter1 실행!");
    }
}
