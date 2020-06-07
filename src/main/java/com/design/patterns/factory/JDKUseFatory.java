package com.design.patterns.factory;

import java.util.Calendar;

/**
 * @Classname JDKUseFatory
 * @Description TODO
 * @Date 2020/3/14 18:36
 * @Created by yang
 */
public class JDKUseFatory {
    public static void main(String[] args) {
        //静态方法
        Calendar cal=Calendar.getInstance();
        System.out.println(" 年 :"+ cal.get(Calendar.YEAR));
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println(" 月 :"+ (cal.get(Calendar.MONTH) + 1));
        System.out.println(" 日 :"+ cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(" 时 :"+ cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(" 分 :"+ cal.get(Calendar.MINUTE));
        System.out.println(" 秒 :"+ cal.get(Calendar.SECOND));

    }
}
