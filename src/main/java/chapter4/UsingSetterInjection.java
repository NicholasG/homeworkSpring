package chapter4;

import chapter4.annotation.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by yar65 on 11.12.2015.
 */
public class UsingSetterInjection {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();

        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }

}
