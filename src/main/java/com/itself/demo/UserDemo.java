package com.itself.demo;

import com.google.common.collect.Lists;
import com.itself.demo.bean.User;

import java.text.ParseException;
import java.util.ArrayList;

/**
 * @Author xxw
 * @Date 2021/09/29
 */
public class UserDemo {
    public static void main(String[] args) throws ParseException {

//        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd");
//
//        String format = sdf.format(new Date());
//        Date date = sdf.parse("20220124");
//        System.out.println(format);
//        System.out.println(date);
        User user = new User();
//        user.setName("张三");
        user.setAge(" 1 ");
//        List<User> list = new ArrayList<>();
//        list = null;
//        UserDTO userDTO = new UserDTO();
//
//        NotNull.getList(list).stream().forEach(e->{
//            BeanUtils.copyProperties(e,userDTO);
//        });
//        boolean blank = StringUtils.isBlank(user.getAge());
//        System.out.println("blank = " + blank);
//        System.out.println(user.getAge());
//        String string = ObjectUtils.getDisplayString(user.getAge().trim());

        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects.size());
        System.out.println(user.getAge().equals(null));
        System.out.println(Lists.newArrayList(user));
        System.out.println(Lists.newArrayList(user).size());
    }
}
