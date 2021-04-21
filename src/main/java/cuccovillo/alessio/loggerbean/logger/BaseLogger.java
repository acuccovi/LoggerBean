package cuccovillo.alessio.loggerbean.logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public abstract class BaseLogger {
    private final Logger logger;

    public BaseLogger(Logger logger) {
        this.logger = logger;
    }

    public void logInfo(String msg) {
        logger.info(msg);
    }

    public void logWarn(String msg) {
        logger.warning(msg);
    }

    public void logError(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        logger.severe(sw.toString());
    }
}
