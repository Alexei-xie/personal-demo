package com.itself.demo.bean;

import java.util.Objects;

/**
 * @Author xxw
 * @Date 2023/01/19
 */
public class Stu {
    private String name;
    private Integer age;

    /**
     * 重写equals方法是为了做将不同的对象的内容做比较，若属性值都一致则认为是两对象相等
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stu stu = (Stu) o;
        return Objects.equals(name, stu.name) && Objects.equals(age, stu.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 重写toString是对对象的输出形式进行一种格式化
     * 不重写的话输出的结果是对象的地址值
     * 重写的话输出便是对象的各个属性值
     */
    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
class StuTest{
    public static void main(String[] args) {
        Stu stu = new Stu();
        stu.setAge(11);
        Stu stu2 = new Stu();
        stu2.setAge(11);
        System.out.println(stu2.equals(stu));
        System.out.println(stu2 == stu);
        User xxw = new User().setName("xxw").setAge(null);
        User xx2 = new User().setName("xxw").setAge(null);
        System.out.println(xxw.equals(xx2));
    }
}