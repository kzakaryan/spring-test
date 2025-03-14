package am.capstone.springtest.dirtycontext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = "custom.message=Injected Value")
@DirtiesContext
public class DirtyContextTest {

    @Autowired
    private AppConfig appConfig;

    @Test
    void testInjectedProperty() {
        assertEquals("Injected Value", appConfig.getMessage(), "The property should be 'Injected Value'");
    }
}