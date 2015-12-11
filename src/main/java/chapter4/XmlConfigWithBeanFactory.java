package chapter4;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by yar65 on 10.12.2015.
 */
public class XmlConfigWithBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/xmlBeanFactory.xml"));

        Oracle oracle = factory.getBean("oracle", Oracle.class);
        System.out.println(oracle.defineMeaningOfLife());
    }

}
