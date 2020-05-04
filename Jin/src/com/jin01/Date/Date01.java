package com.jin01.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description: 日期
 * @author: HuangJing
 * @date: 2019/12/18  16:24:30
 * @Version: 1.0
 **/
public class Date01 {
    public static void main(String[] args) throws ParseException {
//        System.out.println(System.currentTimeMillis() );
//        getDate();
//        getDate1();
//        getDate2();
//        getDate3();
//        getDate4();
        getDate5();
    }

    public static void getDate(){
        Date date = new Date();
        System.out.println(date);
    }
    public static void getDate1(){
        Date date = new Date(1576658070562L);
        System.out.println(date);
    }
    private static void getDate2(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void getDate3(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String formatDate = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(formatDate);
    }
    private static void getDate4() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = simpleDateFormat.parse("2019年12月19日 09:01:10");
        System.out.println(date);

    }
    private static void getDate5() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(Calendar.YEAR);
        int i1 = instance.get(Calendar.MONTH);//西方月份0-11 东方 1-12
        int i2 = instance.get(Calendar.DATE);
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(instance);

    }
}
