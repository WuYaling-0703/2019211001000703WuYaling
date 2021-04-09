package com.WuYaling.week5.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(name="LoginServlet", value="/login")

public class LoginServlet extends HttpServlet {
    Connection con =null;
    @Override
    public void init() throws ServletException {
        super.init();
        /*String driver = getServletConfig().getServletContext().getInitParameter("driver");
        String url = getServletConfig().getServletContext().getInitParameter("url");
        String username = getServletConfig().getServletContext().getInitParameter("username");
        String password = getServletConfig().getServletContext().getInitParameter("password");

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
        con=(Connection) getServletContext().getAttribute("con");
    }
    @Override

    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response) throws ServletException, IOException {
        doPost(request,response);

    }

    public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse
            response)
            throws IOException {

        /*PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        String sql="select * from usertable where username=? and password=?";
        //String sql="slect id,username,password,email,gender,birthdate from usertable where username'"+username'";
        try {
            ResultSet rs=con.createStatement().executeQuery(sql);
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            if(rs.next()) {
                //week5 code
                //out.println("Login Success!!!");
                //out.println("Welcome, "+username);

                request.setAttribute("id",rs.getInt("id"));
                request.setAttribute("username",rs.getString("username"));
                request.setAttribute("password",rs.getString("password"));
                request.setAttribute("email",rs.getString("email"));
                request.setAttribute("gender",rs.getString("gender"));
                request.setAttribute("birthdate",rs.getString("birthdate"));

                request.getRequestDispatcher("userInfo.jsp").forward(request,response);
            }
            else {
                //out.println("Login Error!!!");
                request.setAttribute("message","Username or Password Error!!!");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (SQLException | ServletException throwables) {
            throwables.printStackTrace();
        }

    }*/
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String sql="select * from Usertable where username=? and password=?";
    PreparedStatement pstmt= null;
        try {
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1,username);
        pstmt.setString(2,password);
        ResultSet rs= pstmt.executeQuery();
        PrintWriter out=response.getWriter();
        if(rs.next()){
                /*out.println("Login Success!!!");
                out.println("Welcome,"+Username);*/
            request.setAttribute("id",rs.getInt("id"));
            request.setAttribute("username",rs.getString("username"));
            request.setAttribute("password",rs.getString("password"));
            request.setAttribute("email",rs.getString("email"));
            request.setAttribute("gender",rs.getString("gender"));
            request.setAttribute("birthdate",rs.getDate("birthdate"));
            request.getRequestDispatcher("userInfo.jsp").forward(request,response);
        }else {
            //out.println("Username or password Error!!!");
            request.setAttribute("message","Username or password Error !!!");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    } catch (SQLException | ServletException throwables) {
        throwables.printStackTrace();
    }
}



    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
