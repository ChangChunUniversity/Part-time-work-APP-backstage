package com.backstage.config.exception;


/**
 * Created by lauya on 2017/2/7.
 * 错误代码列表
 * 未确定
 */
public class ErrCodes {
    public class Informational{
        public static final int Continue=100;
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
