package com.backstage.model.userinfo.format;

/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat {
    public Boolean isCorrectNickName(String nickName){
        if(nickName.length()>=24){
            return false;
        }
        return true;
    }
}
