package com.itheima01;

import java.util.Objects;

public class Test03 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";
//        System.out.println(s1.equals(s2));
        boolean result = Objects.equals(s1,s2);
        System.out.println(result);
    }
}
