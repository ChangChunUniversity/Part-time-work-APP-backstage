package com.backstage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import com.google.gson.Gson;

import com.backstage.model.register.format.BaseInputJsonStrute;
import com.backstage.model.register.database.DataBase;
import com.backstage.model.gson.Error;


/**
 * Created by lauya on 2017/2/3.
 */
public class register extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String str = "{\"nickname\":\"testname\",\"password\":123456pwd,\"sex\":1,\"phone\":\"13634187645\",\"email\":\"test@qq.test.com\"}";
        Gson json = new Gson();
        BaseInputJsonStrute recvData = json.fromJson(str, BaseInputJsonStrute.class);

        String nickName;
        String email;
        String password;
        String phone;
        int sex;
        int id = -1;
        PrintWriter out = response.getWriter();
        try {
            nickName = recvData.getNickName();
            email = recvData.getEmail();
            password = recvData.getPassword();
            phone = recvData.getPhone();
            sex = recvData.getSex();
            id = DataBase.writeBaseInput(nickName, password, sex, phone, email);
        } catch (IllegalArgumentException e) {
            out.write(Error.ReturnError(e));
        }
        //检验输出值合法性
        //构建JSON
        //输出JSON
        //#定义错误码
        //#定义错误码解释


        //out.write("Error");

    }
}
