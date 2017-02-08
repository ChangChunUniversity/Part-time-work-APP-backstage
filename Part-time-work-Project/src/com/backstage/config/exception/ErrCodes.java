package com.backstage.config.exception;


/**
 * Created by lauya on 2017/2/7.
 * 错误代码列表
 * 未确定
 */
public class ErrCodes {
    public class INF{
        public static final int INVALID_INF=100;
        public static final int INVALID_NICKNAME=101;
        public static final int INVALID_PASSWORD=102;
        public static final int INVALID_PHONE=103;
        public static final int INVALID_SEX=104;
        public static final int INVALID_EMAIL=105;
    }

    public class Success{
        public static final int OK=200;
    }

    public class Redirection{
        public static final int OK=200;
    }

    public class ClientError{
        public static final int OK=200;
    }

    public static class ServerError{
        public static final int UNKNOWN=200;
    }
}
