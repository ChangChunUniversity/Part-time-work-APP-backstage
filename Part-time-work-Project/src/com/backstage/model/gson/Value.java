package com.backstage.model.gson;

/**
 * Created by jangitlau on 2017/2/6.
 */
public class Value {
    public static String getEssentialValue(String value,int ErrCode){
        if(value==null||value==""){
            return Integer.toString(ErrCode);
        }
        return value;
    }

    public static String getOptinalValue(String value){
        if(value==null||value==""){
            return "";
        }
        return value;
    }
}
