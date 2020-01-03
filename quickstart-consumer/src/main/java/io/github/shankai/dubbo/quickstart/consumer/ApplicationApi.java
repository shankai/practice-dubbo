package io.github.shankai.dubbo.quickstart.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import io.github.shankai.dubbo.quickstart.service.HelloService;

/**
 * ApplicationApi
 */
public class ApplicationApi {

    public static void main(String[] args) throws InterruptedException {

        // application
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-quickstart-api-consumer");

        // registry
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:12181");

        // service

        ReferenceConfig<HelloService> referenceConfigApi = new ReferenceConfig<>();
        referenceConfigApi.setApplication(applicationConfig);
        referenceConfigApi.setRegistry(registryConfig);
        referenceConfigApi.setInterface(HelloService.class);
        referenceConfigApi.setVersion("a.p.i");
        HelloService helloServiceApi = referenceConfigApi.get();
        String resultApi = helloServiceApi.hello();
        System.out.println("dubbo consumer:" + resultApi);
    }

}