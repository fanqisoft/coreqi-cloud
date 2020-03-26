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

6.IDEA Run Dashboard窗口【2019.3显示为Services】

​	通过修改项目.idea目录下的workspace.xml的方式来快速打开Run Dashboard窗口，在<component name="RunDashboard">下添加以下内容。

```xml
  <component name="RunDashboard">
    <option name="configurationTypes">
      <set>
        <option value="SpringBootApplicationConfigurationType" />
      </set>
    </option>
  </component>
```

7.Spring Boot热部署工具Devtools

​	修改代码后自动重启生效

​		1.在pom中添加devtools依赖

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
```

​		2.在pom中添加maven-plugin插件

```xml
  <build>
    <finaName>工程名称</finaName>	<!--可省略-->
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
          <fork>true</fork>
          <addResources>true</addResources>
        </configuration>
      </plugin>
    </plugins>
  </build>
```

​		3.在IDEA中开启自动编译选项

Settings => Build,Execution,Deployment => Compiler => 勾选以下选项

​			1.Automatically show first error in editor

​			2.Display notification on build completion

​			3.Build project automatically

​			4.Compile independent modules in parallel

​		4.开启idea热注册

​	按下Ctrl + Shift + Alt + /	在选项窗口中选中Registry，勾选以下选项

​			1.compiler.automake.allow.when.app.running

​			2.actionSystem.assertFocusAccessFromEdt

​		5.重启idea

8.RestTemplate

​	RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集。

​	官网Api介绍：https://docs.spring.io/spring-framework/docs/5.2.4.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html

​	使用RestTemplate访问restful接口非常的简单粗暴无脑，url、requestMap、ResponseBean.class这三个参数分别代表Rest请求地址、请求参数、Http响应的Json实体类型。

9.Eureka服务注册与发现【停止更新】

​	1.什么是服务治理

​		SpringCloud封装了Netflix公司开发的Eureka模块来实现服务治理。

​		在传统的RPC远程调用框架中，每个服务与服务之间的依赖关系及其管理比较复杂，所以需要使用服务治理来管理服务与服务之间的依赖关系，使用服务治理可以实现服务调用、负载均衡、容错、服务注册与发现等等。

​	2.什么是服务注册与发现

​		Eureka采用了CS（Client-Server）的设计架构，Eureka Server作为服务注册功能的服务器，它是服务注册中心。而系统中的其他微服务需要使用Eureka Client连接到Eureka Server并维持心跳连接，这样系统的维护人员就可以通过Eureka Server来监控系统中的各个微服务是否正常运行。

​		在服务注册与发现中，有一个注册中心。当服务器启动的时候，会把当前自己的服务器的信息，例如服务地址、通讯地址等以别名的方式注册到注册中心上。另一方（消费者 | 服务提供者）以该别名的方式去注册中心上获取到实际的服务通讯地址，然后再实现本地RPC调用。

​		RPC远程调用框架核心设计思想在于注册中心，因为使用注册中心来管理每个服务与服务之间的相互依赖关系（服务治理概念）

​		在任何RPC远程框架中，都会有一个注册中心用于存放服务地址的相关信息（接口地址）

​	3.Eureka两个组件

​		1.Eureka Server【提供服务注册服务】

​			各个微服务节点通过配置启动后，会在Eureka Server中进行注册，这样Eureka Server中的服务注册表中将会存储所有可用服务节点的信息。服务节点的信息可以通过界面直观的看到。

​		2.Eureka Client【通过注册中心进行访问】

​			Eureka Client是一个Java客户端，用于简化与Eureka Server的交互，客户端同时也具备一个内置的、使用轮询（round-robin）负载算法的负载均衡器。

​			在应用启动后，Eureka Client会在Eureka Server中进行注册并且向Eureka Server发送心跳（默认周期为30秒），如果Eureka Server在多个心跳周期内没有接受到某个节点的心跳，Eureka Server将会从服务注册表中把这个服务节点移除（默认90秒）

```yml
spring:
  application:
    name: cloud-payment-service
```

​		spring.application.name	就是最终在Eureka Server中注册的服务名

​	4.Eureka集群原理说明

​		服务注册：将服务信息注册进注册中心

​		服务发现：从注册中心上获取服务信息

​		实质：服务名 == key，服务调用地址 == value

​		整体工作流程和生命周期：

​			1.启动Eureka Server注册中心

​			2.启动服务提供者Payment支付服务

​			3.支付服务启动后会把自身信息（例如服务地址以别名的形式注册进Eureka Server）

​			4.消费者Order服务在需要调用接口时，使用服务别名去注册中心获取实际的PRC远程调用地址

​			5.消费者获得调用地址后，底层实际上是利用HttpClient技术实现远程调用。

​			6.消费者获得服务地址后会缓存在本地JVM内存中，默认每间隔30秒更新一次服务调用地址。

​		微服务远程服务调用最核心的是什么？

​			高可用，如果注册中心只有一个，如果它出现故障那么将导致整个微服务环境不可用。所以需要搭建Eureka注册中心集群，实现负载均衡和故障容错

​	5.Eureka集群

​		互相注册,相互守望

​	6.一些Eureka配置

​		1、主机名称修改

```yml
eureka:
	instance:
		instance-id: payment8001  #在Eureka注册中心显示的主机名称
```

​		2.显示ip地址

```yml
eureka:
	instance:
		prefer-ip-address: true #是否在Eureka注册中心显示ip地址
```

​	7.服务发现

​		通过服务发现可以获得所有在Eureka中注册的微服务信息。

​		1.在服务提供者的控制器中注入`DiscoveryClient`并使用该实例获取Eureka的相关服务

```java
@Resource
private DiscoveryClient discoveryClient;

@GetMapping("/payment/discovery")
public Object discovery(){
    List<String> services = discoveryClient.getServices();	//获取所有在Eureka中注册的服务名称列表
    for(String service : services){
        log.info("serviceName: " + service);
        List<ServiceInstance> instances = discoveryClient.getInstances(service);	//根据服务名获取服务的详细信息
        for(ServiceInstance instance : instances){
            log.info("服务Id: " + instance.getServiceId());
            log.info("服务主机: " + instance.getHost());
            log.info("服务端口: " + instance.getPort());
            log.info("服务Uri: " + instance.getUri());
        }
    }
    return this.discoveryClient;
}
```

​		2.在主启动类上添加`@EnableDiscoveryClient`注解开启服务发现。

```java
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //开启服务发现
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
```

​	8.Eureka自我保护

​		如果在Eureka Server的首页看到下面这段红字提示，则说明Eureka进入了保护模式

```text
EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.
```

​		保护模式主要用于一组客户端和Eureka Server之间存在网络分区场景下的保护。（某时刻某一个微服务不可用了，Eureka不会立刻清理，依旧会对该微服务的信息进行保存，属于CAP里面的AP分支，高可用的设计思想）

​		一旦进入保护模式，Eureka Server将会尝试保护其服务注册表中的信息，不再删除服务注册表中的数据，也就是说不会注销任何微服务。

​		1.为什么会产生Eureka自我保护机制

​			为了防止Eureka Client正常运行的状态下因为与Eureka Server网络不通而导致Eureka Server将Eureka Client的服务信息删除。

​		2.什么是自我保护模式

​			默认情况下，如果Eureka Server在一定时间内没有接收到某个微服务实例的心跳数据，Eureka Server将会注销该实例（默认90秒）。但是当网络分区发生故障时（延时、卡顿、拥挤），微服务与Eureka Server之间无法正常通信，以上行为可能变得非常危险了，因为微服务本身是健康的，此时本不应该注销这个微服务。

​			Eureka通过“自我保护模式”来解决这个问题，当Eureka Server节点在短时间内丢失过多的客户端时（可能发生了网络分区故障），那么这个节点就会进入自我保护模式。

​			自我保护机制：默认情况下Eureka Client定时向Eureka Server发送心跳包，如果Eureka Server在一定时间内（默认90秒）没有收到Eureka Client的心跳包，便会直接从服务注册列表中剔除该服务，但是在短时间（90秒中）内丢失了大量的服务实例心跳，这时候Eureka Server将会开启自我保护机制，不会再剔除服务（该现象可能出现在网络不通的情况下，Eureka Client仍在正常运行，此时如果换做别的注册中心在一定时间内没有收到心跳数据将会剔除该服务，这样就出现了严重失误，因为Eureka Client还能正常发送心跳，只是网络延迟问题，保护机制就是为了解决这类问题而产生的）

​			在自我保护模式中，Eureka Server会保护服务注册表中的信息，不再注销任何服务实例，它的设计哲学就是宁可保留错误的服务注册信息，也不盲目注销任何可能健康的服务实例。一句话讲解：好死不如赖活着

​			综上，自我保护模式是一种应对网络异常的安全保护措施，它的架构哲学是宁可同时保留所有的微服务（健康的微服务和不健康的微服务都会保留）也不盲目的注销任何健康的微服务，使用自我保护模式，可以让Eureka集群更加的健壮、稳定。

​		3.禁用自我保护

​		关闭Eureka Server的自我保护模式

```yml
eureka:
	server:
		enable-self-preservation: false	#关闭自我保护机制，保证不可用的服务被及时剔除
		eviction-interval-timer-in-ms: 2000	#2秒没收到心跳就干。
```

​		关闭后访问Eureka Server首页会出现以下红字提示：

```text
THE SELF PRESERVATION MODE IS TURNED OFF. THIS MAY NOT PROTECT INSTANCE EXPIRY IN CASE OF NETWORK/OTHER PROBLEMS.
```

​		关闭Eureka Client

```yml
eureka:
	instance:
		lease-renewal-interval-in-seconds: 1	#Eureka Client向 Eureka Server发送心跳的时间间隔，单位为秒，默认为30
		lease-expiration-duration-in-seconds: 2	#Eureka Server在收到最后一次心跳后等待时间上限，单位为秒(默认是90秒)，超时将剔除服务
```

​	9.Eureka停更说明

​		https://github.com/Netflix/eureka/wiki

10.Zookeeper注册中心

​	Zookeeper是一个分布式协调工具，可以实现注册中心功能。

​	需要关闭Linux服务器防火墙后启动Zookeeper服务器

```bash
systemctl stop firewalld	//关闭Linux服务器防火墙
systemctl status firewalld	//查看Linux服务器防火墙状态
ifconfig	//查看Linux网卡状态
./zkServer.sh start	//启动Zookeeper Server
./zkCli.sh	//client连接server
ls	/	//查看zookeeper根节点下面的子节点
get /zookeeper	//查看根节点信息
ls	/zookeeper	//查看根节点下面的子节点
create -e /k1 v1	//创建临时节点
```

​	使用Zookeeper服务器取代Eureka服务器，Zookeeper作为服务注册中心。

​	1.解决zookeeper版本jar包版本冲突问题

```xml
        <!--SpringBoot整合zookeeper客户端-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
            <!--先排除自带的zookeeper3.5.3-->
            <exclusions>
                <exclusion>
                    <groupId>org.apache.zookeeper</groupId>
                    <artifactId>zookeeper</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!--添加zookeeper3.4.9版本依赖-->
        <dependency>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
            <version>3.4.9</version>
        </dependency>
```

​	2.zookeeper znode节点

​		每一个微服务作为一个znode节点放到zookeeper里面。

​		zookeeper节点粗分分两种	临时节点	---	持久节点

​		zookeeper节点细分分四种	临时节点	---	带序号的临时节点	---	持久节点	---	带序号的持久节点

​		zookeeper 的服务节点是	临时的	如果微服务长时间没有回应zookeeper的心跳包那么该微服务将会被剔除

11.Consul服务注册与发现

​	1.Consul是什么？

​		https://www.consul.io/intro/index.html

​		Consul是一套开源的分布式服务发现和配置管理系统，由HashCorp公司采用Go语言开发。

​		Consul提供了微服务系统中的服务治理、配置中心、控制总线等功能，这些功能中的每一个都可以根据需要单独使用，也可以一起使用以构建全方位的服务网格，总之Consul提供了一种完整的服务网格解决方案。

​		它具有很多优点，包括：基于raft协议，比较简洁；支持健康检查，同时支持Http和DNS协议；支持跨数据中心的WAN集群；提供图形界面；跨平台；支持Linux、Mac、Windows；

​	2.Consul能干什么？

​		1.服务发现	---	提供Http和DNS两种发现方式

​		2.健康监测	---	支持多种方式，Http、Tcp、Docker、Shell脚本定制化

​		3.KV存储	---	Key、Value的存储方式，类似于Redis

​		4.多数据中心	---	Consul支持多数据中心

​		5.可视化Web界面

​		6.安全加固	

​	3.Consul下载

​		https://www.consul.io/downloads.html

​	4.Consul使用

​		https://www.springcloud.cc/spring-cloud-consul.html

​	5.Consul的安装说明

​		https://learn.hashicorp.com/consul/getting-started/install

​	6.Consul运行

​		下载完成后只有一个consul.exe文件，运行即可，然后执行命令。

```bash
consul.exe --version //查看版本号
consul agent -dev	//使用开发模式启动
```

​		通过以下地址访问Consul的首页

​		http://localhost:8500

12.三个注册中心（Eureka、Zookeeper、Consul）异同点

| 组件名    | 语言 | CAP  | 服务健康检查 | 对外暴露接口 | SpringCloud集成 |
| --------- | ---- | ---- | ------------ | ------------ | --------------- |
| Eureka    | Java | AP   | 可配支持     | HTTP         | 已集成          |
| Consul    | Go   | CP   | 支持         | HTTP/DNS     | 已集成          |
| Zookeeper | Java | CP   | 支持         | 客户端       | 已集成          |

​		C	==	数据一致性	A	==	高可用		P	==	分区容错性

​	C：Consistency（强一致性）

​	A：Availability（可用性）

​	P：Partition tolerance（分区容错性）

​	CAP理论关注粒度是数据，而不是整体？？？

​	分布式微服务架构P永远都要保证，所以我们的系统要么是CP，要么是AP

​	最多只能同时较好的满足两个。

​	CAP理论的核心是：一个分布式系统不可能同时很好的满足一致性，可用性和分区容错性这三个需求，因此，根据CAP原理将NoSQL数据库分成了满足CA原则、满足CP原则和满足AP原则三大类：

​		1.CA	-	单点集群，满足一致性，可用性的系统，通常在可扩展性上不太强大。

​		2.CP	-	满足一致性，分区容忍性的系统，通常性能不是特别高。

​		3.AP	-	满足可用性，分区容忍性的系统，通常可能对一致性要求低一些。

​	AP架构：当网络分区出现后，为了保证可用性，系统B可以返回旧值，保证系统的可用性。

​	结论：违背了一致性C的要求，只满足可用性和分区容错，即AP

​	CP架构：当网络分区出现后，为了保证一致性，就必须拒绝请求，否则无法保证一致性。

​	结论：违背了可用性A的要求，只满足一致性和分区容错，即CP

13.Ribbon负载均衡服务调用

​	1.Ribbon是什么?

​		Spring Cloud Ribbon是基于Netflix Ribbon实现的一套`客户端`【即在服务消费端部署】的负载均衡工具。

​		Ribbon是Netflix发布的开源项目，主要功能是提供`客户端`的软件负载均衡算法和服务调用，Ribbon客户端组件提供一系列的配置项，如：连接超时、重试等等。简单的说，就是在配置文件中列出Load Balancer（负载均衡，简称LB）后面所有的机器，Ribbon会自动的帮助你基于某种规则（例如简单轮询、随机连接等等）去连接这些机器。我们也可以很容易的使用Ribbon来实现自定义的负载均衡算法。

​		实际上就是一个负载均衡+服务调用的小组件客户端工具。

​	2.官网资料

​		`Ribbon目前也进入到了维护模式`

​		https://github.com/Netflix/ribbon/wiki/Getting-Started

​		`Spring Cloud希望使用LoadBalancer来替换Ribbon，但目前LoadBalancer功能还不完善，暂时还无法完全替换`

​	3.Ribbon能干什么?

​		LB负载均衡（Load Balance）是什么

​		简单的说就是将用户的请求平摊的分配到多个服务上，从而达到系统的高可用（HA）。常见的负载均衡有软件：Nginx、LVS；硬件：F5等等。

​		Ribbon本地负载均衡客户端	vs	Nginx服务端负载均衡区别

​		Nginx是服务器负载均衡【集中式负载均衡】，客户端所有请求都会交给Nginx，然后由Nginx实现请求转发，即负载均衡是由服务端实现的。

​		Ribbon是本地客户端负载均衡【进程内负载均衡】，在调用微服务接口的时候，会在注册中心上获取注册信息服务列表之后缓存到JVM本地，从而在本地实现RPC远程服务调用技术。

​		集中式负载均衡

​		即在服务的消费方和提供方之间使用独立的负载均衡设施（可以是硬件，例如F5，也可以是软件，例如Nginx），由该设施负责把访问请求通过某种策略转发至服务的提供方。

​		进程内负载均衡

​		将负载均衡逻辑集成到消费方，消费方从服务注册中心获知有哪些地址可用，然后自己再从这些地址中选择出一个合适的服务器，Ribbon就属于进程内负载均衡，它只是一个类库，集成于消费方进程，消费方通过它来获取到服务提供方的地址。

​		Ribbon = 负载均衡 + RestTemplate调用

​	4.Ribbon结构说明

​		Ribbon在工作时分为两步：

​			1.先选择Eureka Server，它优先选择在同一区域内负载较少的server

​			2.再根据用户指定的策略，从server取到的服务注册列表中选择一个地址

​		Ribbon提供了多种策略：例如轮询、随机和根据相应时间加权。

​		总结：Ribbon其实就是一个软负载均衡的客户端组件，它可以和其他所需请求的客户端结合使用，和Eureka结合只是其中的一个实例。

​	5.POM

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```

