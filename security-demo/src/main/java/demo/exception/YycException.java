package demo.exception;

import demo.exception.code.YycExceptionCode;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
public class YycException extends BaseException {
    public YycException() {
    }

    public YycException(YycExceptionCode code) {
        this.setCode(code.getCode());
        this.setMsg(code.getMsg());
    }
}
