package javier.fullstack.validaciones.validator;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmailCodeVal implements ConstraintValidator<EmailCode, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
		return false;
	}
	return Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", value);
	}
}