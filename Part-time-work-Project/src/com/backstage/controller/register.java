package com.backstage.controller;


import java.io.IOException;
import com.google.gson.*;
import com.backstage.model.register.format.BaseJsonStrute;

/**
 * Created by lauya on 2017/2/3.
 */
public class register extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String str="{\"name\":\"kidou\",\"age\":24,\"email_address\":\"ikidou@example.com\"}";
        Gson json=new Gson();
        BaseJsonStrute aaa=json.fromJson(str,BaseJsonStrute.class);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
