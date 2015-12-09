package chapter2;

/**
 * Created by yar65 on 09.12.2015.
 */
public interface MessageRenderer {
    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}
