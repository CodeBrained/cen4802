/*
Cristian King
CEN4802 - Assignment 9: Logging
Constraints:
[x] Use any of the frameworks described in Java Logging Basics Links to an external site. (or similar).
[x] Display the log entries in the console.
[x] Also write the log entries to a file.
[x] Display / record at least three levels of severity.
[x] Log entries must contain timestamps.
[x] Logs must display in a text editor and be human-readable.
[x] Your program must write at least one-hundred log entries when it runs.
 */

import java.time.*;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        try {
            Log myLog = new Log("log.txt");
            myLog.logger.setLevel(Level.ALL);

            // Appending program start time to log.txt
            LocalDateTime currentTime = LocalDateTime.now();
            String formattedDateTime = currentTime.format(formatter);
            myLog.logger.info("Program starting at : " + formattedDateTime);
            myLog.logger.info("The first 100 odd numbers starting at " + num1);

            // Displays odd numbers from range 1 - 201
            for(int i = 0; i < 100; i++) {
                myLog.logger.info(String.valueOf(num1));
                num1 += num2;
            }

            myLog.logger.warning("Example warning message");
            myLog.logger.severe("Example severe message");

            // Appending program end time to log.txt
            currentTime = LocalDateTime.now();
            formattedDateTime = currentTime.format(formatter);
            myLog.logger.info("Program ending at : " + formattedDateTime);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}