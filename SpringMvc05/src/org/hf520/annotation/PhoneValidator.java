package org.hf520.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kevin on 2014/12/27.
 * 注解@Phone的校验器,实现以下校验逻辑
 * 非空,而且必须以13,15,18开始的手机号
 */
public class PhoneValidator implements ConstraintValidator<Phone,String> {
    private  String PhoneReg ="^1[3|5|8]\\d{9}$";
    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //根据验证规则编写校验逻辑
        //是否为空
        if (s ==null||"".equals(s)){
            return false;
        }
        //检查13,15,18的格式`
        //根据phoneReg正则表达式字符串生成一个patten
        Pattern phonePatten = Pattern.compile(PhoneReg);
        Matcher matcher=phonePatten.matcher(s);
        return  matcher.matches();//返回是否匹配,true匹配,false不匹配;
    }
}
