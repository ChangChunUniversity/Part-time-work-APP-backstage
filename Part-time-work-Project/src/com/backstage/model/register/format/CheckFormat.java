package com.backstage.model.register.format;

/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat {
    public static Boolean isCorrectNickName(String nickName){
        if(nickName.length()>=24||CheckFormat.isSQL(nickName)){
            return false;
        }
        return true;
    }
    private static Boolean isSQL(String content){
        String[] sqlCommand={"and","exec","insert","select","delete","update"
                ,"count","*","%","chr","mid","master","truncate","char","declare",";","or","-","+"};
        for (String command:sqlCommand) {
            if(content.contains(command)){
                return false;
            }
        }
        return true;
    }
}