​	**`spring-cloud-starter-netflix-eureka-client`依赖中自带了`spring-cloud-starter-ribbon`的引用

​	6.RestTemplate

​		官网Api介绍：https://docs.spring.io/spring-framework/docs/5.2.4.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html

​		1.getForObject方法	/	getForEntity方法

```java
//返回对象为响应体中数据转化成的对象，基本上可以理解为json
@GetMapping("/consumer/payment/get/{id}")
public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
    return restTemplate.getForObject(PAYMENT_SRV + "/payment/get/" + id,CommonResult.class);
}

//返回对象为ResponseEntity对象，包含了响应中的一些重要信息，例如响应头、响应状态码、响应体等
@GetMapping("/consumer/payment/getForEntity/{id}")
public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
    ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_SRV + "/payment/get/" + id,CommonResult.class);
    if(entity.getStatusCode().is2xxSuccessful()){
        return entity.getBody();
    }else{
        return new CommonResult(444,"操作失败");
    }
}
```

​	7.Ribbon核心组件IRule

​		IRule：根据特定算法中从服务列表中选取一个要访问的服务

​			1.`com.netflix.loadbalancer.RoundRobinRule`	---	`轮询`

​			2.`com.netflix.loadbalancer.RandomRule`	---	`随机`

​			3.`com.netflix.loadbalancer.RetryRule`	---	`先按照RoundRobinRule[轮询]的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务`

​			4.`WeightedResponseTimeRule`	---	`对RoundRobinRule[轮询]的扩展，响应速度越快的实例选择权重越大，约容易被选择`

​			5.`BestAvailableRule`	---	`会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务`

​			6.`AvailabilityFilteringRule`	---	`先过滤掉故障实例，再选择并发较小的实例`

​			7.`ZoneAvoidanceRule`	---	`默认规则，符合判断server所在区域的性能和server的可用性选择服务器`



​		替换负载均衡的策略

​			1.新建自定义配置类

​			官方文档明确的给出了警告，这个自定义配置类不能放在`@ComponentScan`所扫描的当前包及子包下，否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。

​			SpringBoot启动类的`@SpringBootApplication`注解包含了`@ComponentScan`注解，因此，我们的自定义配置类不能放在启动类目录及其子目录下。

```java
package cn.coreqi.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();    //定义为随机
    }

}
```

​		2.在主启动类上添加`@RibbonClient`注解

```java
package cn.coreqi.springcloud;

import cn.coreqi.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)  //在启动该微服务的时候加载我们自定义的Ribbon配置类，从而使配置生效
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);

    }
}
```

​	8.Ribbon负载均衡算法

​		1.原理

​			负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置的下标。	注：每次服务重启后rest接口计数从1开始。

```java
List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
List[0] instances = 127.0.0.1:8002;
List[1] instances = 127.0.0.1:8001;
```

​			8001和8002组合成为集群，共计2台机器，集群总数为2，按照轮询算法原理：

​			当总请求数为1时：	1 % 2 = 1	对应下标位置为1，则获得服务地址为127.0.0.1:8001

​			当总请求数为2时：	2 % 2 = 0	对应下标位置为0，则获得服务地址为127.0.0.1:8002

​			当总请求数为3时：	3 % 2 = 1	对应下标位置为1，则获得服务地址为127.0.0.1:8001

​			当总请求数为4时：	4 % 2 = 0	对应下标位置为0，则获得服务地址为127.0.0.1:8002

​			如此类推、

​		2.手写一个算法

​			1.取消服务消费者RestTemplate的`@LoadBalanced`注解

​			2.LoadBalancer接口

```java
package cn.coreqi.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}

```

```java
package cn.coreqi.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第几次访问次数next: " + next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}

```

```java
package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@Slf4j
public class OrderController {

    //以固定api地址访问服务形式
    //public static final String PAYMENT_URL="http://localhost:8001";

    //以服务名称访问服务形式
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if(instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance instance = loadBalancer.instances(instances);
        URI uri = instance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb",String.class);
    }
}

```

14.OpenFeign服务接口调用

​	*Feign已经停止更新，视频直接讲解的是OpenFeign

​	1.OpenFeign是什么？

​		https://cloud.spring.io/spring-cloud-static/Hoxton.SR3/reference/htmlsingle/#spring-cloud-openfeign

​		OpenFeign是Spring在Feign的基础上做了加强，主要用在消费者的客户端用于服务调用。

​		`Feign是一个声明式WebService客户端，使用Feign能让编写WebService客户端更加简单，它的使用方法是定义一个服务接口然后在上面添加注解`，Feign也支持可插拔式的编码器和解码器，Spring Cloud对Feign进行了封装，使其支持了Spring MVC标准注解和HttpMessageConverters。Feign可以与Eureka和Ribbon组合使用用于支持负载均衡。

​		可以这么说，Feign就是参考Ribbon基础之上又做了一套服务接口加注解方式调用的整合器。

​		https://github.com/spring-cloud/spring-cloud-openfeign

​	2,Feign能干什么？

​		Feign旨在使编写Java Http客户端变得更加容易。

​		前面在使用Ribbon + RestTemplate时，利用RestTemplate来完成对Http请求的封装处理，形成了一套模板化的调用方式，但是在实际的开发过程中，由于对服务依赖的调用可能不止一处，往往一个接口会被多处调用，所以通常都会针对每个微服务自行封装一些客户端类来包装这些依赖服务的调用。所以，Feign在此基础之上做了进一步的封装，由他来帮助我们定义和实现依赖服务接口的定义。在Feign的实现下，我们只需要创建一个接口并使用注解的方式来配置它（以前是在Dao接口上标注@Mapper注解，现在是一个微服务接口上标注一个@Feign注解即可），即可完成对服务提供方的接口绑定，简化了使用Spring Cloud Ribbon时，自动封装服务调用客户端的开发量。

​	利用Ribbon维护了Payment的服务列表信息，并且通过轮询的方式实现了客户端的负载均衡，而与Ribbon不同的是，通过Feign只需要声明式的定义服务绑定接口，就可以优雅而简单的实现服务调用。注意：Feign是在Ribbon基础之上进行的封装，因此，Feign集成了Ribbon。

​	3.Feign和OpenFeign的区别

|                            Feign                             |                          OpenFeign                           |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| Feign是SpringCloud组件中的一个轻量级RESTFul的Http服务客户端，Feign内置了Ribbon用来做客户端的负载均衡然后去调用服务注册中心的服务。Feign的使用方式：使用Feign的注解定义接口，然后调用这个接口就可以调用服务注册中心的服务 | OpenFeign是SpringCloud在Feign的基础上支持了SpringMVC注解，如@RequestMapping等等。OpenFeign的@FeignClient可以解析SpringMVC的@RequestMapping注解下的接口，并通过动态代理的方式产生实现类，实现类中做负载均衡并调用其他服务。 |

`Feign`

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-feign</artifactId>
</dependency>
```

`OpenFeign`

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

​	4.使用【服务消费者】

​		1.pom引入

```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
```

​		2.主启动类开启

```java
package cn.coreqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //开启Feign
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}

```

​		3.新建服务接口并引用微服务API

```java
package cn.coreqi.springcloud.services;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   //微服务在注册中心的名称
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")    //调用微服务的地址
    CommonResult<Payment> create(@PathVariable("id") Long id);
}

```

​		4.在控制器中调用

```java
package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}

```

​	5.OpenFeign超时

​		OpenFeign默认等待1秒钟，超过后报错。

​		默认Feign客户端只等待1秒钟，但是服务端处理需要超过1秒钟，导致Feign客户端不想等待了，就会直接返回错误页面。为了避免这样的情况，有时候我们需要设置Feign客户端的超时控制。

```yml
server:
  port: 80
eureka:
  client:
    register-with-eureka: false
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册
ribbon: #设置feign客户端超时时间（OpenFeign建立在Ribbon基础之上）
  ReadTimeout: 5000 #指的是建立连接所用的时间，适用于网络状况正常的情况下，两端连接所用的时间
  ConnectTimeout: 5000 #指的是建立连接后从服务器读取到可用资源所用的时间
```

​	6.OpenFeign日志打印功能

​		Feign本身提供了日志打印功能，我们可以通过配置来调整日志级别，从而了解Feign中Http请求的细节。

​		说白了就是对Feign接口的调用情况进行监控和输出

​		日志级别：

​			1.NONE	默认，不显示任何日志

​			2.BASIC	仅记录请求方法、URL、响应状态码及执行时间

​			3.HEADERS	除了BASIC中定义的信息之外，还有请求和响应的头信息。

​			4.FULL	除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据。

```java
package cn.coreqi.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

```

```yml
server:
  port: 80
eureka:
  client:
    register-with-eureka: false
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册
ribbon: #设置feign客户端超时时间（OpenFeign建立在Ribbon基础之上）
  ReadTimeout: 5000 #指的是建立连接所用的时间，适用于网络状况正常的情况下，两端连接所用的时间
  ConnectTimeout: 5000 #指的是建立连接后从服务器读取到可用资源所用的时间
logging:
  level:
    cn.coreqi.springcloud.services.PaymentFeignService: debug #feign日志以什么级别监控哪个接口
```

15.Hystrix断路器

​	目前官方【Netflix】停止更新，出道即巅峰。设计理念优秀，服务熔断、服务限流、服务隔离等等。

​	1.分布式系统面临的问题

​		复杂的分布式体系结构中的应用程序可能有数十个依赖，每个依赖关系在某些时候将不可避免地失败【网络卡顿、网络调用超时、程序错误、机房断电等等】

​		服务雪崩：

​			多个微服务之间调用的时候，加入微服务A调用微服务B和微服务C，微服务B和微服务C又调用其他的微服务，这就是所谓的"扇出"。如果扇出的链路上某个微服务的调用响应时间过长或者不可用，对微服务A的调用就会占用越来越多的系统资源，进而引起系统奔溃，所谓的"雪崩效应".

​			对于高流量的应用来说，单一的后端依赖可能会导致所有服务器上的所有资源都在几秒钟内饱和。比失败更糟糕的是，这些应用程序还可能导致服务之间的延迟增加，备份队列，线程和其他系统资源紧张，导致整个系统发生更多的级联故障。这些都表示需要对故障和延迟进行隔离和管理，以便单个依赖关系的失败，不能取消整个应用程序或系统。

​			所以，通常当你发现一个模块下的某个实例失败后，这时候这个模块依然还会接收流量，然后这个有问题的模块还调用了其他的模块，这样就会发生级联故障，或者叫雪崩。

​		这样级联故障的避免就需要有一种兜底的方案，或者是一种链路中断的方案，这就是所谓的服务降级。

​	2.Hystrix是什么？

​		Hystrix是一个用于处理分布式系统的延迟和容错的开源库，在分布式系统里，许多依赖不可避免的会调用失败，比如超时、异常等，Hystrix能够保证在一个依赖出问题的情况下，不会导致整体服务失败，避免级联故障，以提高分布式系统的弹性。

​		“断路器”本身是一种开关装置，当某个服务单元发生故障之后，通过断路器的故障监控（类似熔断保险丝），向调用方返回一个符合预期的、可处理的备选响应（FallBack）,而不是长时间的等待或者抛出调用方无法处理的异常，这样就保证了服务调用方的线程不会被长时间、不必要的占用，从而避免了故障在分布式系统中的蔓延，乃至雪崩。

​	3.Hystrix能干什么？

​		1.服务降级

​		2.服务熔断

​		3.接近实时的监控

​		4.限流、隔离等等

​	4.Hystrix状态

​		https://github.com/Netflix/Hystrix/wiki/How-To-Use

​		停止更新，进入维护状态。被动修复bugs，不再接受合并请求，不再发布新版本。

​	5.Hystrix一些概念

​		1.服务降级【fallback】

​			对方的系统不可用了，你需要给我一个兜底的解决方案。

​			返回友好的提示，和温馨的挽救方法。

​			那些情况下会触发服务降级：

​				1.程序运行异常

​				2.超时

​				3.服务熔断出发服务降级

​				4.线程池、信号量打满也会导致服务降级

​		2.服务熔断【break】

​			类比保险丝达到最大服务访问后，直接拒绝访问，拉闸限电，然后调用服务降级的方法并返回友好提示

​			服务降级 =》 进而熔断	=》	恢复调用链路

​		3.服务限流【flowlimit】

​			秒杀等高并发等操作，严禁一窝蜂的过来拥挤，大家排队，一秒钟N个，有序进行。

​	6.pom

```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>
```

​	7.Jmeter压力测试

​		tomcat的默认工作线程数被打满了，没有多余的线程来分解压力和处理。

​	8.解决方案

​		1.服务提供者超时，调用者不能一直卡死等待，必须有服务降级

​		2.服务提供者down机，调用者不能一直卡死等待，必须有服务降级

​		3.服务提供者正常，调用者自身出现故障或有自我要求（自己的等待时间小于服务提供者），自身处理降级

​	9.服务降级

​		设置自身条用超时时间的峰值，峰值内可以正常运行，超过了需要有兜底的方法处理，作服务降级fallback

​		在业务服务实现类中对可以出现异常的方法添加`@HystrixCommand`注解，并在其`fallbackMethod`属性中指定其发生异常后为其兜底的方法，该方法要求除方法名不一致外和原方法体一致，然后添加`@HystrixProperty`注解指定该方法在何种情况下被判定为出现异常。然后再在主启动上添加`@EnableCircuitBreaker`注解开启相关功能。

​		提供方：

```java
    //fallbackMethod,如果当前方法出现问题则调用
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")

    })
    public String paymentInfo_Timeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + " PaymentInfo_Timeout, id: " + id + "\t" + "...(*￣０￣)ノ" +
                " 耗时5秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池： " + Thread.currentThread().getName() + " paymentInfo_TimeOutHandler, id: " + id + "\t" + "(°ー°〃)";
    }
