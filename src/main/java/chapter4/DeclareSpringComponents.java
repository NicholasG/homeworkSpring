package chapter4;

import chapter4.annotation.HelloWorldMessageProvider;
import chapter4.annotation.MessageProvider;
import chapter4.annotation.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by yar65 on 10.12.2015.
 */
public class DeclareSpringComponents {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("app-context-xml.xml");
//        ctx.load("classpath:app-context-xml.xml");
//        ctx.refresh();

        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
        messageRenderer.render();
    }

}
