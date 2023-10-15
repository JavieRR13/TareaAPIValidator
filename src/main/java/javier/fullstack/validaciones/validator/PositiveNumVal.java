package javier.fullstack.validaciones.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PositiveNumVal implements ConstraintValidator<PositiveNum, Integer>{

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return value > 0 && value != 0;
	}

}
