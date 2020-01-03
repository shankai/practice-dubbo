package io.github.shankai.dubbo.quickstart.provider;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationXml
 */
public class ApplicationXml {

    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();
        
        System.out.println("dubbo service started. [xml]");
        new CountDownLatch(1).await();
    }
}