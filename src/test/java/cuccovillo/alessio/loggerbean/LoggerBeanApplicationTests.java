package cuccovillo.alessio.loggerbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggerBeanApplicationTests {
    private final ClassA a;
    private final ClassB b;

    @Autowired
    public LoggerBeanApplicationTests(ClassA a, ClassB b) {
        this.a = a;
        this.b = b;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void loggerA() {
        a.doLog();
    }

    @Test
    void loggerB() {
        b.doLog();
    }
}
