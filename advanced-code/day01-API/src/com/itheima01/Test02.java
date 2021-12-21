package com.itheima01;

public class Test02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));//true

        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);
//        System.out.println(stu1.equals(stu2));//重写方法前：false

        //认为同姓名和同年龄的就是同一个人
        System.out.println(stu1.equals(stu2));//重写方法后：true
    }
}
