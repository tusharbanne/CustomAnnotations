package com.tushar.customAnnotation.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.tushar.customAnnotation.dto.Employee;

/**
 * 
 * @author tushar
 *
 */
public class FieldValidator implements ConstraintValidator<NotNullOn, Employee> {

	@Override
	public void initialize(NotNullOn constraintAnnotation) {
		//default method.
	}

	@Override
	public boolean isValid(Employee value, ConstraintValidatorContext context) {
		if (value == null){
			return false;
		}

        if (value.getLastName() == null) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Beid is required")
                    .addPropertyNode("beid").addConstraintViolation();
            return false;
        }

        if (value.getLastName() != null){
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate("Offer is required for company address")
                    .addPropertyNode("offer").addConstraintViolation();
                return false;
        }
        return true;
		
	}

}
