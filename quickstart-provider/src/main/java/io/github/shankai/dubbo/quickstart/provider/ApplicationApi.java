package io.github.shankai.dubbo.quickstart.provider;

import java.util.concurrent.CountDownLatch;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import io.github.shankai.dubbo.quickstart.service.HelloService;
import io.github.shankai.dubbo.quickstart.service.HelloServiceApi;

/**
 * ApplicationApi
 */
public class ApplicationApi {

    public static void main(String[] args) throws InterruptedException {

        // application
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-quickstart-api-privider");

        // registry
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:12181");

        // protocol
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);

        // service

        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setRegistry(registryConfig);

        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceApi());
        serviceConfig.setVersion("a.p.i");

        serviceConfig.export();

        System.out.println("dubbo service started. [api]");
        new CountDownLatch(1).await();
    }

}