package org.koreait.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class BoardController extends HttpServlet {
//    @Override
//    public void init() throws ServletException {
//        System.out.println("init() 호출");
//    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n", key1, key2);


    }

    @Override
    public void destroy() {
        System.out.println("destroy() 호출");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet() 호출(매 요청마다 호출)");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print("<h1>게시글 작성</h1>");
        out.print("<form method='POST' action='board'>");
        out.print("분류: <input type='checkbox' name='category' value='분류1'>분류1 ");
        out.print("<input type='checkbox' name='category' value='분류2'>분류2 ");
        out.print("<input type='checkbox' name='category' value='분류3'>분류3<br>");
        out.print("제목: <input type='text' name='subject'><br>");
        out.print("내용: <textarea name='content'></textarea><br>");
        out.print("<button type='submit'>작성하기</button>");
        out.print("</form>");

        String common1 = req.getServletContext().getInitParameter("common1");
        String common2 = req.getServletContext().getInitParameter("common2");
        System.out.printf("common1=%s, common2=%s%n", common1, common2);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 서블릿 5버전 이하
        String subject = req.getParameter("subject");
        String content = req.getParameter("content");
        String category = req.getParameter("category");
        String[] categories = req.getParameterValues("category");

        System.out.printf("subject=%s, content=%s%n", subject, content);
        System.out.printf("category=%s, categories=%s%n", category, Arrays.toString(categories));
    }
}
