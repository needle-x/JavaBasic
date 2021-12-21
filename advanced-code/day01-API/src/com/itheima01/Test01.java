package com.itheima01;

public class Test01 {
    public static void main(String[] args) {
        String str = "abc";
        //默认调用toString方法
        System.out.println(str);//abc //String中已经重写了toString方法

        Student s = new Student("张三",23);
        //Student中未对toString方法进行重写
//        System.out.println(s);//com.itheima01.Student@75412c2f
        System.out.println(s);//Student{name='张三', age=23}
    }
}
