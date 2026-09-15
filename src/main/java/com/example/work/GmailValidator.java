package com.example.work;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GmailValidator implements ConstraintValidator<Gmail,String> {
	@Override
    public boolean isValid(String b, ConstraintValidatorContext cvc) {
        b = b.toLowerCase();
        boolean result = b.contains("@gmail.com");
        return result;

}
}
