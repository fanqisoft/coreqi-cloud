1.微服务架构与SpringCloud

​	1.微服务架构概述

​		Martin Fowler（马丁.福勒）在2014年3月份提出了微服务架构，一种新的架构体系，微小的服务、独立的进程、轻量级、可以独立部署。

​		微服务架构是一种架构模式，它提倡将单一应用程序划分成一组小的服务，服务之间互相协调、互相配合，为用户提供最终价值。每个服务运行在其独立的进程中，服务与服务间采用轻量级的通信机制互相协作（通常是基于HTTP协议的RESTful API）。每个服务都围绕着具体业务进行构建，并且能够被独立的部署到生产环境、类生产环境等。另外，应当尽量避免统一的、集中式的服务管理机制，对具体的一个服务而言，应根据业务上下文，选择合适的语言、工具对其进行构建。

​	2.Spring Cloud简介

​		1.一些术语

​			服务注册与发现	Eureka

​			服务调用	Ribbon	Feign

​			服务熔断	Hystrix

​			负载均衡	Ribbon	Feign

​			服务降级

​			服务消息队列

​			配置中心管理	Spring Cloud Config

​			服务网关	Zuul

​			服务监控

​			全链路追踪

​			自动化构建部署

​			服务定时任务调度操作

​		2.SpringCloud简介

​			SpringCloud是分布式微服务架构的一站式解决方案，是多种微服务架构落地技术的集合体，俗称微服务全家桶。

​	3.Spring Cloud技术栈

​		1.Spring Cloud Config	Spring	分布式配置中心和管理	配管管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，目前支持本地存储、Git以及Subversion。

​		2.Spring Cloud Bus	Spring	消息总线	事件、消息总线，用于在集群（例如，配置变化事件）中传播状态变化，可与Spring Cloud Config联合实现热部署

​		3.Eureka	Netfilx	服务注册与发现【逐渐被替换，停止更新】，云端服务发现，一个基于REST的服务，用于定位服务，以实现云端中间层服务发现和故障转移。

​		4.Hystuix	Netfilx	熔断器，容错管理工具，旨在通过熔断机制控制服务和第三方库的节点，从而对延迟和故障提供更强大的容错能力。

​		5.Zuul	Netfilx	Zuul是在云平台上提供动态路由、监控、弹性、安全等边缘服务的框架，Zuul相当于是设备和Netfilx流应用的Web网站后端所有请求的前门

​		6.Archaius	Netfilx	配置管理API，包含一系列配置管理API，提供动态类型化属性、线程安全配置操作、轮询框架、回调机制等功能。

​		7.Consul	HashCorp	封装了Consul操作，consul是一个服务发现与配置工具，与Docker容器可以无缝集成。

​		8.Spring Cloud Sleuth	Spring	日志收集工具包，封装了Dapper和log-based追踪以及Zipkin和Htrace操作，为SpringCloud应用实现了一种分布式追踪解决方案。

​		9.Spring Cloud Data Flow	Pivotal	大数据操作工具，作为Spring XD的替代产品，它是一个混合计算模型，结合了流数据与批量数据的处理方式。

​		10.Spring Cloud Security	Spring	基于Spring Security的安全工具包，为你的应用程序添加安全控制。

​		11.Spring Cloud Zookeeper	Spring	操作Zookeeper的工具包，用于使用zookeeper方式的服务发现和配置管理。

​		12.Spring Cloud Stream	Spring	数据流操作开发包，封装了与Redis Rabbit、Kafka等发送接收消息

​		13.Spring Cloud CLI	Spring	基于SpringBoot CLI，可以让你以命令行方式快速建立云组件。

​		14.Ribbon	Netfilx	提供云端负载均衡，有多种负载均衡策略可供使用，可配合服务发现和断路器使用。

​		15.Feign	OpenFeign	Feign是一种声明式、模板化的HTTP客户端。

​		16.Spring Cloud Task	Spring	提供云端计划任务管理、任务调度

​		17,Spring Cloud Connectors	Spring	便于云端应用程序在各种PaaS平台连接到后端，如：数据库和消息代理服务。

​		18.Spring Cloud Cluster	Spring	提供Leadersh选举，如：Zookeeper、Redis、Haze、Consul等常见状态模式的抽象和实现。

​		19.Spring Cloud Starters	Pivotal	SpringBoot式的启动项目，为Spring Cloud提供开箱即用的依赖管理。

​		20.Spring Cloud for Cloud Foundty	Pivotal	通过Oauth2协议绑定服务搭配Cloud oundy Clound 等Vmware推出的开源PaaS云平台

​		21.Turbine	Netfilx	Turbine是整合服务器发送事件流数据的一个工具，用来监控集群下hystrix的mecs情况。

​	4.SpringCloud版本关系

​		采用英国伦敦地铁站的名称来命名并由地铁站名称字母A-Z依次类推的形式来发布迭代版本。

