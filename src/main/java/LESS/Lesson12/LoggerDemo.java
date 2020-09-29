package LESS.Lesson12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
    private static Logger LOG = LogManager.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) {
        LOG.error("Log ERROR message");
        LOG.info("Log message");
        LOG.debug("Log DEBUG message");
    }
}
