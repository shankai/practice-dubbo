package io.github.shankai.dubbo.quickstart.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.shankai.dubbo.quickstart.service.HelloService;

/**
 * ApplicationXml
 */
public class ApplicationXml {

    public static void main(final String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        HelloService helloService = context.getBean("helloService", HelloService.class);

        String resultXml = helloService.hello();
        System.out.println("dubbo consumer:" + resultXml);
    }
}