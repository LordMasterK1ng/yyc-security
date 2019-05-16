package security.demo.constraint.validator;

import security.demo.constraint.MyConstraint;
import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
@Slf4j
public class MyConstraintValidator implements ConstraintValidator<MyConstraint, Object> {
    @Override
    public void initialize(MyConstraint myConstraint) {
        log.error("MyConstraintValidator initialized");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        log.error("object value:{}", o);
        return false;
    }
}