```

```java
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker	//开启
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
```

​		无论是触发什么异常，只要是当前服务不可用了，做服务降级，兜底的方案都是`paymentInfo_TimeOutHandler`

​		`**服务降级既可以放在服务端，也可以放在客户端，一般是放在客户端`

​		`**热部署对@HystrixCommand内属性的修改不敏感，有时会不生效，建议修改后重启微服务而不是等待热部署完成`

​		消费方：

```yml
server:
  port: 80
eureka:
  client:
    register-with-eureka: true
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/
feign:
  hystrix:
    enabled: true
```

```java
package cn.coreqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}

```

```java
package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.services.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_Timeout(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己，(⊙o⊙)？";
    }
}

```

​	10.问题

​		1.每个服务方法都需要一个兜底的方法，导致代码臃肿

​		2.服务类中和兜底的方法放在一起，高度耦合。

​			解决代码膨胀：配置全局服务降级	

​			除了个别重要的核心业务配置专有的服务降级方法，其他普通的可以通过`@DefaultProperties(defaultFallback = "")`来统一跳转到全局处理结果页面。

​			通用的和独享的各自分开，避免了代码膨胀，合理减少了代码量。

​		消费者：

```java
package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.services.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    //@HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    //})
    @HystrixCommand //为当前服务开启降级但没有指定降级方法则会使用全局服务降级方法
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_Timeout(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者80，对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己，(⊙o⊙)？";
    }

    //下面是全局fallback方法
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试，(°ー°〃)";
    }
}

```

​		解决代码耦合度高：只需要为客户端Feign定义的接口添加一个服务降级处理的实现类即可实现解耦。

​		生产环境中主要面临的异常：运行异常、超时异常、宕机异常等等。

```java
package cn.coreqi.springcloud.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,щ(ʘ╻ʘ)щ";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout,щ(ʘ╻ʘ)щ";
    }
}
```

```yml
server:
  port: 80
eureka:
  client:
    register-with-eureka: true
    service-url:
      defaultZone: http://eureka7001.com:7001/eureka/
feign:
  hystrix:
    enabled: true
```

```java
package cn.coreqi.springcloud.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_Timeout(@PathVariable("id") Integer id);
}

```

​	11.服务熔断

​		1.断路器	-	一句话就是家里的保险丝

​		2.熔断是什么？

​			熔断机制是应对雪崩效应的一种微服务链路保护机制。当扇出链路的某个微服务出错不可用或者响应时间太长时，会进行服务的降级，进而熔断该节点的微服务调用，快速返回错误的响应信息。当检测到该节点微服务调用响应正常后，恢复调用链路。

​			在Spring Cloud框架里，熔断机制通过Hystrix实现。Hystrix会监控微服务间调用的状况，当失败的调用达到一定阈值，缺省是5秒内20次调用失败，就会启动熔断机制，熔断机制的注解是`@HystrixCommand`。

​			Martin Fowler（马丁.福勒）的服务熔断概念

​			https://martinfowler.com/bliki/CircuitBreaker.html

​		服务提供者

```java
package cn.coreqi.springcloud.services.impl;

import cn.coreqi.springcloud.services.PaymentService;
import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池： " + Thread.currentThread().getName() + " PaymentInfo_OK,id: " + id + "\t" + "...(*￣０￣)ノ";
    }

    //fallbackMethod,如果当前方法出现问题则调用
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")

    })
    public String paymentInfo_Timeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + " PaymentInfo_Timeout, id: " + id + "\t" + "...(*￣０￣)ノ" +
                " 耗时3秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池： " + Thread.currentThread().getName() + " paymentInfo_TimeOutHandler, id: " + id + "\t" + "(°ー°〃)";
    }

    //-------------服务熔断 Start

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),   //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),  //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),    //时间范围【时间窗口期】
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),    //失败率达到多少后跳闸
    })  //在10秒的窗口期中10次请求有6次是请求失败的将触发断路器，60指60%
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id < 0){
            throw new RuntimeException("*****id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号： " + serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id不能为负数，请稍后再试，（*゜ー゜*）  id： " + id;
    }
}

```

```java
package cn.coreqi.springcloud.controller;

import cn.coreqi.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("*****result: " + result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_Timeout(id);
        log.info("*****result: " + result);
        return result;
    }

    //-------------服务熔断 Start
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("****result: " + result);
        return result;
    }
}

```

​		3.服务熔断小总结

​			熔断类型：

​				1.熔断打开：请求不再进行调用当前服务，内部设置时钟一般为MTTR(平均故障处理时间)，当打开时长达到所设时钟则进入半熔断状态

​				2.熔断关闭：熔断关闭后则不会对服务进行熔断

​				3.熔断半开：部分请求根据规则调用当前服务，如果请求成功且符合规则则认为当前服务恢复正常，关闭熔断。

​			涉及到断路器的三个重要参数：快照时间窗【`circuitBreaker.sleepWindowInMilliseconds`】、请求总数阈值【`circuitBreaker.requestVolumeThreshold`】、错误百分比阈值【`circuitBreaker.errorThresholdPercentage`】

​				1.快照时间窗：断路器确定是否打开 需要统计一些请求和错误数据，而统计的时间范围就是快照时间窗，默认为最近的10秒。

​				2.请求总数阈值：在快照时间窗内，必须满足请求总数阈值才有资格熔断。默认为20，意味着在10秒内，如果该hystrix命令的调用次数不足20次，即使所有的请求都超时或其他原因失败，断路器都不会打开。

​				3.错误百分比阈值：当请求总数在快照时间窗内超过了阈值，比如发生了30次调用，如果在这30次调用中，有15次发生了超时异常，也就是超过50%的错误百分比，在默认设定50%阈值情况下，这时候就会将断路器打开。

​			断路器打开或者关闭的条件

​				1.当满足一定的阈值的时候（默认10秒内超过20个请求次数）

​				2.当失败率达到一定值的时候（默认10秒内超过50%的请求失败）

​				3.达到以上阈值，断路器将会开启

​				4.当开启的时候，所有请求都不会进行转发

​				5.一段时间之后（默认是5秒），这个时候断路器是半开状态，会让其中一个请求进行转发，如果成功，断路器将会关闭，若失败，继续开启，重复4和5.

​			断路器打开之后：

​				1.再有请求调用的时候，将不会调用主逻辑，而是直接调用降级fallback，通过断路器，实现了自动的发现错误并将降级逻辑切换为主逻辑，减少响应延迟的效果。

​				2.原来的主逻辑要如何恢复？

​					对于这一问题，hystrix也为我们实现了自动恢复功能。

​					当断路器打开，对主逻辑进行熔断之后，hystrix会启动一个休眠时间窗，在这个时间窗内，降级逻辑是临时的成为主逻辑。当休眠时间窗到期，断路器将进入半开状态，释放一次请求到原来的主逻辑上，如果此次请求正常返回，那么断路器将继续闭合，主逻辑恢复，如果这次请求依然有问题，断路器继续进入打开状态，休眠时间窗重新计时。

​			All配置：

```java
//--------------All
@HystrixCommand(fallbackMethod = "str_fallbackMethod",
                groupKey = "strGroupCommand",
                commandKey = "strCommand",
                threadPoolKey = "strThreadPool",
                commandProperties = {
                    //设置隔离策略，THREAD表示线程池 SEMAPHORE:信号池隔离
                    @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
                    //当隔离策略选择信号池隔离的时候，用来设置信号池的大小（最大并发数）
                    @HystrixProperty(name = "execution.isolation.semaphore.maxConcurrentRequests", value = "10"),
                    //配置命令执行的超时时间
                    @HystrixProperty(name = "execution.isolation.thread.timeoutinMilliseconds", value = "10"),
                    //是否启动超时时间
                    @HystrixProperty(name = "execution.timeout.enabled", value = "true"),
                    //执行超时的时候是否中断
                    @HystrixProperty(name = "execution.isolation.thread.interruptOnTimeout", value = "true"),
                    //执行被取消的时候是否中断
                    @HystrixProperty(name = "execution.isolation.thread.interruptOnCancel", value = "true"),
                    //允许回调方法执行的最大并发数
                    @HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "10"),
                    //服务降级是否启动，是否执行回调函数
                    @HystrixProperty(name = "fallback.enabled", value = "true"),
                    //是否启用断路器
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
                    //该属性用来设置在滚动时间窗中，断路器熔断的最小请求数。例如：默认该值为20的时候，
                    //如果滚动时间窗（默认10秒）内仅收到了19个请求，即使这19个请求都失败了，断路器也不会打开
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),
                    //该属性用来设置在滚动时间窗中，表示在滚动时间窗中，在请求数量超过circuitBreaker.requestVolumeThreshold的情况下
                    //如果错误请求数的百分比超过50，就把断路器设置为“打开”状态，否则就设置为“关闭”状态
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
                    //该属性用来设置当断路器打开之后的休眠时间窗，休眠时间窗结束之后，会将断路器设置为“半开”状态，尝试熔断的请求命令
                    //如果依然失败就将断路器继续设置为“打开”状态，如果成功就设置为“关闭”状态
                    @HystrixProperty(name = "circuitBreaker.sleepWindowinMilliseconds", value = "5000"),
                    //断路器强制打开
                    @HystrixProperty(name = "circuitBreaker.forceOpen", value = "false"),
                    //断路器强制关闭
                    @HystrixProperty(name = "circuitBreaker.forceClosed", value = "false"),
                    //滚动时间窗设置，该时间用于断路器判断健康度时需要收集信息的持续时间
                    @HystrixProperty(name = "metrics.rollingStats.timeinMilliseconds", value = "10000"),
                    //该属性用来设置滚动时间窗统计指标信息时划分“桶”的数量，断路器在收集指标信息的时候会根据设置的时间窗长度拆分成多个“桶”来累计各度量值，每个“桶”记录了一段时间内的采集指标。
                    //比如10秒内拆分成10个“桶”收集这样，所以timeinMilliseconds必须能被numBuckets整除，否则将抛出异常。
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "10"),
                    //该属性用来设置对命令执行的延迟是否使用百分位数来跟踪和计算。如果设置为false，那么所有的概要统计都将返回-1
                    @HystrixProperty(name = "metrics.rollingPercentile.enabled", value = "false"),
                    //该属性用来设置百分位统计的滚动窗口的持续时间，单位为毫秒。
                    @HystrixProperty(name = "metrics.rollingPercentile.timeInMilliseconds", value = "60000"),
                    //该属性用来设置百分位统计滚动窗口中使用“桶”的数量。
                    @HystrixProperty(name = "metrics.rollingPercentile.numBuckets", value = "60000"),
                    //该属性用来设置在执行过程中每个“桶”中保留的最大执行次数，如果在滚动时间窗内发生超过该设定值的执行次数，就从最初的位置开始重写。例如，将该值设置为100，滚动窗口为10秒，若在10秒内一个“桶”中发生了500次执行，那么该“桶”中只保留最后的100次执行的统计。另外，增大该值的大小将会增加内存量的消耗，并增加排序百分位数所需的计算时间。
                    @HystrixProperty(name = "metrics.rollingPercentile.bucketSize", value = "100"),
                    //该属性用来设置采集影响断路器状态的健康快照（请求的成功、错误百分比）的间隔等待时间
                    @HystrixProperty(name = "metrics.healthSnapshot.intervalinMilliseconds", value = "500"),
                    //是否开启请求缓存
                    @HystrixProperty(name = "requestCache.enabled", value = "true"),
                    //HystrixCommand的执行和事件是否打印日志到HystrixRequestLog中
                    @HystrixProperty(name = "requestLog.enabled", value = "true"),
                },
               threadPoolProperties = {
                   //该参数用来设置执行命令线程池的核心线程数，该值也就是命令执行的最大并发量
                   @HystrixProperty(name = "coreSize", value = "10"),
                   //该参数用来设置线程池的最大队列大小。当设置为-1时，线程池将使用SynchronousQueue实现的队列
                   //否则将使用LinkedBlockingQueue实现的队列
                   @HystrixProperty(name = "maxQueueSize", value = "-1"),
                   //该参数用来为队列设置拒绝阈值。通过该参数，即使队列没有达到最大值也能拒绝请求。
                   //该参数主要是对LinkedBlockingQueue队列的补充，因为LinkedBlockingQueue队列不能动态修改它的对象大小，而通过该属性就可以调整拒绝请求的队列大小了。
                   @HystrixProperty(name = "queueSizeRejectionThreshold", value = "5"),
               })
