package com.lv.fliter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebApplication {

    /**
     * Spring Boot、Spring Web和Spring MVC等其他框架，都提供了很多servlet 过滤器可使用，
     * 我们需要在配置文件中定义这些过滤器为bean对象。现在假设我们的应用程序运行在一台负载均衡
     * 代理服务器后方，因此需要将代理服务器发来的请求包含的IP地址转换成真正的用户IP。
     * Tomcat 8 提供了对应的过滤器：RemoteIpFilter。通过将RemoteFilter这个过滤器加入过滤器
     * 调用链即可使用它。
     * @return
     */

    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }
}