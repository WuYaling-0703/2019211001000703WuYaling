package com.WuYaling.week6;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String searchText = request.getParameter("searchText");
        String searchTool = request.getParameter("searchTool");

        if (searchText == null || "".equals(searchText)) {
            response.sendRedirect("index.jsp");
        } else {

            if ("baidu".equals(searchTool)) {
                response.sendRedirect("https://www.baidu.com/s?wd=" + searchText);
            } else if ("bing".equals(searchTool)) {
                response.sendRedirect("https://cn.bing.com/search?q=" + searchText);
            } else if ("google".equals(searchTool)) {
                response.sendRedirect("https://www.google.com/search?q=" + searchText);

            }

        }


    }
}
