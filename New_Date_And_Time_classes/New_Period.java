
/*
Period: Represents a date-based amount of time (e.g., 2 years, 3 months, 5 days).
 */
package New_Date_And_Time_classes;

import java.time.LocalDate;
import java.time.Period;

public class New_Period {
    public static void main(String[] args) {
        LocalDate myBD = LocalDate.of(2001, 8,19);
        LocalDate now = LocalDate.now();

        Period age = Period.between(myBD, now);
        System.out.println(age);

        System.out.println(age.toTotalMonths());
    }
}
