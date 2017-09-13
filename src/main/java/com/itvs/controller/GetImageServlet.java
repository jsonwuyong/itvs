package com.itvs.controller;

import com.google.gson.Gson;
import com.itvs.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetImageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        String name=request.getParameter("name");
        PrintWriter out = null;
        Gson gson = new Gson();
        try {
            User u = new User();
            u.setName(name);
            u.setAddress("上海市闵行区虹莘路2288弄");
            u.setAge(29);
            u.setMobile("13856789876");
            out = response.getWriter();
            out.write(gson.toJson(u));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
