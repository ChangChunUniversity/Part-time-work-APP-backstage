package com.backstage.view.register;

import com.backstage.model.gson.Value;
import com.backstage.model.register.format.CheckFormat;
import com.backstage.model.exception.ThrowException;
import com.backstage.config.exception.ErrCodes.*;
/**
 * Created by jangitlau on 2017/2/6.
 */
//注册时收到JSON结构
public class BaseInputJson {
    //结构定义
    public String nickname = "";
    public String password = "";
    public String phone = "";
    public String email = "";
    public int sex = -1;

    //获取值，并对值进行合法性检测
    //获取昵称
    public String getNickName(){
        int ErrCode= INF.INVALID_NICKNAME;
        String value=this.nickname;
        if(CheckFormat.isCorrectNickName(value)){
            return Value.getEssentialValue(value,ErrCode);
        }
        return (String) ThrowException.throwErrCode(ErrCode);
    }

    //获取密码
    public String getPassword(){
        int ErrCode=INF.INVALID_PASSWORD;
        String value=this.password;
        if(CheckFormat.isCorrectPassword(value)){
            return Value.getEssentialValue(value,ErrCode);
        }
        return (String) ThrowException.throwErrCode(ErrCode);
    }

    //获取电话
    public String getPhone(){
        int ErrCode=INF.INVALID_PHONE;
        String value=this.phone;
        if(CheckFormat.isCorrectPhone(value)){
            return Value.getEssentialValue(value,ErrCode);
        }
        return (String) ThrowException.throwErrCode(ErrCode);
    }

    //获取Email
    public String getEmail(){
        int ErrCode=INF.INVALID_EMAIL;
        String value=this.email;
        if(CheckFormat.isCorrectEmail(value)){
            return Value.getEssentialValue(value,ErrCode);
        }
        return (String) ThrowException.throwErrCode(ErrCode);
    }

    //获取性别
    public int getSex(){
        int ErrCode=INF.INVALID_SEX;
        int value=this.sex;
        if(CheckFormat.isCorrectSex(value)){
            return Value.getEssentialValue(value,ErrCode);
        }
        return (int) ThrowException.throwErrCode(ErrCode);
    }
}
