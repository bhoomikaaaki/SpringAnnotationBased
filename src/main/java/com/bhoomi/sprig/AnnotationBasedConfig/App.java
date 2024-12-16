package com.bhoomi.sprig.AnnotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorld.class);
        
        HelloWorld hw=context.getBean(HelloWorld.class);
        
        hw.sayHello();
        
    }
}
