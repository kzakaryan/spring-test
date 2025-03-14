package am.capstone.springtest.dirtycontext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DefaultContextTest {

    @Autowired
    private AppConfig appConfig;

    @Test
    void testDefaultProperty() {
        assertEquals("default", appConfig.getMessage(), "The default value should be 'default'");
    }
}