package com.web;

/**
 * @author xiaotaoqi
 * @ClassName IndexServlet
 * @Description TODO
 * @Date 2019/9/26
 * @Version 1.0
 **/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book[] books={
                new Book("外婆的道歉信", "1.jpg", "巴克曼位列"),
                new Book("查令十字路84号", "2.jpg", "海莲汉芙"),
                new Book("天才在左，疯子在右", "3.jpg", "高铭"),
                new Book("岛上书店", "4.jpg", "加布瑞埃拉泽文"),
                new Book("人间简史", "5.jpg", "尤瓦尔赫拉利"),


        };
        List<Book> bookList =(List<Book>) Arrays.asList(books);
        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
