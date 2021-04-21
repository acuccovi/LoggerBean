package cuccovillo.alessio.loggerbean;

import cuccovillo.alessio.loggerbean.logger.BaseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private final BaseLogger logger;

    @Autowired
    public ClassB(BaseLogger loggerB) {
        this.logger = loggerB;
    }

    public void doLog() {
        logger.logInfo("InfoB");
        logger.logWarn("WarnB");
        logger.logError(new Exception("ErrorB"));
    }
}
