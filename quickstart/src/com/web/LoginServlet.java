package com.web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求乱码
        req.setCharacterEncoding("UTF-8");
        //通过req请求参数获取前台表单
        String username =req.getParameter("username");
        String password =req.getParameter("password");


//        跳转之前把用户存入req对象
//        req.setAttribute("username",username);
//        req.setAttribute("password",password);
//        通过req跳转
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);



        //通过req请求获取session会话对象
        HttpSession session = req.getSession();
        //把用户名存入session
        session.setAttribute("username",username);
        //把密码存入session
        session.setAttribute("password",password);
        //通过resp跳转
        resp.sendRedirect("/index.jsp");


    }
}
