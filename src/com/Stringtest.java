package com;

import java.util.Calendar;
import java.util.Date;

public class Stringtest {

	public static void main(String[] args) {
	   String aa="hellohellohellohellohellohello";
	   String bb="sdhfdsbvdjfhdscvkjsd";
	   String cc=aa+bb;
	   char c=aa.charAt(5);
	   System.out.println(true);
	   System.out.println(true);
	   System.out.println(true);
	   System.out.println(cc);
	   //ctrl+1 修复键
	   int a=(int) 100L;
	   Date dNow = new Date();   //当前时间
	   Date dBefore = new Date();

	   Calendar calendar = Calendar.getInstance(); //得到日历
	   calendar.setTime(dNow);//把当前时间赋给日历
	   calendar.add(Calendar.DAY_OF_MONTH, -2);  //设置为前一天
	   dBefore = calendar.getTime();   //得到前一天的时间
	   System.out.println(dBefore);

	}

}