public String strConsumer(){
    return "hello 2020";
}
```

​	12.服务限流

​		后面高级篇讲解Alibaba的Sentinel说明

​	13.Hystrix工作流程

​		https://github.com/Netflix/Hystrix/wiki/How-it-Works

​		步骤说明

| 步骤 | 流程                                                         |
| ---- | ------------------------------------------------------------ |
| 1    | 创建HystrixCommand（用在依赖的服务返回单个操作结果的时候）或HystrixObserableCommand（用在依赖的服务返回多个操作结果的时候）对象。 |
| 2    | 命令执行。其中HystrixCommand实现了下面前两种执行方式；而HystrixObservableCommand实现了后两种执行方式；execute()：同步执行，从依赖的服务返回一个单一的结果对象，或是在发生错误的时候抛出异常。queue()：异步执行，直接返回一个Future对象，其中包含了服务执行结束时要返回的单一结果对象。observe()：返回Observable对象，它代表了操作的多个结果，它是一个Hot Observable（不论“事件源”是否有“订阅者”，都会在创建后对事件进行发布，所以对于Hot Observable的每一个“订阅者”都有可能是从“事件源”的中途开始的，并可能只是看到了整个操作的局部过程）。toObservable()：同样会返回Observable对象，也代表了操作的多个结果，但它返回的是一个Cold Observable（没有“订阅者”的时候并不会发布事件，而是进行等待，直到有“订阅者”之后才发布事件，所以对于Cold Observable的订阅者，它可以保证从一开始看到整个操作的全部过程）。 |
| 3    | 若当前命令的请求缓存功能是被启用的，并且该命令缓存命中，那么缓存的结果会立即以Observable对象的形式返回 |
| 4    | 检查断路器是否为打开状态，如果断路器是打开的，那么Hystrix不会执行命令，而是转接到fallback处理逻辑（第8步）；如果断路器是关闭的，则检查是否有可用资源来执行命令（第5步） |
| 5    | 线程池/请求队列/信号量是否占满，如果命令依赖服务的专有线程池和请求队列，或者信号量（不使用线程池的时候）已经被占满，那么Hystrix也不会执行命令，而是转接到fallback处理逻辑（第8步）。 |
| 6    | Hystrix会根据我们编写的方法来决定采取什么样的方式去请求依赖服务。HystrixCommand.run()：返回一个单一的结果，或者抛出异常。HystrixObservableCommand.construct()：返回一个Observable对象来发射多个结果，或通过onError发送错误通知。 |
| 7    | Hystrix会将“成功”、“失败”、“拒绝”、“超时”等信息报告给断路器，而断路器会维护一组计数器来统计这些数据。断路器会使用这些统计数据来决定是否要将断路器打开，来对某个依赖服务的请求进行“熔断/短路”。 |
| 8    | 当命令执行失败的时候，Hystrix会进入fallback尝试回退处理，我们通常也称该操作为“服务降级”，而能够引起服务降级处理的情况有下面几种：第4步：当前命令处理“熔断/短路”状态，断路器是打开的时候。第5步：当前命令的线程池、请求队列或者信号量被占满的时候。第6步：HystrixObservableCommand.construct()或HystrixCommand.run()抛出异常的时候。 |
| 9    | 当Hystrix命令执行成功之后，它会将处理结果直接返回或是以Observable的形式返回 |

​		`tips：如果我们没有为命令实现降级逻辑或者在降级处理逻辑中抛出了异常，Hystrix依然会返回一个Observable对象，但是它不会发射任何结果数据，而是通过onError方法通知命令立即中断请求，并通过onError()方法将引起命令失败的异常发送给调用者`

​	14.Hystrix图形化监控Dashboard

​		1.概述

​			除了隔离依赖服务的调用之外，Hystrix还提供了`准实时`的调用监控（Hystrix Dashboard），Hystrix会持续的记录所有通过Hystrix发起的请求的执行信息，并以统计报表和图形的形式展示给用户，包括每秒执行多少请求多少成功，多少失败等等。Netflix通过hystrix-metrics-event-stream项目实现了对以上指标的监控。Spring Cloud也提供了Hystrix Dashboard的整合，对监控内容转化成可视化界面。

​		2.项目

​			1.pom

```xml
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
        </dependency>
```

​			2.主启动类

```java
package cn.coreqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}

```

​			3.为所有被监控的服务提供者添加actuator监控信息依赖

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
```

​			4.新版本Hystrix需要在服务提供者主启动类中指定监控路径

​				`如果不添加的话将抛出 404 Unable to connect to Command Metric Stream 错误`

```java
package cn.coreqi.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker   //对hystrix熔断机制的支持
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }

    /**
     * 此配置是为了服务监控而配置，与服务容错本身无关，Spring Cloud升级后的坑
     * ServletRegustrationBean因为SpringBoot的默认路径不是“/hystrix.stream”
     * 只要在自己的项目里配置下面的Servlet就可以了
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}

```

​			5.启动Dashboard项目

​				http://localhost:9001/hystrix

​				http://localhost:8001/hystrix.stream

​				7色：7种颜色对应不同的状态

​				1圈：实心圆：共有两种含义。它通过颜色的变化代表了实例的健康程度，它的健康度从绿色<黄色<橙色<红色递减。该实心圆除了颜色的变化之外，它的大小也会根据实例的请求流量发生变化，流量越大该实心圆就越大。所以通过该实心圆的展示，就可以在大量的实例中快速的发现故障实例和高压力实例。

​				1线：曲线：用来记录2分钟内流量的相对变化，可以通过它来观察到流量的上升和下降趋势。

16.Gateway&Zuul网关

​	几乎所有的微服务架构都需要网关，网关统一的挡在前面进行一些日志、限流、鉴权、安全加固等等这些工作。

​	1.官网

​		zuul1.x：https://github.com/Netflix/zuul/wiki

​		Dateway：https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/

​	2.是什么？

​		Spring Cloud全家桶中有个很重要的组件就是网关，在1.x版本中都是采用的Zuul网关；

​		但在2.x版本中，由于Zuul的升级一直跳票，Spring Cloud最后自己研发了一个网关替代Zuul，那就是Spring Cloud Gateway

​		一句话：Gatetay是原Zuul1.x版的替代。

​	3.概述

​		Gateway是在Spring生态系统之上构建的API网关服务，基于Spring 5，Spring Boot 2 和Project Reactor等技术。

​		Gateway旨在提供一种简单而有效的方式来对API进行路由，以及提供一些强大的过滤器功能，例如：熔断、限流、重试等等。

​		SpringCloud Gateway是Spring Cloud的一个全新项目，基于Spring 5.0 + Spring Boot 2.0 + Project Reactor等技术开发的网关，它旨在为微服务架构提供一种简单有效的统一的API路由管理方式。

​		SpringCloud Gateway作为Spring Cloud生态系统中的网关，目标是替代Zuul，在Spring Cloud 2.0以上版本中，没有对新版本的Zuul 2.0以上最新高性能版本进行集成，仍然还是使用的Zuul 1.x非Reactor模式的老版本。而为了提升网关的性能，SpringCloud Gateway是基于WebFlux框架实现的，而WebFlux框架底层则使用了高性能的Reactor模式通信框架Netty。

​		Spring Cloud Gateway的目标是提供统一的路由方式且基于Filter链的方式提供了网关基本的功能，例如：安全，监控/指标，和限流。

​		一句话：Spring Cloud Gateway使用的Webflux中的reactot-netty响应式编程组件，底层使用了Netty通讯框架。

​	4.能干什么？

​		1.反向代理

​		2.鉴权

​		3.流量控制

​		4.熔断

​		5.日志监控

​		6.、、、、、

​	5.为什么选择Gateway？

​		1.Netlix不太靠谱，Zuul2.0一直跳票，迟迟不发布

​			一方面因为Zuul 1.0 已经进入了维护阶段，而且Gateway是SpringCloud团队研发的，是亲儿子产品，值得信赖，而且很多功能Zuul都没有用起来也非常的简单便捷。

​			Gateway是基于异步非阻塞模型上进行开发的，性能方面不需要担心，虽然Netflix早就发布了最新的Zuul 2.x，但Spring Cloud貌似没有整合计划。而且Netflix相关组件都宣布进入维护期，不知前景如何，多方面综合考虑Gateway是很理想的网关选择。

​		2.Spring Cloud Gateway具有如下特性：

​			基于Spring Framework 5，Project Reactor 和Spring Boot 2.0进行构建

​			动态路由：能够匹配任何请求属性

​			可以对路由指定Predicate（断言）和Filter（过滤器）

​			集成Hystrix的断路器功能

​			集成Spring Cloud服务发现功能

​			易于编写的Predicate（断言）和Filter（过滤器）

​			请求限流功能

​			支持路径重写

​		3.Spring Cloud Gateway与 Zuul的区别

​			在Spring Cloud Finchley正式版之前，Spring Cloud推荐的网关是Netflix提供的Zuul

​			1.Zuul 1.x，是一个基于阻塞I/O的API Gateway

​			2.Zuul 1.x基于Servlet 2.5使用阻塞架构，它不支持任何长连接（如WebSocket），Zuul的设计模式和Nginx较像，每次I/O操作都是从工作线程中选择一个执行，请求线程被阻塞到工作线程完成，但是差别是Nginx使用C++实现，Zuul使用Java实现，而JCM本身会有第一次加载较慢的情况，使得Zuul的性能相对较差。

​			3.Zuul 2.x理念更先进，想基于Netty非阻塞和支持长连接，但Spring Cloud目前还没有整合。Zuul 2.x的性能较Zuul 1.x有较大提升。在性能方面，根据官方提供的基准测试，SpringCloud Gateway的RPS（每秒请求数）是Zuul的1.6倍。

​			4.Spring Cloud Gateway建立在Spring Framework 5、Project Reactor和Spring Boot 2之上，使用非阻塞API

​			5.Spring Cloud Gateway还支持WebSocket，并且与Spring紧密集成拥有更好的开发体验。

​		4.Zuul 1.x模型

​			Spring Cloud中所集成的Zuul版本，采用的是Tomcat容器，使用的是传统的Servlet I/O处理模型。

​			Servlet由Servlet容器进行生命周期管理

​			container启动时构造Servlet对象并调用Servlet init()进行初始化

​			container运行时接受请求，并为每个请求分配一个线程（一般从线程池中获取空闲线程），然后调用service()

​			container关闭时调用servlet destory()销毁servlet

​			上述模式的缺点：

​				Servlet是一个简单的网络I/O模型，当请求进入Servlet 容器时，Servlet容器就会为其绑定一个线程，在并发不高的场景下这种模型是适用的。但是一旦高并发（例如使用Jemeter压力测试），线程数量就会上涨，而线程资源代价是昂贵的（上下文切换，内存消耗大）严重影响请求的处理时间。在一些简单业务场景下，不希望为每个request分配一个线程，只需要1个或几个线程就能应对极大并发的请求，这种业务场景下Servlet模型没有优势。

​				所以Zuul1.x 是基于Servlet之上的一个阻塞式处理模型，即Spring实现了处理所有request请求的一个Servlet（DispatcherServlet）并由该Servlet阻塞式处理，所以SpringCloud Zuul无法摆脱Servlet模型的弊端。

​		5.Gateway模型

​			Gateway基于WebFlux（非阻塞式的Web框架）

​			https://docs.spring.io/spring/docs/5.2.4.RELEASE/spring-framework-reference/web-reactive.html#spring-webflux

​			传统的Web框架，例如：struts2，SpringMVC等都是基于Servlet API与Servlet容器基础之上运行的。

​			但是在Servlet3.1之后有了异步非阻塞的支持，而WebFlux是一个典型非阻塞异步的框架，它的核心是基于Reactor的相关API实现的。相对于传统的web框架来说，它可以运行在诸如Netty，Undertow及支持Servlet3.1的容器上。非阻塞式+函数式编程（Spring5必须让你使用java8）

​			Spring WebFlux是Spring5.0引入的新的响应式框架，区别于SpringMVC，它不需要依赖Servlet API，它是完全异步非阻塞的，并且基于Reactor来实现响应式流规范。

​		6.Gateway的三大核心概念

​			1.Route(路由)

​				路由是构建网关的基本模块，它由ID，目标URI，一系列的断言和过滤器组成，如果断言为true则匹配该路由

​			2.Predicate（断言）

​				参考的是Java8的java.util.function.Predicate，开发人员可以匹配HTTP请求中的所有内容（例如请求头或请求参数），如果请求与断言相匹配则进行路由

​			3.Filter（过滤）

​				指的是Spring框架中GatewayFilter的实例，使用过滤器，可以在请求被路由前或者之后对请求进行修改。

​			4.总结

​				web请求，通过一些匹配条件，定位到真正的服务节点。并在这个转发过程的前后，进行一些精细化控制

​				predicate就是我们的匹配条件；而filter就可以理解为一个无所不能的拦截器，有了这两个元素再加上目标uri，就可以实现一个具体的路由了。

​		7.Gateway工作流程

​			客户端向Spring Cloud Gateway发出请求，然后在Gateway Handler Mapping中找到与请求相匹配的路由，将其发送到Gateway Web Handler，Handler再通过指定的过滤器链来将请求发送到我们实际的服务执行业务逻辑，然后返回。

​			过滤器之间用虚线分开是因为过滤器可能会在发送代理请求之前（“pre”）或之后（“post”）执行业务逻辑。

​			Fulter在“pre”类型的过滤器可以做参数校验、权限校验、流量监控、日志输出、协议转换等。

​			在“post”类型的过滤器中可以做响应内容、响应头的修改、日志的输出、流量监控等有着非常重要的作用。

​			核心逻辑：路由转发 + 执行过滤器链

​		8.Start

​			1.pom

```xml
        <!-- Gateway -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-gateway</artifactId>
        </dependency>
        <!-- eureka client -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```

​			网关作为一种微服务也要注册进我们的注册中心**网关不需要web及actuator依赖			

​			2,yml

```yml
server:
  port: 9527

spring:
  application:
    name: cloud-gateway

eureka:
  instance:
    hostname: cloud-gateway-service
  client:
    service-url:
      register-with-eureka: true
      fetch-registry: true
      #defaultZone: http://localhost:7001/eureka （单机版Eureka）
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册

```

​			3.主启动类

```java
package cn.coreqi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}

```

​			4.yml新增网关配置

```yml
server:
  port: 9527

spring:
  application:
    name: cloud-gateway
  cloud:
    gateway:
      routes:
        - id: payment_routh  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          uri: http://localhost:8001  #匹配后提供服务的路由地址
          predicates:
            - Path=/payment/get/**  #断言，路径相匹配的进行路由
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          uri: http://localhost:8001  #匹配后提供服务的路由地址
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由

eureka:
  instance:
    hostname: cloud-gateway-service
  client:
    service-url:
      register-with-eureka: true
      fetch-registry: true
      #defaultZone: http://localhost:7001/eureka （单机版Eureka）
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册

```

​			5.启动注册中心，服务提供者，网关

​				http://localhost:9527/payment/get/3

​		9.Gateway配置路由的两种方式

​			1.yml配置方式

​			2.硬编码方式【RouteLocator】

```java
package cn.coreqi.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    /**
     * 配置了一个id为”path_route_coreqi“的路由规则
     * 当访问地址为http://localhost:9527/guonei时会自动转发到地址：https://new.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_coreqi",r -> r.path("/guonei").uri("https://news.baidu.com/guonei"));
        routes.route("path_route_coreqi2",r -> r.path("/guoji").uri("https://news.baidu.com/guoji"));
        return routes.build();
    }
}
```

​		10.GateWay通过微服务名实现动态配置路由

​			默认情况下Gateway会根据注册中心注册的服务列表，以注册中心上微服务名为路径创建动态路由进行转发，从而实现动态路由的功能

