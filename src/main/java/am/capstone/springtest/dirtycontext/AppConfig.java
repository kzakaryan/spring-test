package am.capstone.springtest.dirtycontext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${custom.message:default}")
    private String message;

    public String getMessage() {
        return message;
    }
}