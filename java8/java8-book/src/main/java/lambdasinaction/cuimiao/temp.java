package lambdasinaction.cuimiao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class temp {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2017-06-22 11:49:00";
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Date date = sdf.parse(dateStr);
        Date today = new Date();
        Long time = today.getTime() - date.getTime();
        System.out.println("毫秒:" + time);
        System.out.println("秒  :" + time/1000);
        System.out.println("分  :" + time/1000/60);
        System.out.println("小时:" + time/1000/60/60);
        System.out.println("天  :" + time/1000/60/60/24);
    }
}
