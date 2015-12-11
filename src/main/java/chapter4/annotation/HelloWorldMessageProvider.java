package chapter4.annotation;

import chapter2.MessageProvider;
import org.springframework.stereotype.Service;

/**
 * Created by yar65 on 09.12.2015.
 */
@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
