package New_Date_And_Time_classes;

import java.time.LocalTime;

public class New_Local_Time {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        System.out.println(now);

        ///  other functions
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        ///  custom
        LocalTime customTime=LocalTime.of(23,5,4,4);
        System.out.println(customTime);

        ///  minus
        System.out.println(now.minusMinutes(30));

        /// plus
        System.out.println(now.plusSeconds(500));
    }
}
