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
