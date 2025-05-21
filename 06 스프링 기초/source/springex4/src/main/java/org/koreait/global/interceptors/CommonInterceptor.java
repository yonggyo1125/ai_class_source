package org.koreait.global.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CommonInterceptor implements HandlerInterceptor {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //System.out.printf("postHandle(), ModelAndView:%s%n", modelAndView);
        if (modelAndView != null) {
            HttpSession session = request.getSession();
            boolean isLogin = session.getAttribute("loggedMember") != null;

            modelAndView.addObject("isLogin", isLogin);
        }
    }
}