```yml
server:
  port: 9527

spring:
  application:
    name: cloud-gateway
  cloud:
    gateway:
      discovery:
        locator:
          enabled: true #开启从注册中心动态创建路由的功能，利用微服务名进行路由
      routes:
        - id: payment_routh  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          predicates:
            - Path=/payment/get/**  #断言，路径相匹配的进行路由
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由

eureka:
  instance:
    hostname: cloud-gateway-service
  client:
    service-url:
      register-with-eureka: true
      fetch-registry: true
      #defaultZone: http://localhost:7001/eureka （单机版Eureka）
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册

```

​		11.GateWay中Predicate【断言】的使用

​			https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/#gateway-request-predicates-factories

​			1.Route Predicate Factories这个是什么？

​				Spring Cloud Gateway将路由匹配作为Spring WebFlux HandlerMapping基础架构的一部分

​				Spring Cloud Gateway包括许多内置的Route Predicate工厂，所有这些Predicate都与HTTP请求的不同属性匹配，多个Route Predicate工厂可以进行组合。

​				Spring Cloud Gateway创建Route对象时，使用RoutePredicateFactory创建Predicate对象，Predicate对象可以赋值给Route，Spring Cloud Gateway包含许多内置的Route Predicate Factories。

​				所有这些谓词都匹配HTTP请求的不同属性，多种谓词工厂可以组合，并通过逻辑and。

​			2.常用的Route Predicate

​				1.After Route Predicate【在...时间之后】

```java
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();    //获取默认时区
        System.out.println(zbj);
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));   //用指定时区获取当前时间
        System.out.println(zny);
    }
```

```xml
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由
            - After=2020-03-18T13:17:48.279+08:00[Asia/Shanghai]
```

​				2.Before Route Predicate

​				3.Between Route Predicate

​				4.Cookie Route Predicate

​					Cookie Route Predicate需要两个参数，一个是Cookie name，一个是正则表达式。

​					路由规则会通过获取对应的Cookie name值和正则表达式去匹配，如果匹配上就会执行路由，没有匹配上则不执行

```yml
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由
            - After=2020-03-18T13:17:48.279+08:00[Asia/Shanghai]
            - Before=2020-03-18T13:17:48.279+08:00[Asia/Shanghai]
            - Between=2020-03-18T13:17:48.279+08:00[Asia/Shanghai]
            - Cookie=username,fanqi
```

​				5.Header Route Predicate

​					两个参数：一个是属性名称和一个正则表达式，这个属性值和正则表达式匹配则执行

```yml
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由
            - After=2020-03-18T13:17:48.279+08:00[Asia/Shanghai]
            - Cookie=username,fanqi
            - Header=X-Request-Id,\d+ #请求头要有X-Request-Id属性并且值为整数的正则表达式
```

​				6.Host Route Predicate

​					Host Route Predicate接收一组参数，一组匹配的域名列表，这个模板是一个ant分割的模板，用.号作为分隔符，它通过参数中的主机地址作为匹配规则。

​				7.Method Route Predicate

​					Method Route Predicate ， Get or Post or .....

​				8.Path Route Predicate

​					路径相匹配的进行路由

​				9.Query Route Predicate

​					支持传入两个参数，一个是属性名，一个为属性值，属性值可以是正则表达式

​				10.小总结

​					Predicate就是为了实现一组匹配规则，让请求过来找到对应的Route进行处理。

​		12.GateWay中Filter【过滤器】的使用

​			1.是什么？

​				路由过滤器可用于修改进入的HTTP请求和返回的HTTP响应，路由过滤器只能指定路由进行使用。

​				Spring Cloud Gateway内置了多种路由过滤器，他们都由GatewayFilter的工厂类在产生。

​			2.Spring Cloud GateWay中的Filter

​				1.声明周期【两个】

​					1.pre【业务逻辑之前】

​					2.post【业务逻辑之后】

​				2.种类【两个】

​					1.GatewayFilter【单一】

​						31+

​					2.GlobalFilter【全局】

​						10+

​				3.常用的GatewayFilter

```yml
        - id: payment_routh2  #路由的ID，没有固定规则但要求唯一，建议配合服务名
          #uri: http://localhost:8001  #匹配后提供服务的路由地址
          uri: lb://cloud-payment-service #匹配后提供服务的路由地址,开启微服务名路由功能后，需要指向注册中心名称
          filters:
            - AddRequestParameter=X-Request-Id,1024 #过滤器工厂会在匹配的请求头加上一对请求头，名称为X-Request-Id值为1024
          predicates:
            - Path=/payment/lb/**  #断言，路径相匹配的进行路由
```

​				4.自定义全局GlobalFilter过滤器

​					通过自定义全局过滤器来进行全局日志记录、统一网关鉴权等等。

​					1.实现两个接口 GlobalFilter and Ordered

```java
package cn.coreqi.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
//@Order(0)   //和实现Ordered接口的效果是一致的
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("********come in MyLogGateWayFilter: " + new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if(username == null){
            log.info("*****用户名为null，非法用户，(⊙o⊙)？");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 在过滤器链中加载过滤器的顺序，数字越小，优先级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}

```

17.Spring Cloud Config 分布式配置中心

​	Spring Cloud Config 和 Spring Cloud Bus也还在用，但是逐渐被Alibaba的Nacos所替换。

​	1.分布式系统所面临的配置问题

​		微服务意味着要将单体应用中的业务拆分成一个个的子服务，每个服务的粒度相对较小，因此系统中会出现大量的法务，同时也会诞生大量的、重复的配置文件。由于每个服务都需要必要的配置信息才能运行，所以一套集中式的、动态的配置管理设施是必不可少的。Spring Cloud提供了`配置中心`来解决这个问题。

​	2.Spring Cloud Config是什么？

​		Spring Cloud Config 为微服务架构中的微服务提供了集中化的外部配置支持，配置服务器为各个不同微服务应用的所有环境提供了一个中心化的外部配置。

​		Spring Cloud Config 分为`服务端` 和`客户端`两部分

​		服务端也称为分布式配置中心，`它是一个独立的微服务应用`，用来连接配置服务器并为客户端提供获取配置信息，加密/解密信息等访问接口。

​		客户端则是通过指定的配置中心来管理应用资源以及与业务相关的配置内容，并在启动的时候从配置中心获取和加载配置信息，配置服务器默认采用git来存储配置信息，这样就有助于对环境配置进行版本管理，并且可以通过git客户端工具来方便的管理和访问配置内容。

​	3.Spring Cloud Config能干什么？

​		1.集中管理配置文件

​		2,不同环境不同配置，动态化的配置更新，分环境部署比如dev/test/prod/beta/release

​		3.运行期间动态调整配置，不再需要在每个服务部署的机器上编写配置文件，服务会向配置中心统一拉取配置自己的信息

​		4.当配置发生变动时，服务不需要重启即可感知到配置的变化并应用新的配置

​		5.将配置信息以REST接口的形式暴露，使用post、curl命令都可以访问刷新。

​	4.Spring Cloud Config与Github整合配置

​		由于Spring Cloud Config默认使用Git来存储配置文件（也有其它方式，比如支持SVN和本地文件），但最推荐的还是Git，而且使用的是http/https访问的形式。

​	5.Spring Cloud Config官网介绍

​		https://cloud.spring.io/spring-cloud-static/spring-cloud-config/2.2.2.RELEASE/reference/html/

​	6.配置读取规则

​		1.`/{label}/{application}-{profile}.yml`

​			master分支

​				http://localhost:3344/master/config-dev.yml

​				http://localhost:3344/master/config-test.yml

​				http://localhost:3344/master/config-prod.yml

​			dev分支

​				http://localhost:3344/dev/config-dev.yml

​				http://localhost:3344/dev/config-test.yml

​				http://localhost:3344/dev/config-prod.yml

​		2.`/{application}-{profile}.yml`

​			http://localhost:3344/config-dev.yml

​			http://localhost:3344/config-test.yml

​			http://localhost:3344/config-prod.yml

​			http://localhost:3344/config-xxxx.yml（不存在的配置）

​		3.`/{application}/{profile}[/{label}]`

​			http://localhost:3344/config/dev/master

​			http://localhost:3344/config/test/master

​			http://localhost:3344/config/test/dev

​		`** label：分支（branch）	name：服务名		profiles：环境（dev、test、prod）`

​	7.Config Client

​		1.bootstrap.yml

​			`application.yml`是用户级的资源配置项

​			`bootstrap.yml`是系统级的，优先级更高

​			Spring Cloud会创建一个“Bootstrap Context”作为Spring应用的“Application Context”的上下文，初始化的时候，`Bootstrap Context`负责从外部源加载配置属性并解析配置。这两个上下文共享一个从外部获取的`Environment`。

​			`Bootstrap`属性有高优先级，默认情况下，他们不会被本地配置覆盖。`Bootstrap Context`和`Application Context`有着不同的约定，所以新增了一个`boorstrap.yml`文件，保证`Bootstrap Context`和`Application Context`配置的分离

​			要将Client模块下的application.yml文件改为bootstrap.yml是很关键的。因为bootstrap.yml是比application.yml先加载的。bootstrap.yml优先级高于application.yml。

​	8.Config Client之动态刷新

​		Git上的配置文件修改后，Config Server上立马同步修改了，而Config Client却没有任何改动，需要重启Config Client后才能生效。使用动态刷新，将避免服务重启

​		1.Client添加actuator监控依赖

```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
```

​		actuator依赖除了网关不推荐添加以外，建议其他的模块全部添加该依赖。

​		actuator是指模块发生变化后能够被其他模块监控到。

​		2.修改yml，暴露监控端口

```yml
server:
  port: 3355

spring:
  application:
    name: config-client
  cloud:
    config: #Config Client配置
      label: master #分支名称
      name: config  #配置文件名称
      profile: dev  #读取后缀名称 上述3个综合：master分支上config-dev.yml的配置文件被读取 http://localhost:3344/master/config-dev.yml
      uri: http://localhost:3344  #配置中心地址

eureka:
  client:
    service-url:  #服务注册到Eureka地址
      #defaultZone: http://localhost:7001/eureka （单机版Eureka）
      defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka #向Eureka集群分别注册

#暴露监控端口
management:
  endpoints:
    web:
      exposure:
        include: "*"

```

​		3.在Controller中添加`@RefreshScope`注解

```java
package cn.coreqi.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}

```

​		4.向Client发送post请求，刷新Client

```bash
curl -X POST	"http://localhost:3355/actuator/refresh"
```

18.Spring Cloud Bus消息总线

​	Spring Cloud Bus是对Spring Cloud Config的一个加强，广播型、自动型的动态刷新是Config的绝配，

​	1.概述

​		Spring Cloud Bus是对Spring Cloud Config的加深和补充，用于实现分布式自动刷新配置功能，Spring Cloud Bus配合Spring Cloud Config使用可以实现配置的动态刷新。

​		1.是什么？

​			Spring Cloud Bus配合Spring Cloud Config使用可以实现配置的动态刷新，Spring Cloud Bus是用来将分布式系统的节点与轻量级消息系统链接起来的框架，它整合了Java的事件处理机制和消息中间件的功能。Spring Cloud Bus目前支持RabbitMQ和Kafka。

​		2.能干什么？

​			Spring Cloud Bus能管理和传播分布式系统间的消息，就像一个分布式执行器，可用于广播状态更改、事件推送等，也可以当作微服务间的通信通道。

​		3.为何被称为总线

​			在微服务架构的系统中，通常会使用轻量级的消息代理来构建一个共用的消息主题，并让系统中所有微服务实例都连接上来。由于该主题中产生的消息会被所有实例监听和消费，所以称它为消息总线。在总线上的各个实例，都可以方便地广播一些需要让其他连接在该主题上的实例都知道的消息。

​			基本原理

​				Config Client实例都监听MQ中同一个topic（默认是springCloudBus）。当一个服务刷新数据的时候，它会把这个消息放入到topic，这样其它监听同一topic的服务就能得到通知，然后去更新自身的配置。

​	2.设计思想

​		第一种：利用消息总线触发一个客户端/bus/refresh从而刷新所有客户端的配置

​		第二种：利用消息总线触发一个服务端ConfigServer的/bus/refresh端点从而刷新所有客户端的配置

​		第二种架构设计更加适合。第一种不适合的原因如下：

​			1.打破了微服务的职责单一性，因为微服务本身是业务模块，它不应该承担配置刷新的职责。

​			2.破坏了微服务各节点的对等性。

​			3.有一定的局限性。例如：微服务在迁移时，它的网络地址常常会发生变化，此时如果想要做到自动刷新，那就会增加更多的修改。

​	3.给cloud-config-center-3344配置中心服务端添加消息总线支持

​		1.pom中添加相关依赖

```xml
        <!--添加消息总线RabbitMQ支持-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bus-amqp</artifactId>
        </dependency>
```

​		2.yml中添加相关配置

```yml
#RabbitMQ相关配置，暴露bus刷新配置的端点
spring:
  rabbitmq:
    host: 192.168.57.128
    port: 5672
    username: guest
    password: guest

management:
  endpoints:  #暴露bus刷新配置的端点
    web:
      exposure:
        include: 'bus-refresh'  #bus-refresh 是actuator的刷新操作
```

​	4.给cloud-config-client-3355客户端添加消息总线支持

​		1.pom中添加相关依赖【同上】

​		2.yml中添加相关配置

```yml
#RabbitMQ相关配置
spring:
  rabbitmq:
    host: 192.168.57.128
    port: 5672
    username: guest
    password: guest
```

​	5.测试自动刷新

​	修改git上的配置文件并向Config Server发送请求

```bash
curl -X POST "http://localhost:3344/actuator/bus-refresh"
```

​	然后Config Client的配置信息自动变更

​	6.定点通知

​		不想通知所有的Config Client，只想定点通知。指定具体某一个实例生效而不是全部生效

​		公式：`http://localhost:配置中心的端口号/actuator/bus-refresh/{destination}`

​		说明：`/bus/refresh`请求将不再发送到具体的服务实例上，而是发给Config Server并通过destination参数类指定需要更新配置的服务或实例。

​		使用：修改git上的配置文件并向Config Server发送请求【只修改3355】

```bash
curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
```

​		`config-client`指实例的微服务名称	`3355`是该微服务的端口号

19.Spring Cloud Stream消息驱动

​	1.消息驱动概述

​		1.消息驱动是什么？

​			屏蔽底层消息中间件的差异，降低切换成本，统一消息的编程模型。

​			官网介绍：https://spring.io/projects/spring-cloud-stream

​			官方Api介绍：https://cloud.spring.io/spring-cloud-static/spring-cloud-stream/3.0.3.RELEASE/reference/html/

​			官方定义Spring Cloud Stream是一个构建消息驱动微服务的框架。

​			应用程序通过inputs或者outputs来与Spring Cloud Stream中binder对象交互，通过我们来配置binding（绑定），然后Spring Cloud Stream利用binder对象来与消息中间件交互。所以，我们只需要搞清楚如何与Spring Cloud Stream交互就可以方便使用消息驱动的方式。

​			通过使用Spring Integration来连接消息代理中间件以实现消息事件驱动，Spring Cloud Stream 为一些供应商的消息中间件产品提供了个性化的自动化配置实现，引用了发布-订阅、消费组、分区的三个核心概念

