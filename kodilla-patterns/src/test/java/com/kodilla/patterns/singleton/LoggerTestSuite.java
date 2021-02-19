package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLog(){
        logger = Logger.LOG;
        logger.log("First Log");
    }

    @Test
    void testGetLastLog(){
        //Given
        //When
        String logName = logger.getLastLog();
        //Then
        assertEquals("First Log", logName);
    }

}
