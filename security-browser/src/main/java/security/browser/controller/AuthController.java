package security.browser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.core.dto.Result;
import security.core.exception.YycException;
import security.core.exception.code.YycExceptionCode;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/16
 */
@RestController("/auth")
public class AuthController {

    @RequestMapping
    public Result auth() {
        throw new YycException(YycExceptionCode.USER_NOT_UNAUTHORIZED);
    }
}
