package com.web;

/**
 * @author xiaotaoqi
 * @ClassName IndexServlet
 * @Description TODO
 * @Date 2019/9/26
 * @Version 1.0
 **/

import com.web.Book;

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
                new Book(1,"《外婆的道歉信》", "1.jpg", "巴克曼位列"),
                new Book(2,"《查令十字街84号(珍藏版)》", "2.jpg", "海莲汉芙"),
                new Book(3,"《天才在左，疯子在右》", "3.jpg", "高铭"),
                new Book(4,"《岛上书店》", "4.jpg", "加布瑞埃拉泽文"),
                new Book(5,"《人类简史》", "5.jpg", "尤瓦尔赫拉利"),
                new Book(6,"《摆渡人》", "6.jpg", "克莱儿麦克福尔"),
                new Book(7,"《从你的全世界路过》", "7.jpg", "张嘉佳"),
                new Book(8,"《我们仨》", "8.jpg", "杨绛"),
                new Book(9,"《追风筝的人》", "9.jpg", "卡勒德胡塞尼"),
                new Book(10,"《解忧杂货店》", "10.jpg", "东野圭吾"),
        };
        List<Book> bookList =(List<Book>) Arrays.asList(books);
        req.setAttribute("bookList",bookList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
