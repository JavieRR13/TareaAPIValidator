package javier.fullstack.validaciones.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = EmailCodeVal.class)
public @interface EmailCode {

	String message() default "El formato ha de ser <nombredeusuario>@gmail.com";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
