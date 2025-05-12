package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.board.entities.Board;
import org.koreait.board.services.BoardInfoService;

import java.io.IOException;
import java.util.List;

@WebServlet("/board/list")
public class BoardController extends HttpServlet {  // 컨트롤러
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardInfoService service = new BoardInfoService(); // 모델(Model)
        List<Board> items = service.getList();
        req.setAttribute("items", items);


        // 뷰(View) - 직접 접근을 못하도록 /WEB-INF 하위에 구성한다.
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp");
        rd.forward(req, resp);
    }
}
