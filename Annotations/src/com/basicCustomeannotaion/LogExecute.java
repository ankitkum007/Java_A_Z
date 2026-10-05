package com.basicCustomeannotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface LogExecute {
	String value() default "defalut messsage";
		
}
