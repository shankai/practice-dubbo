package io.github.shankai.dubbo.quickstart.service;

import java.util.Date;

/**
 * HelloServiceXml
 */
public class HelloServiceXml implements HelloService {

    @Override
    public String hello() {
        return "Hello, Dubbo, I'm [xml] provider. Now --> " + new Date();
    }

}