package com.virtusa.myka.SpringDemo2;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	context.registerShutdownHook();
    	Circle circle = (Circle)context.getBean("circle");
    	circle.draw();
    	//System.out.println(context.getMessage("greeting", null, "Default greeting", null));
    }
}
