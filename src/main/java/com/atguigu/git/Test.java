package com.atguigu.git;

import static java.lang.Math.*;
/**
 * @ClassName: Test
 * @Description:
 * @date: 2022/9/27 18:05
 */

public class Test {
    public static void main(String[] args) {
        double x = 4;
        double y = sqrt(x);
        System.out.println(y);

        String a = "\u0022+\u0022" + "a";
        System.out.println(a);

        System.out.println("The square root of \u03c0 is " + sqrt(PI));

        double num = 9.997;
        int nx = (int) round(num);
        System.out.println(nx);

        System.out.println((byte) 300);
    }
}
