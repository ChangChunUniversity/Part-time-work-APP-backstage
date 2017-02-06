package com.backstage.model.register.format;

/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat{
    //检查姓名是否合法
    public static boolean isCorrectNickName(String nickName){
        if(!com.backstage.model.userinfo.format.CheckFormat.isCorrectNickName(nickName)){
            return false;
        }
        if(CheckFormat.isSQL(nickName)){
            return false;
        }
        return true;
    }

    //检查密码(String)
    public static boolean isCorrectPassword(String password){
        if(!com.backstage.model.userinfo.format.CheckFormat.isCorrectPassword(password)){
            return false;
        }
        if(CheckFormat.isSQL(password)){
            return false;
        }
        return true;
    }

    //检查电话(String)
    public static boolean isCorrectPhone(String phone){
        if(!com.backstage.model.userinfo.format.CheckFormat.isCorrectPhone(phone)){
            return false;
        }
        if(CheckFormat.isSQL(phone)){
            return false;
        }
        return true;
    }

    //检查邮件(String)
    public static boolean isCorrectEmail(String email){
        if(!com.backstage.model.userinfo.format.CheckFormat.isCorrectEmail(email)){
            return false;
        }
        if(CheckFormat.isSQL(email)){
            return false;
        }
        return true;
    }

    //检查性别(int)
    public static boolean isCorrectSex(int sex){
        if(!com.backstage.model.userinfo.format.CheckFormat.isCorrectSex(sex)){
            return false;
        }
        return true;
    }

    //检查是否包含SQL代码(防止SQL注入)
    private static boolean isSQL(String content){
        String[] sqlCommands={"and","exec","insert","select","delete","update"
                ,"count","*","%","chr","mid","master","truncate","char","declare",";","-","+"};
        for (String sqlCommand:sqlCommands) {
            if(content.contains(" "+sqlCommand+" ")){
                return true;
            }
        }
        return false;
    }
}
