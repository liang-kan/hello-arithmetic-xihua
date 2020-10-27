import java.util.Date;

/**
 * @author: xihuaL
 * @since: 2020/10/27/9:18
 **/

public class MyDate {
    int year;
    int month;
    int day;


    //无参构造
    public MyDate() {
        year = 2020;
        month = 10;
        day = 27;
    }
    //有参构造
    public MyDate(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //流逝时间
    public MyDate(long time) {
        time=System.currentTimeMillis();
    }
    // 一个名为setDate(long elapsedTime)使用流逝的时间为对象设置新数据的方法。
    public void setDate(long elapseTime) {
        day=(int)elapseTime/1000/3600/24%31;//以天为基本单位，秒转化为小时，转为天

        month=day%31;
        year=month%12;
        System.out.println("当前: "+year+"年 "+month+"月"+day+"日");
    }

    //返回年份方法
    public int getYear() {
        return year;
    }
    //返回月份
    public int getMonth() {
        return month;
    }
    //返回天数方法
    public int getDay() {
        return day;
    }
}
