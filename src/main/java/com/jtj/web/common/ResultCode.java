package com.jtj.web.common;

/**
 * Created by MrTT (jiang.taojie@foxmail.com)
 * 0'1'2345
 *    -> 0：标记类型;
 *    -> 1：标记严重级别，0:success,1-3:info,4-6:warn,7-9:error.
 *    -> 2345：该类型序号;
 * 2017/1/22.
 */
public enum ResultCode {
    SUCCESS("000000","成功"),
    USER_INFO_NON_EXISTENT("150001","不存在该用户"),
    USER_TIME_ERROR("190002","请求时间异常"),
    USER_PASSWORD_ERROR("190003","密码错误"),
    UNAUTHORIZED("960000","未授权");

    private String code;
    private String message;

    ResultCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
