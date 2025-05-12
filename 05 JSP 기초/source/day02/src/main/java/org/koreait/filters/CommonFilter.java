package org.koreait.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/**
 * /* -> 모든 URL, 모든 파일..
 */
@WebFilter("/*")
public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        chain.doFilter(new CommonRequestWrapper(request),
                new CommonResponseWrapper(response));

    }
}
