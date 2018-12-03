package com.ayida.vertx.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    private static Logger LOG = LogManager.getLogger(Logging.class);

    private void print(final String str) {
        LOG.info("Printing : {}", str);
    }

    public static void main(final String[] args) {
        Logging test = new Logging();
        test.print("Dimitri est en train de tester");
        for(int i = 0; i < 5; i++) {
            test.print(i + "iteration in for loop");
        }
    }
}
