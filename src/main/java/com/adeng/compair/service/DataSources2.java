package com.adeng.compair.service;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;

@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface DataSources2 {
	String value() default "ORACLE";
}
