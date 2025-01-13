/*
1. LocalDate
Represents a date without a time zone (e.g., 2025-01-13).
Useful for representing a date like a birthday or an anniversary.
 */

package New_Date_And_Time_classes;
import java.time.LocalDate;

public class New_Local_Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);

        //other functions
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getYear());

        /// leap year
        if (today.isLeapYear()) {
            System.out.println("Leap year " + today.getYear());
        } else {
            System.out.println("Not a leap year");
        }

        //custom data
        LocalDate customDate=LocalDate.of(2001,8,19);
        System.out.println("birthday using custom date "+customDate);
    }
}
