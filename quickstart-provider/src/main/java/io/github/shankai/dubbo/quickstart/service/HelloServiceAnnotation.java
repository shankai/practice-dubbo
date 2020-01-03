package io.github.shankai.dubbo.quickstart.service;

import java.util.Date;

import org.apache.dubbo.config.annotation.Service;

import io.github.shankai.dubbo.quickstart.service.HelloService;

/**
 * HelloServiceAnnotation
 */
@Service
public class HelloServiceAnnotation implements HelloService {

    @Override
    public String hello() {
        return "Hello, Dubbo, I'm [annotation] provider. Now --> " + new Date();
    }

    
}