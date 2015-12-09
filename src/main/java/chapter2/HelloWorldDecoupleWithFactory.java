package chapter2;

/**
 * Created by yar65 on 09.12.2015.
 */
public class HelloWorldDecoupleWithFactory {

    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
