package com.backstage.controller;


import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import com.backstage.model.register.format.BaseJsonStrute;

/**
 * Created by lauya on 2017/2/3.
 */
public class register extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String str="{\"nickname\":\"testname\",\"password\":123456pwd,\"sex\":1,\"phone\":\"13634587645\",\"email\":\"test@test.com\"}";
        Gson json=new Gson();
        BaseJsonStrute aaa=json.fromJson(str,BaseJsonStrute.class);
        PrintWriter out=response.getWriter();
        out.write(aaa.getEmail());
    }
}
