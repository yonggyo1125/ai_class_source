package org.koreait.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class BoardFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("BoardFilter2 - 요청처리 전");

        chain.doFilter(request, response);

        System.out.println("BoardFilter2 - 응답처리 후");

    }
}
