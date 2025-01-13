package New_Date_And_Time_classes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class new_Date_Time_Formatter {
    public static void main(String[] args) {
        String s="09/23/2001";

        DateTimeFormatter myDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate parsed = LocalDate.parse(s, myDate);

        String formatted = parsed.format(myDate);

        System.out.println(formatted);
    }
}
