/*
Duration: Represents a time-based amount of time (e.g., 2 hours, 30 minutes).
 */
package New_Date_And_Time_classes;

import java.time.Duration;
import java.time.LocalDateTime;

public class New_Duration {
    public static void main(String[] args) {
        LocalDateTime myBD = LocalDateTime.of(2001, 8, 19, 12, 30);
        LocalDateTime now = LocalDateTime.now();
        Duration age = Duration.between( myBD,now);

    }
}
