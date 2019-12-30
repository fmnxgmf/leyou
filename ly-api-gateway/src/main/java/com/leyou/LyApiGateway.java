package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/18 15:11
 * @version:
 * @modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启EurekaClient功能
@EnableZuulProxy  // 开启Zuul的网关功能
public class LyApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyApiGateway.class,args);
    }
}
