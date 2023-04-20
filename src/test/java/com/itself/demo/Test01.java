package com.itself.demo;

import com.google.common.collect.Lists;
import com.itself.demo.bean.User;
import com.itself.demo.bean.UserDTO;
import com.itself.utils.BeanConvertUtils;
import com.itself.utils.JwtUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xxw
 * @Date 2021/08/18
 */
public class Test01 {

    private static final Logger logger = LoggerFactory.getLogger(Test01.class);
    @Test
    public void test01(){
        Instant now = Instant.now();
        System.out.println("now = " + now);
    }
    @Test
    public void test02(){
        char c = 's';
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("c = " + c);
    }
    @Test
    public void test03(){
        BigDecimal b = new BigDecimal(0);
        BigDecimal a = new BigDecimal(202.200);
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(decimalFormat.format(b));
        System.out.println(b);
        System.out.println(b.compareTo(BigDecimal.ZERO));
        System.out.println(a.subtract(b));

        if (a.compareTo(b) > -1) {
            System.out.println("a大于等于b");
        }
        if (a.compareTo(b) < 1) {
            System.out.println("a小于等于b");
        }
        if(a.compareTo(b) < 0){
            System.out.println("a小于b");
        }
        if(a.compareTo(b) == 0){
            System.out.println("a等于b");
        }
        if(a.compareTo(b) > 0) {
            System.out.println("a大于b");
        }
    }

    @Test
    public void test04(){
        //==================== copy  Object =====================
        User user = new User().setAge("20").setName("xxw");
        // user = null;     //当user对象为空的时候，copy方法不会报错，也只会返回null
        System.out.println("复制前的数据："+user);
        //普通写法
        UserDTO userDTO = BeanConvertUtils.convertTo(user, UserDTO::new);
        System.out.println("复制后的数据："+userDTO);
        //lambda写法，可以对不同类型的字段进行手动赋值
        UserDTO dto = BeanConvertUtils.convertTo(user, UserDTO::new, (u, d) -> d.setAge(Integer.valueOf(u.getAge())));
        System.out.println("复制后的数据："+dto);

        System.out.println("=================================================");
        //==================== copy  List<Object> =====================
        User user1 = new User().setAge("22").setName("xw");
        ArrayList<User> users = Lists.newArrayList(user1);
        System.out.println("复制前的数据："+users);
        //普通写法
        List<UserDTO> dtos = BeanConvertUtils.convertListTo(users, UserDTO::new);
        System.out.println("复制后的数据："+dtos);
        //lambda写法，可以对不同类型的字段进行手动赋值
        List<UserDTO> dtoList = BeanConvertUtils.convertListTo(users, UserDTO::new, (u, d) -> d.setAge(Integer.valueOf(u.getAge())));
        System.out.println("复制后的数据："+dtoList);
    }

    @Test
    public void testToken(){
        String token = JwtUtils.createToken("xxw", "12");
        System.out.println(token);
    }
    @Test
    public void testLo4j(){
        logger.info("====springboot整合lo4j测试=====");
    }
}
