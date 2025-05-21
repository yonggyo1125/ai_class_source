package org.koreait.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MemberOnlyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        if (session.getAttribute("loggedMember") != null) { // 로그인 상태인 경우

            return true;
        }

        // 미로그인 상태, 로그인 페이지 이동
        response.sendRedirect(request.getContextPath() + "/member/login?redirectUrl=/survey/page1");

        return false;
    }
}
