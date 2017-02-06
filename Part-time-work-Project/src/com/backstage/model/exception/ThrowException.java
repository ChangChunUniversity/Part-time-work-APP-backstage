package com.backstage.model.exception;

import java.util.IllegalFormatConversionException;

/**
 * Created by jangitlau on 2017/2/6.
 */
public class ThrowException {
    public static Object throwErrCode(int ErrCode){
        throw new IllegalArgumentException("ErrCode:"+Integer.toString(ErrCode));
    }
    public static int getExceptionCode(Exception e){
        if(e.getMessage().contains("ErrCode:")){
            String ErrCode=e.getMessage().replace("ErrCode:","");
            return Integer.parseInt(ErrCode);
        }else {
            throw new IllegalArgumentException("Unreachable ErrCode:"+e.getMessage());
        }

    }
}
