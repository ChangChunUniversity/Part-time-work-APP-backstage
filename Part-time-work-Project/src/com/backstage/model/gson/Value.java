package com.backstage.model.gson;

import com.backstage.model.exception.ThrowException;

/**
 * Created by jangitlau on 2017/2/6.
 */
public class Value {
    public static String getEssentialValue(String value,int ErrCode){
        if(value==null||value==""){
            ThrowException.throwErrCode(ErrCode);
            return "";
        }
        return value;
    }

    public static int getEssentialValue(int value,int ErrCode){
        if(value<0){
            ThrowException.throwErrCode(ErrCode);
            return -1;
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
