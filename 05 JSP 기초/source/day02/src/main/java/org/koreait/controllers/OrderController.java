package org.koreait.controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value={"/order", "/order2"}, initParams = {
        @WebInitParam(name="key1", value="value1"),
        @WebInitParam(name="key2", value="value2")
})
public class OrderController extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n", key1, key2);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<h1>주문서 작성</h1>");
    }
}
