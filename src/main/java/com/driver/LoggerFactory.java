package com.driver;

public class LoggerFactory {
    public static SharkTankLogger createLogger(String logFileName, boolean writeToConsole) {
    	//your code goes here
        return new SharkTankLogger(logFileName, writeToConsole);
    }
}

