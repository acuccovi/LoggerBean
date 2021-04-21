package cuccovillo.alessio.loggerbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggerBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggerBeanApplication.class, args);
    }

    @Bean
    @Autowired
    CommandLineRunner runner(ClassA a, ClassB b) {
        return (args) -> {
            a.doLog();
            b.doLog();
        };
    }
}
