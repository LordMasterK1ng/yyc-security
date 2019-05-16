package security.demo.controller;

import security.demo.dto.UserQueryCondition;
import security.demo.entity.User;
import security.core.exception.YycException;
import security.core.exception.code.YycExceptionCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> query(UserQueryCondition condition, Pageable pageable) {
        log.info("condition:{}", ReflectionToStringBuilder.
                toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        log.info("pageable:{}", ReflectionToStringBuilder.
                toString(pageable, ToStringStyle.MULTI_LINE_STYLE));
        List<User> list = Arrays.asList(new User(), new User(), new User());
        return list;
    }

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(error -> {
                log.error(error.getDefaultMessage());
            });
        }
        user.setId(1);
        log.info("user:{}",
                ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        return user;
    }

    @PutMapping("/{id}")
    public User edit(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(error -> {
                FieldError fieldError = (FieldError) error;
                log.error("field = {},msg = {}", fieldError.getField(), error.getDefaultMessage());
            });
        }
        user.setId(1);
        log.info("user:{}",
                ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
        return user;
    }

    @DeleteMapping("/{id:\\d}")
    public User del(@PathVariable("id") int id) {
        return new User(id, "tom", null, new Date());
    }

    @GetMapping("/error")
    public Object error() {
        throw new YycException(YycExceptionCode.INTERNAL_SERVER_ERROR);
    }
}
