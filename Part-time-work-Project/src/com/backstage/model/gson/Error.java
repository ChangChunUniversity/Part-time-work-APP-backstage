package com.backstage.model.gson;

import com.google.gson.Gson;

import com.backstage.model.exception.ThrowException;
import com.backstage.config.exception.*;

/**
 * Created by lauya on 2017/2/7.
 */
public class Error {
    public static String ReturnError(Exception e){
        int ErrCode=ThrowException.getExceptionCode(e);
        Gson json = new Gson();
        ErrorOutputJsonStrute error=new ErrorOutputJsonStrute();
        error.ErrCode=ErrCode;
        error.ErrDesc= ErrCodesDescription.getDescription(ErrCode);
        return json.toJson(error);
    }

}
