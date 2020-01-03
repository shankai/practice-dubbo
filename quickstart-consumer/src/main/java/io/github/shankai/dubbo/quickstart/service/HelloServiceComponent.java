package io.github.shankai.dubbo.quickstart.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * HelloServiceComponent
 */
@Component("helloServiceComponent")
public class HelloServiceComponent implements HelloService {

    @Reference
    private HelloService helloService;

    @Override
    public String hello() {
        return helloService.hello();
    }

}