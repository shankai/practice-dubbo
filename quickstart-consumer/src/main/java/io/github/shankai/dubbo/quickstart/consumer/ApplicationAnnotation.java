package io.github.shankai.dubbo.quickstart.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import io.github.shankai.dubbo.quickstart.service.HelloService;
import io.github.shankai.dubbo.quickstart.service.HelloServiceComponent;

/**
 * ApplicationAnnotation
 */
public class ApplicationAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConsumerConfiguration.class);
        context.start();
        HelloService hellloService = context.getBean("helloServiceComponent", HelloServiceComponent.class);
        String result = hellloService.hello();
        System.out.println("dubbo consumer:" + result);
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "io.github.shankai.dubbo.quickstart.service")
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = { "io.github.shankai.dubbo.quickstart.service" })
    static class ConsumerConfiguration {

    }
}