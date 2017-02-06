package com.backstage.model.register.format;

import com.backstage.model.gson.Value;
import com.backstage.model.register.format.CheckFormat;
import com.backstage.model.exception.ThrowException;
/**
 * Created by jangitlau on 2017/2/6.
 */
//注册时收到JSON结构
public class BaseJsonStrute {
    //结构定义
    public String nickName = "";
    public String password = "";
    public String phone = "";
    public String email = "";
    public int sex = -1;

    //获取值，并对值进行合法性检测
    //获取昵称
    public String getNickName(){
        int ErrCode=10086;
        String value=this.nickName;
        if(CheckFormat.isCorrectNickName(value)){
            return Value.getEssentialValue(this.nickName,ErrCode);
        }else {
            ThrowException.throwErrCode(ErrCode);
            return "";
        }
    }

    //获取密码
    public String getPassword(){
        return Value.getEssentialValue(this.password,10086);
    }

    //获取电话
    public String getPhone(){
        return Value.getEssentialValue(this.phone,10086);
    }

    //获取Email
    public String getEmail(){
        return Value.getEssentialValue(this.email,10086);
    }

    //获取性别
    public int getSex(){
        return Value.getEssentialValue(this.sex,10086);
    }
}