​		SpinrgCloud是一个由许多子项目组成的综合项目，各子项目有不同的发布节奏。为了管理SpringCloud与各子项目的版本依赖关系，发布了一个清单，其中包括了某个SpringCloud版本对应的子项目版本。为了避免SpringCloud版本号与子项目版本号混淆，SpringCloud版本采用了名称而非版本号的命名方式。

​		当SpringCloud的发布内容积累到临界点或者一个重大bug被解决后，会发布一个“service releases”版本，简称SRX版本，比如Greenwich.SR2就是SpringCloud发布的Greenwich版本的第2个SRX版本。

​	5.SpringBoot和SpringCloud的版本选择

​		SpringCloud构建于SpringBoot的基础之上，因此它们之间有严格的依赖关系

​		https://spring.io/projects/spring-cloud#overview	官网版本依赖介绍

| SpringCloud版本 | SpringBoot版本 |
| --------------- | -------------- |
| Hoxton          | 2.2.x          |
| Greenwich       | 2.1.x          |
| Finchley        | 2.0.x          |
| Edgware         | 1.5.x          |
| Dalston         | 1.5.x          |

​		https://start.spring.io/actuator/info	官网更加详细的版本依赖介绍

​		https://cloud.spring.io/spring-cloud-static/Hoxton.SR3/reference/html/spring-cloud.html	还可以在Spring Cloud的版本介绍中查看官方推荐的SpringBoot版本

​	6.笔记选型的技术标准

​		1.Spring Cloud Hoxton.SR1

​		2.Spring Boot	2.2.2.RELEASE

​		3.Spring Cloud Alibaba	2.1.0.RELEASE

​		4.Java	Java8

​		5.Maven	3.5及以上

​		6.Mysql	5.7及以上

​	7.pom

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>2.2.2.RELEASE</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-dependencies</artifactId>
        <version>Hoxton.SR1</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-alibaba-dependencies</artifactId>
        <version>2.1.0.RELEASE</version>
        <type>pom</type>
        <scope>import</scope>
    </dependency>
</dependencies>
```

3.关于Spring Cloud各种组件的停更/升级/替换

| 服务注册中心                              | 服务调用                                        | 服务调用       |                   服务降级                   | 服务网关                                            | 服务配置                                  | 服务总线                                  |
| ----------------------------------------- | ----------------------------------------------- | -------------- | :------------------------------------------: | --------------------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| ✘Eureka【停更不停用】                     | ✔Ribbon【停更，官方建议继续使用】               | ✘Feign【停更】 |      ✘Hystrix【停更，国内大多数还在用】      | ✘Zuul【停更，社区分裂】                             | ✘Config                                   | ✘Bus                                      |
| ✔Zookeeper                                | ✔LoadBalancer【将来替换Ribbon，目前功能不完善】 | ✔OpenFeign     |     ✔resilience4j【国外社区推荐用这个】      | ！Zuul2【计划中，未完成，人员问题估计永远出不来了】 | apolo【阿波罗，携程】                     | ✔Nacos【SpringCloud Alibaba，推荐，重点】 |
| ✔Consul【不推荐】                         |                                                 |                | ✔Sentinel【SpringCloud Alibaba，推荐，重点】 | ✔Gateway【Spring官方，推荐，重点】                  | ✔Nacos【SpringCloud Alibaba，推荐，重点】 |                                           |
| ✔Nacos【SpringCloud Alibaba，推荐，重点】 |                                                 |                |                                              |                                                     |                                           |                                           |

​	SpringCloud中文文档：https://www.bookstack.cn/read/spring-cloud-docs/docs-index.md

4.Maven的pom文件中<dependencyManagement>和<dependencies>的区别

​	1.<dependencyManagement>

​		Maven使用<dependencyManagement>元素提供了一种管理依赖版本号的解决方案。通常会在一个组织或项目最顶层的pom文件中看到<dependencyManagement>元素。

​		父工程中pom文件中的<dependencyManagement>元素可以让所有子项目引用一个依赖而不用显式的声明版本号。Maven会沿着父子层级向上走，直到找到一个拥有<dependencyManagement>元素的项目，然后它就会使用在这个元素中所指定的依赖版本号。

​		好处：

​			1.如果多个子项目引用同一依赖，可以避免在多个子项目中声明版本号。

​			2.当升级依赖时，只需要修改顶层父容器的版本号即可。

​			3.如果某个子项目需要使用不同的版本号，只需要声明<version>即可。

​		注意：

​			1.<dependencyManagement>元素中仅仅只是声明依赖，并不实现引入，因此子项目中需要显式的声明需要引用的依赖。

​			2.如果不在子项目中声明依赖，是不会从父项目中继承下来的，只有在子项目中写了该依赖项并且没有指定具体版本，才会从父项目中继承该项，并且<version>和<scope>都读取自父pom

​			3.如果子项目中指定了版本号，那么将会使用子项目中指定的版本。

​		父工程创建完成后可以执行```mvn:install```将父工程发布到仓库中，方便子工程继承。

5.Maven跳过单元测试

​	点击IDEA的Maven工具栏闪电按钮即可

