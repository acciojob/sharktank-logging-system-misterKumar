package com.driver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SharkTankLogger {
    private String logFileName;
    private boolean writeToConsole;

    public SharkTankLogger(String logFileName, boolean writeToConsole) {
        this.logFileName = logFileName;
        this.writeToConsole = writeToConsole;
    }

    public void log(LogLevel level, String message) {
    	//your code goes here
        String formattedMessage = getFormattedMessage(level, message);
        if (writeToConsole) {
            writeToConsole(formattedMessage);
        }
        writeToFile(formattedMessage);
    }

    private String getFormattedMessage(LogLevel level, String message) {
    	//your code goes here
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return String.format("[%s] %s - %s", level.toString(), timestamp, message);
    }

    private void writeToConsole(String message) {
    	//your code goes here
        System.out.println(message);
    }

    private void writeToFile(String message) {
    	//your code goes here
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName, true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SharkTankLogger logger = LoggerFactory.createLogger("sharktank.log", true);

        logger.log(LogLevel.INFO, "John Doe has entered the tank!");
        logger.log(LogLevel.WARN, "Technical issue: Camera malfunction");
        logger.log(LogLevel.ERROR, "System error: Database connection lost");
    }
}

