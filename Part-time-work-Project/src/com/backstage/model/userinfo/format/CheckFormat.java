package com.backstage.model.userinfo.format;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by lauya on 2017/2/4.
 */
public class CheckFormat {
    public static boolean isCorrectNickName( String name)//检查姓名是否合法
    {
        if(name.length()>24||name.length()<0)
        {
            return false;
        }
        else
            return true;
    }
    public static boolean isCorrectPhone(String number)//检查电话是否合法
    {
        boolean flag = false;
        try {
            Pattern p = Pattern
                    .compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
            Matcher m = p.matcher(number);
            flag = m.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }
    public static boolean isCorrectPassword(String password)//检查密码是否合法
    {
        if(password.length()>6&&password.length()<108)
        {
            return true;
        } else
        {
            return false;
        }
    }
    public static boolean isCorrectSex(String sex)
    {
        return true;
    }

    public static boolean isCorrectEmail(String email)//检测邮箱的地址是否合法
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

    public static boolean isCorrectSchool(String schoolName)
    {
        return true;
    }
    public static boolean isCorrectolleage(String colleageName)
    {
        return true;
    }
    public static boolean isCorrectMarjor(String marjorName)
    {
        return true;
    }
    public static boolean isCorrectSchoolNum(String NOname)
    {
        return true ;
    }
    public static boolean isCorrectCitzenID(String idCard)
    {
        String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
       return  Pattern.matches(REGEX_ID_CARD, idCard);
    }
}
