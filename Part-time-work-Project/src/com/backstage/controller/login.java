package com.backstage.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import com.backstage.view.login.BaseInputJSON;
import com.google.gson.Gson;

/**
 * Created by jangitlau on 2017/2/7.
 */
@WebServlet(name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str="{\"username\":\"xxxxxx\",\"password\":\"xxxxxx\",\"timestamp\":1486551703,\"deviceid\":\"352087074301038\"}";
        Gson inputJson=new Gson();
        BaseInputJSON recvData = inputJson.fromJson(str, BaseInputJSON.class);
        PrintWriter out=response.getWriter();
        out.write(recvData.password);
    }
}
