package javier.fullstack.validaciones.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = EmployeeCodeVal.class)
public @interface EmployeeCode {

	String message() default "Ingresar un codigo con formato tipo: 'EMP-dep-1234";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
