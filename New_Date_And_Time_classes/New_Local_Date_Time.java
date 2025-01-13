/*
3. LocalDateTime
Combines date and time, but still without a time zone (e.g., 2025-01-13T10:15:30).
Useful for timestamps in applications.
 */

package New_Date_And_Time_classes;

import java.time.LocalDateTime;

public class New_Local_Date_Time {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        String s="2001-08-19T12:05";
        LocalDateTime parse = LocalDateTime.parse(s);
        System.out.println(parse);
    }
}
