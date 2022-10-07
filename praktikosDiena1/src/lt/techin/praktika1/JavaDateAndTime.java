package lt.techin.praktika1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Date date = Calendar.getInstance().getTime();
        System.out.println(date);
        //        print Fri Oct 07 19:09:48 EEST 2022
        String formatString = "yyyy-MM-dd hh:mm:ss"; // nusistatom savo formata
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
        String formattedDate = simpleDateFormat.format(date); // pritaikom formata
        System.out.println(formattedDate); // print 2022-10-07 07:14:34

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // print 2022-10-07

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.now();
        time1 = LocalTime.MIDNIGHT;
        time2 = LocalTime.NOON;
        System.out.println(time1); // print 00:00
        System.out.println(time1.plusMinutes(1)); // print 00:01
        System.out.println(time2.getMinute()); // print 0
    }
}