​			目前仅支持RabbitMQ、Kafka

​		2.消息驱动设计思想

​			1.标准MQ

​				1.生产者/消费者之间靠消息媒介传递消息内容	-	Message

​				2.消息必须走特定的通道	-	消息通道MessageChannel

​				3.消息通道里的消息如何被消费呢？谁负责收发处理

​					消息通道MessageChannel的子接口SubscribabelChannel，由MessageHandler消息处理器所订阅

​			2.为什么用Spring Cloud Stream

​				比方说我们用到了RabbitMQ和Kafka，由于这两个消息中间件的架构上的不同，像RabbitMQ有exchange，kafka有Topic和Partitions分区，这些中间件的差异性导致我们实际项目开发中给我们造成了一定的困扰，如果我们用了两个消息队列中的其中一种，后面的业务需求，我们想往另外一种消息队列进行迁移，这时候无疑就是一个灾难性的，一大堆东西都要重新推倒重新做，因为它跟我们的系统耦合了，这时候Spring Cloud Stream给我们提供了一种解耦合的方式。

​				1、Stream凭什么可以统一底层差异？

​					在没有绑定器这个概念的情况下，我们的SpringBoot应用要直接与消息中间件进行信息交互的时候，由于各消息中间件构建的初衷不同，它们的实现细节上会有较大的差异性。

​					通过定义绑定器作为中间层，完美的实现了应用程序与消息中间件细节之间的隔离，通过向应用程序暴露统一的Channel通道，使得应用程序不需要再考虑各种不同的消息中间件实现。

​					Stream对消息中间件的进一步封装，可以做到代码层面对中间件的无感知，甚至于动态的切换中间件（rabbitmq切换为kafka），使得微服务开发的高度解耦，服务可以关注更多自己的业务流程.

​				2.Binder

​					INPUT	-	对应于消费者

​					OUTPUT	-	对应于生产者

​				3.Stream中的消息通信方式遵循了发布-订阅模式

​					Topic主题进行广播	-	在RabbitMQ就是Exchange	-	在Kafka中就是Topic

​		3.Spring Cloud Stream标准流程套路

​			1.Binder	绑定器，很方便的连接中间件，屏蔽差异

​			2.Channel	频道，通道，是队列Queue的一种抽象，在消息通讯系统中就是实现存储和转发的媒介，通过Channel对队列进行配置

​			3.Source和Sink	简单的可理解为参照对象是Spring Cloud Stream自身，从Stream发布消息就是输出，接收消息就是输入。

​		4.Spring Cloud Stream编码API和常用注解

| 组成            | 说明                                                         |
| --------------- | ------------------------------------------------------------ |
| Middleware      | 中间件，目前只支持RabbitMQ和Kafka                            |
| Binder          | Binder是应用与消息中间件之间的封装，目前实行了Kafka和RabbitMQ的Binder，通过Binder可以很方便的连接中间件，可以动态的改变消息类型（对应于Kafka的topic，RabbitMQ的exchange），这些都可以通过配置文件来实现 |
| @Input          | 注解标识输入通道，通过该输入通道接收到的消息进入应用程序     |
| @Output         | 注解标识输出通道，发布的消息将通过该通道离开应用程序         |
| @StreamListener | 监听队列，用于消费者的队列的消息接收                         |
| @EnableBinding  | 指信道channel和exchange绑定在一起                            |

​	2.分组消费与持久化

​		1、重复消费

​			提供者发出消息后，所有的消费者都接受到了消息通知，存在重复消费问题

​			导致原因：默认分组group是不同的，组流水号不一样被认为是不同组，可以重复消费。

​			解决方案：分组和持久化属性group

​			案例：比如在如下场景，订单系统我们做集群部署，都会从RabbitMQ中获取订单信息，如果一个订单同时被两个服务获取到，那么就会造成数据错误，我们得避免这种情况。这时我们就可以使用Stream中的消息分组来解决。

​						注意，在Stream中处于同一个group中的多个消费者是竞争关系，就能够保证消息只会被其中一个应用消费一次。

​						结论：不同组是可以全面消费的（重复消费）。同一个组内会发生竞争关系，只有其中一个可以消费

​			1.原理

​				微服务应用放置于同一个group中，就能够保证消息只会被其中一个应用消费一次。不用的组是可以消费的，同一个组内会发生竞争关系，只有其中一个可以消费。

​			2.如何分组

​				为`application.yml`中input或output添加`group`属性即可。

​		2、消息持久化

​			添加分组属性，默认的组不保留消息，自定义的组保留。



20.Spring Cloud Sleuth分布式请求链路跟踪

​	1概述

​		1.问题

​		在微服务框架中，一个由客户端发起的请求在后端系统中会经过多个不同的服务节点调用来协同产生最终的请求结果，每一个前段请求都会形成一条复杂的分布式服务调用链路，链路中的任何一环出现高延时或错误都会引起整个请求最后的失败。

​		2.是什么

​		官网：https://spring.io/projects/spring-cloud-sleuth

​		github：https://github.com/spring-cloud/spring-cloud-sleuth

​		Spring Cloud Sleuth提供了一套完整的服务跟踪解决方案，在分布式系统中提供追踪解决方案并且兼容支持了zipkin。

​	2.搭载链路监控

​		1、zipkin

​		SpringCloud从F版起已不需要自己构建Zipkin Server了，只需调用jar包即可。

​		下载地址：https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/

​		文件：zipkin-server-2.12.9-exec.jar

​		运行：

```bash
java -jar zipkin-server-2.12.9-exec.jar
```

​		控制台查看：	http://localhost:9411/zipkin

​		一条链路通过Trace Id作为唯一标识，Span标识发起的请求信息，各Span通过Parent Id关联起来。

​		名词解释：

​			Trace：类似于树结构的Span集合，表示一条调用链路，存在唯一标识

​			Span：表示调用链路来源，通俗的理解Span就是一次请求信息

​		2.服务提供者

​			1.pom

```xml
        <!--包含了sleuth+zipkin-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-zipkin</artifactId>
        </dependency>
```

​			2.yml

```yml
spring:
  zipkin:
    base-url: http://localhost:9411
  sleuth:
    sampler:
      #采样率值介于0到1之间，1则表示全部采集
      probability: 1
```

​			3.controller

```java
    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "hi,i‘am paymentZipkin server fall back,welcome to coreqi,...(*￣０￣)ノ";
    }
```

​		2.服务消费者

​			1、pom

​				同上

​			2.yml	

​				同上

​			3.controller

```java
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin(){
        String result = restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin",String.class);
        return result;
    }
```



==================================	课程下半场	==================================

21.Spring Cloud Alibaba入门简介

​	1.为什么会出现Spring Cloud Alibaba

​		1.Spring Cloud的一些项目已经进入维护模式	https://spring.io/blog/2018/12/12/spring-cloud-greenwich-rc1-available-now

​		将模块置于维护模式，意味着Spring Cloud团队将不会再向模块添加新功能，我们将修复block级别的bug以及安全问题，我们也会考虑并审查社区的小型pull request

​		我们打算继续支持这些模块直到Greenwich版本被普遍采用至少一年

​	2.Spring Cloud Alibaba

​		1、是什么

​		官网：https://github.com/alibaba/spring-cloud-alibaba/blob/master/README-zh.md

​		诞生：2018.10.31，Spring Cloud Alibaba正式入驻Spring Cloud官方孵化器，并在Maven中央仓库发布了第一个版本。

​		2，能干什么

​			服务限流降级：默认支持Servlet、Feign、RestTemplate、Dubbo和RocketMQ限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级Metrics监控。

​			服务注册与发现：适配Spring Cloud服务注册与发现标准，默认集成了Ribbon的支持。

​			分布式配置管理：支持分布式系统中的外部化配置，配置更改时自动刷新

​			消息驱动能力：基于Spring Cloud Stream为微服务应用构建消息驱动能力。

​			阿里云对象存储：阿里云提供的海量、安全、低成本、高可靠的云存储服务。支持在任何应用、任何时间、任何地点存储和访问任意类型的数据。

​			分布式任务调度：提供秒级、精准、高可靠、高可用的定时（基于Cron表达式）任务调度服务.同时提供分布式的任务执行模型，如网络任务。网络任务支持海量子任务均匀分配到所有Worker（schedulerx-client）上执行。

22.Spring Cloud Alibaba Nacos服务注册和配置中心

​	1.Nacos简介

​		1.为什么叫Nacos

​			前四个字母分别为Naming和Configuration的前两个字母，最后的s为Service。

​			服务的命名管理（服务注册） +  配置

​		2.是什么

​			一个更易于构建云原生应用的动态服务发现、配置管理和服务管理平台

​			Nacos：Dynamic Naming and Configuration Service

​			Nacos就是注册中心 + 配置中心的组合 等价于	Nacos  =  Eureka + Config + Bus

​		3.能干嘛？

​			替代Eureka做服务注册中心

​			替代Config做服务配置中心

​		4.去哪下

​			https://github.com/alibaba/Nacos

​			官网网址：

​			https://nacos.io/zh-cn/

​			介绍文档：

​			https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html#_spring_cloud_alibaba_nacos_discovery

​		5.各注册中心比较

| 服务注册与发现框架 | CAP模型 | 控制台管理 | 社区活跃度        |
| ------------------ | ------- | ---------- | ----------------- |
| Eureka             | AP      | 支持       | 低（2.x版本闭源） |
| Zookeeper          | CP      | 不支持     | 中                |
| Consul             | CP      | 支持       | 高                |
| Nacos              | AP/CP   | 支持       | 高                |

​		据说Nacos在阿里巴巴内部有超过10万的实例运行，已经过了类似双十一等各种大型流量的考验。	

​	2.Nacos的安装及运行

​		1.先决条件

​			Java8 + Maven环境

​		2.从官方Github下载Nacos

​			https://github.com/alibaba/nacos/releases

​		3.解压安装包，直接运行bin目录下的startup.cmd

​		4.命令运行成功后直接访问	http://localhost:8848/nacos

​			默认账号密码都是nacos（如果有登录页面）

​	3.Nacos作为服务注册中心

​		1.官方文档

​			https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html#_spring_cloud_alibaba_nacos_discovery

​		2.基于Nacos的服务提供者

​			1.POM

```xml
		<!-- 父工程 Spring Cloud Alibaba 2.2.0.RELEASE-->
          <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2.2.0.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
          </dependency>
		<!-- 子工程 Spring Cloud Alibaba Nacos-->        
		<dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
```

​			2.yml配置

```yml
server:
  port: 9001

spring:
  application:
    name: nacos-payment-provider
  cloud:
    nacos:
      discovery:
        server-addr: localhost:8848 #配置Nacos地址

management:
  endpoints:
    web:
      exposure:
        include: '*'
```

​		3.基于Nacos的服务消费者

​		4.服务注册中心对比

​			Nacos支持AP和CP模式的切换

​				C指所有节点在同一时间看到的数据是一致的，而A的定义是所有的请求都会收到响应。

​			何时选择使用何种模式？

​				一般来说，如果不需要存储服务级别的信息且服务实例是通过nacos-client注册，并能够保持心跳上报，那么就可以选择AP模式。当前主流的服务如Spring Cloud和Dubbo服务，都适用于AP模式，AP模式为了服务的可用性而减弱了一致性，因此AP模式下只支持注册临时实例。

​				如果需要在服务级别编辑或者存储配置信息，那么必须是CP，K8S服务和DNS服务则适用于CP模式。CP模式下则支持注册持久化实例，此时则是以Raft协议为集群运行模式，该模式下注册实例之前必须先注册服务，如果服务不存在，则会返回错误。

```bash
curl -X PUT '$NACOS_SERVER:8848/nacos/v1/ns/operator/switches?entry=serverMode&value=CP'
```

​	4.Nacos作为服务配置中心

​		1.Nacos作为配置中心-基础配置

​			1.pom

```xml
        <!-- Nacos Config -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>
        <!--Spring Cloud Alibaba Nacos-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
```

​			2.yml

​			需要配置两个yml文件，`application.yml和bootstrap.yml`，Necos同Spring Cloud Config一样，在项目初始化时，要保证先从配置中心进行配置拉取，拉取配置之后，才能保证项目的正常启动

​			Spring Boot中配置文件的加载是存在优先级顺序的，bootstrap优先级高于application

​			3,主启动类及业务类

​			Controller中添加`@RefreshScope`注解使Nacos支持动态刷新功能,通过Spring Cloud原生注解@RefreshScope实现配置自动更新。

​			4.在Nacos中添加配置信息

​				Nacos中的匹配规则

​				1.理论	

​				Nacos中的dataId的组成格式及与Spring Boot配置文件中的匹配规则

​				官网：https://nacos.io/zh-cn/docs/quick-start-spring-cloud.html

​				说明：之所以需要配置spring.application.name，是因为它是构成Nacos配置管理dataId字段的一部分。

​				在Nacos Spring Cloud中，`dataId`的完整格式如下：

​					1.`${prefix}-${spring.profile.active}.${file-extension}`

​						✦	`prefix`默认为`spring.application.name`的值，也可以通过配置项`spring.cloud.nacos.config.prefix`来配置

​						✦	`spring.profile.active`即为当前环境对应的profile，详情可以参考Spring Boot文档。注意：当`spring.profile.active`为空时，对应的连接符`-`也将不存在，dataId的拼接格式变成`${prefix}.${file-extension}`

​						✦	`file-extension`为配置内容的数据格式，可以通过配置项`spring.cloud.nacos.config.file-extension`来配置，目前只支持`properties`和`yaml`类型。

​						✦	通过Spring Cloud原生注解`@RefreshScope`实现配置自动更新

​				最后公式：`${spring.application.name}-${spring.profile.active}.${spring.cloud.nacos.config.file-extension}`

​		2.Nacos作为配置中心-分类配置

​			1.问题-多环境多项目管理

​				问题1：

​					实际开发中，通常一个系统会准备dev开发环境、test测试环境、prod生产环境。如何能保证指定环境启动时服务能正确读取到Nacos上相应环境的配置文件呢？

​				问题2：

​					一个大型分布式微服务系统会有很多微服务子项目，每个微服务项目又都会有相应的开发环境、测试环境、预发环境、正式环境等等，那怎么对这些微服务配置进行管理呢？

​			2.Namaspace + Group + Data Id三者关系？为什么这么设计？

​				类似于Java中的package包名和类名，最外层的namespace时可以用于区分部署环境的，Group和Data Id逻辑上区分两个目标对象。

​				默认情况：

​					Namespace=public，Group=DEFAULT_GROUP,默认Cluster【集群】是DEFAULT

​				Nacos默认的命名空间是public，Namespace主要用来实现隔离，比方说我们现在有三个环境：开发、测试、生产环境，我们就可以创建三个Namespace，不用的Namespace之间是隔离的。

​				Griup默认是DEFAULT_GROUP，Group可以把不同的微服务划分到同一个分组里面去。

