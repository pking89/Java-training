package com.learningjava.LoggingExamples;

import org.apache.log4j.Logger;

public class ExampleUsingLog4J {

    static Logger log = Logger.getLogger(ExampleUsingLog4J.class.getName());

    public static void println(String message){
        log.debug("debug level log4j-" + message);
        log.info("info level log4j-" + message);
    }
}
