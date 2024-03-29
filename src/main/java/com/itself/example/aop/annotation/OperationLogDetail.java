package com.itself.example.aop.annotation;

import com.itself.enums.OperationType;
import com.itself.enums.OperationUnit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
//@OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OperationLogDetail {

    /*
        方法描述，可使用占位符获取参数：{tel}
     */
    String detail() default "";

    /*
        日志等级：自己定，此处分为1-9
     */
    int level() default 0;
    /*
        操作类型（enum）：主要是select，insert，update，delete
     */
    OperationType operationType() default OperationType.UNKNOWN;
    /*
        被操作的对象（此处使用enum）：可以是任何对象，如表名（user），或者是工具（redis）
     */
    OperationUnit operationUnit() default OperationUnit.UNKNOWN;
}
