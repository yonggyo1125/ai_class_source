package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class BoardController extends HttpServlet {  // 컨트롤러
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // 뷰(View)
        RequestDispatcher rd = req.getRequestDispatcher("/board/list.jsp");
        rd.forward(req, resp);
    }
}
