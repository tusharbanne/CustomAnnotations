package com.tushar.customAnnotation.util;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { FieldValidator.class })
public @interface NotNullOn {

		/**
		 * 
		 * @return
		 */
	    String message() default "values Missing";

	    /**
	     * 
	     * @return
	     */
	    Class<?>[] groups() default {};

	    /**
	     * 
	     * @return
	     */
	    Class<? extends Payload>[] payload() default {};
	    
	    
}
