package com.pluralsight.Validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PSCodeConstraintValidator implements ConstraintValidator<PSCode, String> {

    @Override
    public void initialize(PSCode code) {

    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext arg1) {
        return code != null && code.startsWith("PS");
    }
}
