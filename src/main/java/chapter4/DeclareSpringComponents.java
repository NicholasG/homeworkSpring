package chapter4;

import chapter4.annotation.HelloWorldMessageProvider;
import chapter4.annotation.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by yar65 on 10.12.2015.
 */
public class DeclareSpringComponents {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-annotation.xml");
        ctx.refresh();

        HelloWorldMessageProvider messageProvider = ctx.getBean("messageProvider", HelloWorldMessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }

}
