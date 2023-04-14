package com.itself.example.supplier.demo;

import org.apache.commons.lang3.StringUtils;

/**
 * function函数校验工具类demo
 * @Author xxw
 * @Date 2023/04/14
 */
public class FunctionUtil {


    public static void main(String[] args) {
        // isTrue(true).throwMessage("错误信息");
      /*  isTrueOrFalse(true).trueOrFalseHandle(() -> {
            System.out.println("true");
        }, () -> {
            System.out.println("false");
        });*/
        isBlankOrNotBlank("1").presentOrElseHandle(System.out::println,()->{
            System.out.println("error");
        });
    }

    public static ThrowExceptionFunction isTrue(Boolean flag) {
        return message -> {
            if (flag) {
                throw new RuntimeException(message);
            }
        };
    }

    public static BranchHandle isTrueOrFalse(Boolean flag) {
        return (trueHandle, falseHandle) -> {
            if (flag) {
                trueHandle.run();
            } else {
                falseHandle.run();
            }
        };
    }

    public static PresentOrElseHandler<?> isBlankOrNotBlank(String str){
        return (consumer,runnable)->{
            if (StringUtils.isNotBlank(str)){
                consumer.accept(str);
            }else {
                runnable.run();
            }
        };
    }
}
