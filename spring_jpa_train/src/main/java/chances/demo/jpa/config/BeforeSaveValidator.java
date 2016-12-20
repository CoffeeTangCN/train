package chances.demo.jpa.config;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import chances.demo.jpa.entity.User;

public class BeforeSaveValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");

	}

}
