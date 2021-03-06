package com.example.demo.services.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, PARAMETER, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = { UniqueBooknameValidator.class })
public @interface UniqueBookName {

	String message();

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
