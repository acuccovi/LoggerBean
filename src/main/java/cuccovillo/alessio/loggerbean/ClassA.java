package cuccovillo.alessio.loggerbean;

import cuccovillo.alessio.loggerbean.logger.BaseLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private final BaseLogger loggerA;

    @Autowired
    public ClassA(BaseLogger loggerA) {
        this.loggerA = loggerA;
    }

    public void doLog() {
        loggerA.logInfo("InfoA");
        loggerA.logWarn("WarnA");
        loggerA.logError(new Exception("ErrorA"));
    }
}
