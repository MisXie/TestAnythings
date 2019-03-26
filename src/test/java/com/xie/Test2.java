package com.xie;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019-03-25.
 */
public class Test2 {

  @Test
  public void testCalendar(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY MM dd HH:mm:ss");
    Calendar calendar = Calendar.getInstance();
    //定义年份
    calendar.set(Calendar.YEAR,2018);
    //定义月份
    calendar.set(Calendar.DAY_OF_MONTH,10);
    //其他的时间若不定义将会使用当前的时间的
    System.out.println(simpleDateFormat.format(calendar.getTime()));
  }

  @Test
  public void testDate() throws InterruptedException {
    //默认当前系统时间
    Date date1 = new Date();
    date1.
  }
}
