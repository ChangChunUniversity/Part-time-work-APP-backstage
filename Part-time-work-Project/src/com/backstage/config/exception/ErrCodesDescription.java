package com.backstage.config.exception;

/**
 * Created by lauya on 2017/2/7.
 */
public class ErrCodesDescription {
    //获取错误码解释
    public static String getDescription(int Errcode){
        switch (Errcode){
            case 10086:return "Undefine Error";
            default:return "";
        }
    }
}
