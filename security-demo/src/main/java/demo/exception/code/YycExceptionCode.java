package demo.exception.code;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
public enum YycExceptionCode {
    INTERNAL_SERVER_ERROR(10000,"服务内部错误"),
    USER_NOT_EXIST(10001, "用户不存在");

    YycExceptionCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
