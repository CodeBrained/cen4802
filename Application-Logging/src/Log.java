import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler fh;

    public Log(String fileName) throws SecurityException, IOException {
        File file = new File(fileName);
        if(!file.exists()) {
            file.createNewFile();
        }
        fh = new FileHandler(fileName, true);
        logger = Logger.getLogger("test");
        logger.addHandler(fh);

        // Modify settings for the logging formatter to format each log as:
        //      <YYYY-MM-DD> <hh:mm:ss> <LogLevel> <ClassName> <MethodName> <LogMessage>
        // Example: 2023-10-29 21:55:56 WARNING Main main Example warning message
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT [%4$s] %2$s %5$s%6$s%n");
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}
