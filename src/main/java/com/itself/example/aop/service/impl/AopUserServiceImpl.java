package com.itself.example.aop.service.impl;

import com.itself.example.aop.annotation.OperationLogDetail;
import com.itself.enums.OperationType;
import com.itself.enums.OperationUnit;
import com.itself.example.aop.service.AopUserService;
import org.springframework.stereotype.Service;

/**
 * @Author xxw
 * @Date 2021/08/17
 */
@Service
public class AopUserServiceImpl implements AopUserService {

    @OperationLogDetail(detail = "通过手机号{tel}获取用户名" ,level= 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)
    @Override
    public String findUserName(String user,String tel) {
        System.out.println("1.user:" + user );
        System.out.println("2.tel:" + tel);
        return "Blandness";
    }
}
