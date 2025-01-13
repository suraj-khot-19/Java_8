/*
4. ZonedDateTime
Represents a date and time with a specific time zone (e.g., 2025-01-13T10:15:30+05:30[Asia/Kolkata]).
Useful for applications requiring precise time zones.
 */
package New_Date_And_Time_classes;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class New_Zoned_Date_Time {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println(now);

        //available zones
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        availableZoneIds.forEach(System.out::println);
    }
}
