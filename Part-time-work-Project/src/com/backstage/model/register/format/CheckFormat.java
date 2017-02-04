package com.backstage.model.register.format;

/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat{
   /* public static Boolean isCorrectNickName(String nickName){
        if(com.backstage.model.userinfo.format.CheckFormat.isCorrectNickName(nickName)==false){
            return false;
        }
        if(CheckFormat.isSQL(nickName)){
            return false;
        }
        return true;
    }*/

    private static Boolean isSQL(String content){
        String[] sqlCommands={"and","exec","insert","select","delete","update"
                ,"count","*","%","chr","mid","master","truncate","char","declare",";","or","-","+"};
        for (String sqlCommand:sqlCommands) {
            if(content.contains(sqlCommand)){
                return false;
            }
        }
        return true;
    }
}
