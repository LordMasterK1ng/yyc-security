package security.core.handler;

import lombok.extern.slf4j.Slf4j;
import security.core.dto.Result;
import security.core.exception.YycException;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import security.core.util.ResultUtil;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
@ControllerAdvice
@Slf4j
public class YycExceptionHandler {

    @ExceptionHandler(YycException.class)
    @ResponseBody
    public Result handlerYycException(YycException ex) {
        log.error(ReflectionToStringBuilder.toString(ex, ToStringStyle.MULTI_LINE_STYLE));
        return ResultUtil.error(ex.getCode(), ex.getMsg());
    }
}
