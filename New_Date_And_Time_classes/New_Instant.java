/*
5. Instant
Represents a single point in time, in UTC (e.g., 2025-01-13T09:30:45Z).
Useful for timestamps in applications like logs or database entries.
 */
package New_Date_And_Time_classes;

import java.time.Instant;

public class New_Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        System.out.println(now.getEpochSecond()); //Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
    }
}
