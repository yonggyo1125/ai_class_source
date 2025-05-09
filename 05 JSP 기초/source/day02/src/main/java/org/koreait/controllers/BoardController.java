package org.koreait.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class BoardController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h1>게시글 작성</h1>");
        out.print("<form method='POST' action='board'>");
        out.print("제목: <input type='text' name='subject'><br>");
        out.print("내용: <textarea name='content'></textarea><br>");
        out.print("<button type='submit'>작성하기</button>");
        out.print("</form>");
    }
}
