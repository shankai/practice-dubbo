# Dubbo Practices

## Core Concept
- Service Provider
- Service Consumer
- Service Registry

## Service Registry - Zookeeper
1. download(release 3.5.6 available): http://zookeeper.apache.org/releases.html

2. configuration(conf/zoo.cfg)
```
tickTime=2000
dataDir=/opt/dev-server-data
clientPort=12181
admin.serverPort=18080
```
3. start
```
./bin/zkServer.sh start
```

## Quick Start 

QuickStart 示例中， 以 Zookeeper 为服务注册中心，分别以 API、XML、Annotation 3 种方式实现了简单的服务提供者与消费者应用示例。

### API

#### `quickstart-provider` 

- Service Interface: `HelloService.java`
- Service implement: `HelloServiceApi.java`
- Service Config: `ApplicationApi.java`

#### `quickstart-consumer` 

- Service Interface: `HelloService.java`
- Service Reference: `ApplicationApi.java`

### XML

#### `quickstart-provider` 

- Service Interface: `HelloService.java`
- Service implement: `HelloServiceXml.java`
- Service Config: `ApplicationXml.java`
- Configuration: `dubbo-provider.xml`

#### `quickstart-consumer` 

- Service Interface: `HelloService.java`
- Service Reference: `ApplicationXml.java`
- Configuration: `dubbo-consumer.xml`

### Annotation

#### `quickstart-provider` 

- Service Interface: `HelloService.java`
- Service implement: `HelloServiceAnnotation.java`
- Service Config: `ApplicationAnnotation.java`
- Configuration: `dubbo-provider.properties`

#### `quickstart-consumer` 

- Service Interface: `HelloService.java`
- Service Component: `HelloServiceComponent.java`
- Service Reference: `ApplicationAnnotation.java`
- Configuration: `dubbo-consumer.properties`