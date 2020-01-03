package io.github.shankai.dubbo.quickstart.service;

import java.util.Date;

/**
 * HelloServiceApi
 */
public class HelloServiceApi implements HelloService {

    public String hello() {
        return "Hello, Dubbo. I'm [api] provider. Now --> " + new Date();
    }

}