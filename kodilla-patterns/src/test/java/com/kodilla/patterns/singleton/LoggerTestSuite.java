package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void setLogName(){
        Logger.getInstance().log("LogNumber151645748");
    }
    @Test
    public void testGetLastLog(){
        String log = Logger.getInstance().getLastLog();
        Assert.assertEquals("LogNumber151645748", log);
    }
}
