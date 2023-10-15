package javier.fullstack.validaciones.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;



@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PositiveNumVal.class)
public @interface PositiveNum {

	String message() default "Ingresa un numero positivo.";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
	
}
