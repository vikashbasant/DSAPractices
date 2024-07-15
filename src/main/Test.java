package main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


    public static void main(String[] args) {
        long timestampMillis = 1701325591000L; // Ensure you use an 'L' at the end to denote a long value

        // Convert timestamp to Date object
        Date date = new Date(timestampMillis);

        // Format the Date object as a string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(date);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }


}
