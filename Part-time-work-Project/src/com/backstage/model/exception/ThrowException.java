package com.backstage.model.exception;

/**
 * Created by jangitlau on 2017/2/6.
 */
public class ThrowException {
    public static void throwErrCode(int ErrCode){
        throw new IllegalArgumentException("ErrCode:"+Integer.toString(ErrCode));
    }
}