​				Service就是微服务，一个Service可以包含多个Cluster（集群），Nacos默认Cluster是DEFAULT，Cluster是对指定微服务的一个虚拟划分。比方说为了容灾，将Service微服务分别部署在了杭州机房和广州机房，这是就可以给杭州机房的Service微服务起一个集群名称（HZ），给广州机房的Service微服务起一个集群名称（GZ），还可以尽量让同一个机房的微服务互相调用，以提升性能。

​				最后是Instance，就是微服务的实例。

​			3.三种方案加载配置

​				1.DataId方案

​					指定微服务`spring.profile.active`和Nacos中配置文件的`DataID`来使微服务在不同环境下读取不同的配置

​				2.Group方案

​					通过Group实现环境区分	-	在Nacos中新建配置指定Group名称【不指定则默认为DEFAULT_GROUP】

​					在微服务的`bootstrap.xml`配置文件`spring.cloud.nacos.config.group`节点下指定Group的名称。

​				3.Namespace方案

​					在Nacos管理控制台 ->	命名空间 ->	新建命名空间

​					在微服务的`bootstrap.xml`配置文件`spring.cloud.nacos.config.namespace`节点下指定Nacos生成的命名空间的id。

​	5.★Nacos集群和持久化配置

​		1.官网说明

​			https://nacos.io/zh-cn/docs/cluster-mode-quick-start.html

​			https://nacos.io/zh-cn/docs/deployment.html

​			默认Nacos使用嵌入式数据库实现数据的存储，这在单机模式下正常且合理，但如果启动多个默认配置下的Nacos节点，数据存储使存在一致性问题的。为了解决这个问题，Nacos采用了集中式存储的方式来支持集群化部署，目前只支持Mysql的存储。

​			Nacos支持三种部署模式

​			✦单机模式	-	用于测试和单机试用

​			✦集群模式	-	用于生产环境，确保高可用

​			✦多集群模式	-	用于多数据中心场景。

​		2.Nacos持久化配置解释

​			1、Nacos默认自带的嵌入式数据库derby

​				https://github.com/alibaba/nacos/blob/develop/config/pom.xml

​			2.derby切换到mysql配置步骤

​				1.nacos-server-1.2.0\nacos\conf	目录下sql脚本`nacos-mysql.sql`	执行

​				2.nacos-server-1.2.0\nacos\conf	目录下配置文件`application.properties`增加如下配置【官网有】

```properties
spring.datasource.platform=mysql

db.num=1
db.url.0=jdbc:mysql://11.162.196.16:3306/nacos_devtest?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true
db.user=nacos_devtest
db.password=youdontknow
```

​				3,重启Nacos

​		3.Linux版 Nacos + Mysql生产环境配置

​			预计需要 1个Nginx + 3个Nacos注册中心 + 1个Mysql

​			1.Nacos

​			https://github.com/alibaba/nacos/releases

```bash
tar -zxvf nacos-server-1.2.0.tar.gz
```

​			2.配置Mysql【同上】

​			3.配置properties【同上】

​			4.复制`nacos-server-1.2.0\nacos\conf\cluster.conf.example`为`cluster.conf`，并在文件中配置集群节点

```text
192.168.111.144:3333
192.168.111.144:4444
192.168.111.144:5555
```

​			`*注意这个IP不能写127.0.0.1，必须是Linux命令hostname -i 能够识别的IP`

​			5.修改startup.sh

​			nacos-server-1.2.0\nacos\bin，目录下有startup.sh，单机版的启动，直接运行./startup.sh即可，但是集群启动，我们希望可以类似其他软件的shell命令，通过传递不同的端口号启动不同的Nacos实例。

​			命令：./startup.sh -p 3333 表示启动端口号为3333的Nacos服务器实例，和上一步的cluster.conf配置的一致

​			6.执行

​			7.配置Nginx

​			8.测试

23.Spring Cloud Alibaba Sentinel实现熔断与限流

​	1.Sentinel

​		1.官网：

​			https://github.com/alibaba/sentinel

