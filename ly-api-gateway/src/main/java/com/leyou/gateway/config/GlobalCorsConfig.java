package com.leyou.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/30 16:50
 * @version:
 * @modified By:
 */
@Configuration
public class GlobalCorsConfig {
    @Bean
    public CorsFilter corsFilter(){
        //1.添加cors配置信息
        CorsConfiguration  config = new CorsConfiguration();
        //1)允许的域，不要写*，否则cookie就无法使用
        config.addAllowedOrigin("http://manage.leyou.com");
        config.addAllowedOrigin("http://www.leyou.com");
        //2)是否发送cookie消息
        config.setAllowCredentials(true);
        //3)允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        //4)允许的头信息
        config.addAllowedHeader("*");
        //5)有效时长
//        config.setMaxAge(3600L);
        //2.添加影射路径，拦截一切请求
        UrlBasedCorsConfigurationSource   configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**",config);
        //3返回新的corsfilter
        return new CorsFilter(configurationSource);
    }
}
