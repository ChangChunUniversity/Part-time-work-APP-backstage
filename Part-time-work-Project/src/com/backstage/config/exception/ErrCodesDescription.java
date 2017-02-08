package com.backstage.config.exception;

/**
 * Created by lauya on 2017/2/7.
 */
public class ErrCodesDescription {
    //获取错误码解释
    public static String getDescription(int Errcode){
        switch (Errcode){
            case 100:return "INVALID_INF";
            case 101:return "INVALID_NICKNAME";
            case 102:return "INVALID_PASSWORD";
            case 103:return "INVALID_PHONE";
            case 104:return "INVALID_SEX";
            case 105:return "INVALID_EMAIL";
            case 10086:return "Undefine Error";
            default:return "";
        }
    }
}
