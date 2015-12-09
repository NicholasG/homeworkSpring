package chapter2;

/**
 * Created by yar65 on 09.12.2015.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
