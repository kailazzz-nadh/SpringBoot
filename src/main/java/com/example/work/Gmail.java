package com.example.work;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy=GmailValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME) 
public @interface Gmail{
	 public String message() default "Your Gmail must contains @gmail.com"; 
	 public Class<?>[] groups() default {}; 
	    public Class<? extends Payload>[] payload() default {}; 
}
