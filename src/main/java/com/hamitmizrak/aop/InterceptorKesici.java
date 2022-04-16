package com.hamitmizrak.aop;


import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//interceptor
@InterceptorBinding
@Inherited

@Target({TYPE,METHOD})
@Retention(RUNTIME)
@Documented
public @interface InterceptorKesici {
}
