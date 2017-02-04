package com.backstage.model;

import java.io.IOException;
import com.backstage.model.userinfo.format.CheckFormat;
import java.util.*;
/**
 * Created by lauya on 2017/2/3.
 * test document
 */
public class main {
    //test
    public static void main(String[] args)
    {
        CheckFormat test = new CheckFormat();
        String number="36048119970545678";
// System.out.printf(1);
        System.out.println(test.check_ID_card(number));

    }

}
