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
    }

    private String getFormattedMessage(LogLevel level, String message) {
    	//your code goes here
        return String.format("[%s] %s - %s", level.toString(), timestamp, message);
    }

    private void writeToConsole(String message) {
    	//your code goes here
    }

    private void writeToFile(String message) {
    	//your code goes here
    }
}