​			中文文档：[https://github.com/alibaba/Sentinel/wiki/%E4%BB%8B%E7%BB%8D](https://github.com/alibaba/Sentinel/wiki/介绍)

​		2.和Hystrix的对比

|                           Hystrix                            |                           Sentinel                           |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| 1.需要我们程序员自己手工搭建监控平台 2.没有一套web界面可以给我们进行更加细粒度化的配置流控、速率控制、服务熔断、服务降级等等 | 1.单独一个组件，可以独立出来  2.直接界面化的细粒度统一配置。 |

​		3.是什么？

​			Hystrix的阿里版，轻量级的流量控制、熔断降级Java库。

​		4.下载地址

​			https://github.com/alibaba/sentinel/releases

​		5.官方文档：

​			https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html#_spring_cloud_alibaba_sentinel

​			解决什么问题：

​				服务雪崩

​				服务降级

​				服务熔断

​				服务限流

​	2.安装Sentinel控制台

​		1.Sentinel组件由`两部分`构成

​			后台 + 前台8080

​			✦核心库（java客户端）不依赖任何框架/库，能够运行于所有java运行时环境，同时对Dubbo、Spring Cloud等框架也有较好的支持。

​			✦控制台（Dashboard）基于Spring Boot开发，打包后可以直接运行，不需要额外的Tomcat等应用容器。

​		2.安装步骤

​			1.下载

​				https://github.com/alibaba/sentinel/releases	【sentinel-dashboard-1.7.1.jar】

​			2.运行命令

​				1.前提条件

​					Java8 + 8080端口不能被占用

​				2.命令

```bash
java -jar sentinel-dashboard-1.7.1.jar
```

​		3.访问sertinel管理界面

​			http://localhost:8080

​			登录账号密码均为sentinel

​	3.初始化演示工程

​	4.流控规则

​		1.基本介绍

​			解释说明

​				✦资源名：唯一名称，默认请求路径

​				✦针对来源：Sentinel可以针对调用者进行限流，添加微服务名，默认default（不区分来源）

​				✦阈值类型/单机阈值：

​					☆QPS（每秒钟的请求数量）：当调用该api的QPS达到阈值的时候，进行限流

​					☆线程数：当调用该api的线程数达到阈值的时候，进行限流

​				✦是否集群：不需要集群

​				✦流控模式：

​					☆直接：api达到限流条件时，直接限流

​					☆关联：当关联的资源达到阈值时，就限流自己

​					☆链路：只记录指定链路上的流量（指定资源从入口资源进来的流量，如果达到阈值，就进行限流）【api级别的针对来源】

​				✦流控效果：

​					☆快速失败：直接失败，抛异常

​					☆Warm Up：根据coldFactor（冷加载因子，默认3）的值，从阈值/coldFactor，经过预热时长，才达到设置的QPS阈值

​					☆排队等待：匀速排队，让请求以匀速的速度通过，阈值类型必须设置为QPS，否则无效。

​		2.流控模式

​			1.直接（默认）

​				直接&快速失败&QPS（每秒钟的请求数量）（系统默认）

​				`Blocked By Sentinel(flow limiting)`

​				直接调用默认报错信息，技术方面可以，但是是否应该有我们自己的后续处理？类似于Hystrix的fallback的兜底方法

​			

​				直接&线程数【阈值类型为线程数的情况下不允许指定流控效果】

​			2.关联	-	当关联的资源达到阈值时，就限流自己

​				当与A关联的资源B达到阈值后，就限流A自己，B惹事，A挂了。

​			3.链路	-	只记录指定链路上的流量（指定资源从入口资源进来的流量，如果达到阈值，就进行限流）【api级别的针对来源】

​		3.流控效果

​			1.快速失败	-	直接失败，抛出异常

​					`Blocked By Sentinel(flow limiting)`

​				源码	`com.alibaba.csp.sentinel.slots.block.flow.controller.DefaultController`

​			2.Warm Up【预热】：根据codeFactor（冷加载因子，默认3）的值，从阈值/coldFactor，经过预热时长，才达到设置的QPS阈值

​				说明：Warm Up方式，即预热/冷启动方式。当系统长期处于低水位的情况下，当流量突然增加时，直接把系统拉升到高水位可能瞬间把系统压垮。通过“冷启动”，让通过的流量缓慢增加，在一定时间内逐渐增加到阈值上限，给冷系统一个预热的时间，避免冷系统被压垮。

​				公式：阈值除以coldFactor（默认值为3），经过预热时长后才会达阈值，默认coldFactor为3，即请求QPS从 阈值 / 3开始，经预热时长逐渐升至设定的QPS阈值

​				源码	`com.alibaba.csp.sentinel.slots.block.flow.controller.WarmUpController`

​				案例：	阈值设置为10	&	预热时长设置为5秒	系统初始化的阈值设置为10 / 3 约等于3，即阈值从3开始，经过5秒后阈值慢慢逐渐升高恢复至10.

​				应用场景：秒杀系统在开启的瞬间，会有很高的流量上来，很有可能把系统打死，预热方式就是为了保护系统，可慢慢的把流量放进来，慢慢的把阈值增长到设置的阈值

​			3.排队等待	-	匀速排队，让请求以匀速的速度通过，阈值类型必须设置为QPS，否则无效。

​				设置含义：/testA每秒1次请求，超过的话就排队等待，等待的超时时间为20000毫秒。

​				说明：匀速排队方式会严格控制请求通过的间隔时间，也即是让请求以均匀的速度通过，对应的是漏桶算法。这种方式主要用于处理间隔性突发的流量，例如消息队列。想象一下这样的场景，在某一秒有大量的请求到来，而接下来的几秒则处于空闲状态，我们希望系统能够在接下来的空闲期间逐渐处理这些请求，而不是在第一秒直接拒绝多余的请求。

​				源码	`com.alibaba.csp.sentinel.slots.block.flow.controller.RateLimiterController`

​	5.降级规则

​		熔断降级规则

​		官网：[https://github.com/alibaba/Sentinel/wiki/%E7%86%94%E6%96%AD%E9%99%8D%E7%BA%A7](https://github.com/alibaba/Sentinel/wiki/熔断降级)

​		1.基本介绍

​			✦RT（平均响应时间，秒级）

​				平均响应时间超出阈值且在时间窗口内通过的请求>=5，两个条件同时满足后触发降级

​				窗口期过后关闭断路器

​				RT最大4900（更大的需要通过`-Dcsp.sentinel.statistic.max.rt=xxxx`才能生效）

​			✦异常比例（秒级）

​				QPS >= 5且异常比例（秒级统计）超过阈值时，触发降级；时间窗口结束后，关闭降级

​			✦异常数（分钟级）

​				异常数（分钟统计）超过阈值时，触发降级；时间窗口结束后，关闭降级

​			Sentinel熔断降级会在调用链路中某个资源出现不稳定状态时（例如调用超时或异常比例升高），对这个资源的调用进行限制，让请求快速失败，避免影响到其它的资源而导致级联错误。

​			当资源被降级后，在接下来的降级时间窗口之内，对该资源的调用都自动熔断（默认行为是抛出DegradeException）

​			★Sention的断路器是没有`半开`状态的。这和Hystrix是不一致的。

​			半开的状态系统自动去检测是否请求有异常，没有异常就关闭断路器恢复使用，有异常则继续打开断路器不可用，具体可以参考Hystrix。

​		2.降级策略

​			1.RT

​				平均响应时间：当1s内持续进入5个请求，对应时刻的平均响应时间（秒级）均超过阈值（count，以ms为单位），那么在接下的时间窗口（DegradeRule中的timeWindow，以s为单位）之内，对这个方法的调用都会自动地熔断（抛出DegradeException）。注意Sentinel默认统计的RT上限是4900ms，超出此阈值的都会算作4900ms，若需要变更此上限可以通过启动配置项`-Dcsp.sentinel.statistic.max.rt=xxx`来配置

​				1秒持续进入5个请求且平均响应时间 > 阈值	=>	触发降级（断路器打开）	=>	时间窗口结束	=>	关闭降级

​			2.异常比例

​				异常比例：当资源的每秒请求量 >=5，并且每秒异常总数占通过量的比值超过阈值（DegradeRule中的count）之后，资源进入降级状态，即在接下来的时间窗口（DegradeRule中的timeWindow，以s为单位）之内，对这个方法的调用都会自动的返回。异常比率的阈值范围是[0.0，1.0]，代表0% - 100%。

​				QPS >= 5 && 异常比例（秒级统计）通过阈值	=>	触发降级（断路器打开）	=>	时间窗口结束	=>	关闭降级

​			3.异常数

​				异常数：当资源近1分钟的异常数目超过阈值之后会进行熔断。注意由于统计时间窗口是分钟级别的，若timeWindow小于60s，则结束熔断状态后仍可能再进入熔断状态。

​				★时间窗口一定要大于等于60秒。

​				异常数（分钟统计）超过阈值 	=>	触发降级（断路器打开）	=>	时间窗口结束	=>	关闭降级

​	6.热点Key限流

​		1.基本介绍

​			官网介绍：https://github.com/alibaba/sentinel/wiki/%E7%83%AD%E7%82%B9%E5%8F%82%E6%95%B0%E9%99%90%E6%B5%81

​			复习：

​				兜底方法：分为`系统默认`和`客户自定义`两种

​				之前的案例中限流出问题后，都是用sentinel系统默认的提示：`Blocked by Sentinel(flow limiting)`

​				我们能不能自定义类似于Hystrix那样，某个方法出问题了就找对应的兜底降级方法？

​			结论：

​				从`@HystrixCommand`到`@SentinelResource`

​			源码：	`com.alibaba.csp.sentinel.slots.block.BlockException`

​	2.参数例外项

​		我们期望某个方法参数是某个特殊值时，它的限流值和平时不一样。

​	3.

​		`@SentinelResource`处理的是Sentinel控制台配置的违规情况，通过`blockHandler`属性配置的方法进行兜底处理

​		`RuntimeException`	`int age = 10 / 0`,这个是java运行时报出的运行时异常RunTimeException，`@SentinelResource`不管

​		总结：`@SentinelResource`主管配置出错，运行出错该走异常走异常

​	7.系统规则

​		1.是什么

​			https://github.com/alibaba/sentinel/wiki/%E7%B3%BB%E7%BB%9F%E8%87%AA%E9%80%82%E5%BA%94%E9%99%90%E6%B5%81

​			系统保护规则是从应用级别的入口流量进行控制，从单台机器的load、CPU使用率、平均RT、入口QPS和并发线程数等几个维度监控应用指标，让系统尽可能跑在最大吞吐量的同时保证系统整体的稳定性。

​			这种配置比较危险，在生产环境中一般由网关负责而不会使用此处功能。

​		2.各项配置参数说明

​			系统保护规则是应用整体维度的，而不是资源维度的，并且**仅对入口流量生效**。入口流量指的是进入应用的流量（`EntryType.IN`），比如 Web 服务或 Dubbo 服务端接收的请求，都属于入口流量。

系统规则支持以下的模式：

- **Load 自适应**（仅对 Linux/Unix-like 机器生效）：系统的 load1 作为启发指标，进行自适应系统保护。当系统 load1 超过设定的启发值，且系统当前的并发线程数超过估算的系统容量时才会触发系统保护（BBR 阶段）。系统容量由系统的 `maxQps * minRt` 估算得出。设定参考值一般是 `CPU cores * 2.5`。
- **CPU usage**（1.5.0+ 版本）：当系统 CPU 使用率超过阈值即触发系统保护（取值范围 0.0-1.0），比较灵敏。
- **平均 RT**：当单台机器上所有入口流量的平均 RT 达到阈值即触发系统保护，单位是毫秒。
- **并发线程数**：当单台机器上所有入口流量的并发线程数达到阈值即触发系统保护。
- **入口 QPS**：当单台机器上所有入口流量的 QPS 达到阈值即触发系统保护。

​	

​	8.`@SentinelResource`

​		1.面临的问题

​			1.`@SentinelResource`默认的错误处理没有体现我们自己的业务要求

​			2.依照现有条件，我们自定义的降级处理方法又和业务代码耦合在一起，不直观

​			3.每个业务方法都添加一个兜底的降级处理方法，代码膨胀加剧

​			4.全局统一的降级处理方法没有体现。

​		2.自定义限流处理逻辑

​			1.新建全局处理类

```java
package cn.coreqi.springcloud.myHandler;

import cn.coreqi.springcloud.core.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException ex){
        return new CommonResult(444,"按客户自定义,Global HandlerException---------1");
    }

    public static CommonResult handlerException2(BlockException ex){
        return new CommonResult(444,"按客户自定义,Global HandlerException---------2");
    }

}
```

​			2.在controller 的`@SentinelResource`注解的`blockHandlerClass`属性引用

```java
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handlerException2")
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"按客户自定义",new Payment(2020L,"serial003"));
    }
```

​		3.使用代码控制限流规则（略）

​		4.`@SentinelResource`注解属性说明

​			https://github.com/alibaba/Sentinel/wiki/%E6%B3%A8%E8%A7%A3%E6%94%AF%E6%8C%81

​		5.Sentinel的三个核心Api

​			1.SphU	-	定义资源

​			2.Tracer	-	定义统计

​			3.ContextUtil	-	定义上下文

​	9.Sentinel服务熔断功能

​			Sentinel整合Ribbon + OpenFeign + fallback

​		1.结论

​			`fallback`属性管理运行时异常

​			`blockHandler`管理配置违规

​			推荐同时配置`fallback`和`blockHandler`两个属性

​			若`blockHandler`和`fallback`都进行了配置，则被限流降级而抛出`BlockException`时只会进入`blockHandler`处理逻辑。

​			`exceptionsToIgnore`	排除错误，出现该错误时不会再调用`fallback`属性指定的兜底方法

​		2.整合OpenFeign

​			1.pom

```xml
        <!--openfeign-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>
```

​			2.在yml中激活Feign对Sentinel的支持

```yml
#激活Sentinel对Feign的支持
feign:
  sentinel:
    enabled: true
```

​			3.主启动类添加`@EnableFeignClients`注解

​			4.编写Feign接口

```java
package cn.coreqi.springcloud.services;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}

```

​			5.编写Feign异常的兜底类

```java
package cn.coreqi.springcloud.services.impl;

import cn.coreqi.springcloud.core.CommonResult;
import cn.coreqi.springcloud.entities.Payment;
import cn.coreqi.springcloud.services.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}

```

​			6.控制器中调用

```java
    //========OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        return paymentService.paymentSQL(id);
    }
```

​		3.熔断框架比较

|                | Sentinel                                                   | Hystrix                | resilience4j                     |
| -------------- | ---------------------------------------------------------- | ---------------------- | -------------------------------- |
| 隔离策略       | 信号量隔离（并发线程数限流）                               | 线程池隔离/信号量隔离  | 信号量隔离                       |
| 熔断降级策略   | 基于响应时间、异常比例、异常数                             | 基于异常比例           | 基于异常比例、响应时间           |
| 实时统计实现   | 滑动窗口（LeapArray）                                      | 滑动窗口（基于RxJava） | Ring Bit Buffer                  |
| 动态规则配置   | 支持多种数据源                                             | 支持多种数据源         | 有限支持                         |
| 扩展性         | 多个扩展点                                                 | 插件的形式             | 接口的形式                       |
| 基于注解的支持 | 支持                                                       | 支持                   | 支持                             |
| 限流           | 基于QPS，支持基于调用关系的限流                            | 有限的支持             | Rate Limiter                     |
| 流量整形       | 支持预热模式、均速模式、预热排队模式                       | 不支持                 | 简单的Rate Limiter模式           |
| 系统自适应保护 | 支持                                                       | 不支持                 | 不支持                           |
| 控制台         | 提供开箱即用的控制台，可配置规则、查看秒级监控、机器发现等 | 简单的监控查看         | 不提供控制台，可对接其他监控系统 |

​	10.Sentinel规则持久化

​		1.为什么？

​			一旦我们重启微服务或者Sentinel，Sentinel规则将会消失，因此生产环境中我们需要将配置规则进行持久化。

​		2.怎么玩？

​			将Sentinel限流配置规则持久化到Nacos中保存，只要刷新8401某个rest地址，sentinel控制台的流控规则就能看到，只要Nacos里面的配置不删除，针对8401上Sentinel上的流控规则持续有效。

​		3.步骤

​			1、添加pom

```xml
        <!--Spring Cloud Alibaba Sentinel-Datasource-Nacos  做持久化-->
        <dependency>
            <groupId>com.alibaba.csp</groupId>
            <artifactId>sentinel-datasource-nacos</artifactId>
        </dependency>
```

​			2.yml添加Nacos数据源配置

```yml
spring:
    sentinel:
      datasource:
        ds1:
          nacos:
            server-addr: localhost:8848
            dataId: ${spring.application.name}
            groupId: DEFAULT_GROUP
            data-type: json
            rule-type: flow
```

​			3.Nacos中新建配置

​			DataId和yml文件中同名，类型选择json，内容如下：

```json
[
    {
        "resource":"/rateLimit/byUrl",
        "limitApp":"default",
        "grade":1,
        "count":1,
        "strategy":0,
        "controlBehavior":0,
        "clusterMode":false
    }
]
```

​			resource：资源名称

​			limitApp：来源应用

​			grade：阈值类型，0表示线程数，1表示QPS

​			count：单机阈值

​			strategy：流控模式，0表示直接，1表示关联，2表示链路

​			controlBehavior：流控效果，0表示快速失败，1表示Warm Up，2表示排队等待

​			clusterMode：是否集群



24.Spring Cloud Alibaba Seata处理分布式事务

​	1.分布式事务问题

​		分布式前：单机单库没有这个问题

​		分布式之后：单体应用被拆分成微服务应用，原来的三个模块被拆分成三个独立的应用，分别使用三个独立的数据源，业务操作需要调用三个服务来完成。此时每个服务内部的数据一致性由本地事务来保证，但是全局的数据一致性问题没法保证。

​		一句话：一次业务操作需要跨多个数据源或需要跨多个系统进行远程调用，就会产生分布式事务问题。

​	2.Seata简介

​		1.是什么

​			Seata是一款开源的分布式事务解决方案，致力于在微服务架构下提供高性能和简单易用的分布式事务服务。

​			官网地址：https://seata.io/zh-cn/

​		2.能干什么

​			一个典型的分布式事务过程：

​				分布式事务处理过程的`1+3`模型：一个Id + 三个组件

​				一个Id：全局事务ID，Transaction ID，XID，全局唯一的事务ID

​				三个组件：1.Transaction Coordinator(TC) 事务协调器，维护全局事务的运行状态，负责协调并驱动全局事务的提交或回滚。

​								  2.Transaction Manager(TM) 控制全局事务的边界，负责开启一个全局事务，并最终发起全局提交或全局回滚的决议。

​								  3.Resource Manager(RM) 控制分支事务，负责分支注册  、状态汇报，并接收事务协调器的指令，驱动分支（本地）事务的提交或回滚。

​			处理过程

​				1.TM向TC申请开启一个全局事务，全局事务创建成功并生成一个全局唯一的XID。

​				2.XID在微服务调用链路的上下文中传播

​				3.RM向TC注册分支事务，将其纳入XID对应全局事务的管辖。

​				4.TM向TC发起针对XID的全局提交或回滚决议

​				5.TC调度XID下管辖的全部分支事务完成提交或回滚请求。

​		3.下载地址

​			https://github.com/seata/seata/releases

​		4.如何使用

​			本地`@Transactional`

​			全局`@GlobalTransactional`

​	3.Seata-Server安装

​		1.下载seata-server-1.1.0.zip解压到指定目录并修改conf目录下的`file.conf`配置文件

​			1.自定义事务组名称

​			2.将事务日志存储模式修改为db（默认为文件，修改为数据库）

​			3.数据库连接信息

​		2.在Mysql中新建库	-	seata

​		3.在新建的库中运行sql命令来创建所需表【看评论说1.0后的版本启动seata后会自动创建数据表】

​			https://github.com/seata/seata/blob/develop/script/server/db/mysql.sql

​		4.修改conf目录下的`registry.conf`配置文件，将seata注册进Nacos

​			指明注册中心为Nacos及修改Nacos连接信息

​		5.启动Nacos	-	8848

​		6.启动seata-server

​			★Mysql8	需要做一些修改 官方说明：https://seata.io/zh-cn/docs/overview/faq.html

​			1.下载Mysql8 Connector：https://dev.mysql.com/downloads/file/?id=492426

​			2.将Mysql8 Connector压缩包中的mysql-connector-java-8.0.xx.jar复制到seata\lib下，删除Mysql5的Connector Jar包

​			3.修改`file.conf`配置

​				`driverClassName = "com.mysql.cj.jdbc.Driver"`

​				`url = "jdbc:mysql://127.0.0.1:3306/seata?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true"`

​	4.案例模拟

​		1.业务说明

​			这里我们会创建三个服务，一个订单服务，一个库存服务，一个账户服务。

​			当用户下单时，会在订单服务中创建一个订单，然后通过远程调用库存服务来扣减下单商品的库存，在通过远程调用账户服务来扣减用户账户里面的余额，最后在订单服务中修改订单状态为已完成

​			该操作跨越三个数据库，有两次远程调用，很明显会有分布式事务问题。

​			一句话：下订单	->	扣库存	->	减账户（余额）

​		2.创建业务数据库

​			1.seata_order：存储订单的数据库

```sql
CREATE DATABASE seata_order;
```

​				t_order表

```sql
CREATE TABLE t_order(
    `id` BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `user_id` BIGINT(11) DEFAULT NULL COMMENT '用户名id',
    `product_id` BIGINT(11) DEFAULT NULL COMMENT '产品id',
    `count` INT(11) DEFAULT NULL COMMENT '数量',
    `money` DECIMAL(11,0) DEFAULT NULL COMMENT '金额',
    `status` INT(1) DEFAULT NULL COMMENT '订单状态：0：创建中；1：已完结'
)ENGINE=INNODB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
```

​			2.seata_storage：存储库存的数据库

```sql
CREATE DATABASE seata_storage;
```

​				t_storage表

```sql
CREATE TABLE t_storage(
    `id` BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `product_id` BIGINT(11) DEFAULT NULL COMMENT '产品id',
    `total` INT(11) DEFAULT NULL COMMENT '总库存',
    `used` INT(11) DEFAULT NULL COMMENT '已用库存',
    `residue` INT(11) DEFAULT NULL COMMENT '剩余库存'
)ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO seata_storage.t_storage(`id`,`product_id`,`total`,`used`,`residue`) VALUES('1','1','100','0','100')
```

​			3.seata_account：存储账户信息的数据库

```sql
CREATE DATABASE seata_account;
```

​				t_account表

```sql
CREATE TABLE t_account(
    `id` BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT 'id',
    `user_id` BIGINT(11) DEFAULT NULL COMMENT '用户id',
    `total` DECIMAL(10,0) DEFAULT NULL COMMENT '总额度',
    `used` DECIMAL(10,0) DEFAULT NULL COMMENT '已用额度',
    `residue` DECIMAL(10,0) DEFAULT '0' COMMENT '剩余可用额度'
)ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO seata_account.t_account(`id`,`user_id`,`total`,`used`,`residue`) VALUES('1','1','1000','0','1000')
```

​		3.为业务数据库`分别`创建对应的回滚日志记录表

​			https://github.com/seata/seata/blob/develop/script/client/at/db/mysql.sql

​		4.编写代码

​		5.一些补充

​			1.Seata

​				2019年1月份蚂蚁金服和阿里巴巴共同开源的分布式事务解决方案

​				Seata全称Simple Extensible Autonomous Transaction Architecture，简单可扩展自治事务框架

​			2.TC/TM/RM三大组件

​				TC	-	seata-server

​				TM	-	标注了`GlobalTransactional`就是事务的发起方

​				RM	-	模块的数据库

​			3.分布式事务的执行流程

​				1.TM 开启分布式事务（TM向TC注册全局事务记录）；

​				2.按业务场景，编排数据库、服务等事务内资源（RM向TC汇报资源准备状态）；

​				3.TM结束分布式事务，事务一阶段结束（TM通知TC提交/回滚分布式事务）；

​				4.TC汇总事务信息，决定分布式事务是提交还是回滚。

​				5.TC通过所有RM提交/回滚资源，事务二阶段结束。

​			4.AT模式如何做到对业务的无侵入

​				AT模式，在阿里云叫做GTS。

​				1.是什么

​					前提

​						基于支持本地 ACID 事务的关系型数据库。

​						Java 应用，通过 JDBC 访问数据库。

## 			整体机制

​			两阶段提交协议的演变：

- 一阶段：业务数据和回滚日志记录在同一个本地事务中提交，释放本地锁和连接资源。
- 二阶段：
  - 提交异步化，非常快速地完成。
  - 回滚通过一阶段的回滚日志进行反向补偿。

1、一阶段加载

在一阶段，seata会拦截"业务sql"，

1.解析sql语义，找到“业务sql”要更新的业务数据，在业务数据被更新前，将其保存成“before image”【俗称前置镜像】，

2.执行“业务sql”更新业务数据，在业务数据更新之后

3.其保存成“after image”，最后生成行锁

以上操作全部在一个数据库事务内完成，这样保证了一阶段操作的原子性

2、二阶段提交【正常情况】

​	二阶段如果是顺利提交的话，因为“业务sql”在一阶段已经提交到数据库，所以seata框架只需将一阶段保存的快照数据和行锁删掉，完成数据清理即可。

2、二阶段回滚【异常情况】

​	二阶段如果是回滚的话，seata就需要回滚一阶段已经执行的“业务sql”，还原业务数据。

​	回滚方式便是用“before image”还原业务数据；但在还原前要首先校验脏写，对比“数据库当前业务数据”和“after image”，如果两份数据完全一致就说明没有脏写，可以还原数据，如果不一致就说明有脏写，出现脏写就需要转人工处理。









​				

​				













​			



​		





​		









​				

​		

​				













​			

​				

​				



​				