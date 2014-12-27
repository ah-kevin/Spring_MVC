package org.hf520.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by kevin on 2014/12/27.
 * 定义了一个BeanValidation的@Phone的约束注解
 *校验采用phoneValidator.java实现验证逻辑
 */
//定义在变量定义前,或者方法前
@Target({ElementType.FIELD,ElementType.METHOD})
//运行时有效
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =PhoneValidator.class )
public @interface Phone {
    //定义messages属性值,默认值为"";
    String message() default "";
    //定义groups属性
    Class<?>[] groups() default {};
    //定义payload属性
    Class<? extends Payload>[] payload() default {};
}
