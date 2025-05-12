package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.board.entities.Board;
import org.koreait.board.services.BoardInfoService;

import java.io.IOException;
import java.util.List;


public class BoardController extends HttpServlet {  // 컨트롤러
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardInfoService service = new BoardInfoService(); // 모델(Model)
        List<Board> items = service.getList();
        req.setAttribute("items", items);


        // 뷰(View)
        RequestDispatcher rd = req.getRequestDispatcher("/board/list.jsp");
        rd.forward(req, resp);
    }
}
