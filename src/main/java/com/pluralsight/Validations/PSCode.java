package com.pluralsight.Validations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PSCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PSCode {

     String message() default "PS Code should start with PS";

     Class<?>[] groups() default {};

     Class<? extends Payload> [] payload() default {};

}
