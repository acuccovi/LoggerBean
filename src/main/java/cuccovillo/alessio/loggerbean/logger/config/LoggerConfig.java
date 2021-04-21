package cuccovillo.alessio.loggerbean.logger.config;

import cuccovillo.alessio.loggerbean.logger.BaseLogger;
import cuccovillo.alessio.loggerbean.logger.LoggerA;
import cuccovillo.alessio.loggerbean.logger.LoggerB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class LoggerConfig {

    @Bean
    public BaseLogger loggerA() {
        return new LoggerA(Logger.getLogger(LoggerA.class.getName()));
    }

    @Bean("loggerB")
    public BaseLogger getLoggerB() {
        return new LoggerB(Logger.getLogger(LoggerB.class.getName()));
    }

}
