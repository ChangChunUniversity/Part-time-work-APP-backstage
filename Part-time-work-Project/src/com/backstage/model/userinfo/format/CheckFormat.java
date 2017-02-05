package com.backstage.model.userinfo.format;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat {
   public static boolean check_name( String name)//检查姓名是否合法
    {
        if(name.length()>24||name.length()<0)
        {
            return false;
        }
        else
            return true;
    }
    public static boolean check_phone(String number)//检查电话是否合法
    {
        String REGEX_MOBILE = "^[1][3,4,5,7,8][0-9]{9}$";
        return Pattern.matches(REGEX_MOBILE,number);
    }
    public static boolean check_password(String password)//检查密码是否合法
    {
        if(password.length()>6&&password.length()<108)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean check_sex(String sex)
    {
        return true;
    }

    public static boolean check_email(String email)//检测邮箱的地址是否合法
    {
        boolean flag = false;
        try {
            String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public static boolean check_school(String schoolName)
    {
        return true;
    }
    public static boolean check_colleage(String colleageName)
    {
        return true;
    }
    public static boolean check_marjor(String marjorName)
    {
        return true;
    }
    public static boolean check_NO(String NOname)
    {
        return true ;
    }
    public static boolean check_ID_card(String idCard)
    {
        String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
       return  Pattern.matches(REGEX_ID_CARD, idCard);
    }
}
