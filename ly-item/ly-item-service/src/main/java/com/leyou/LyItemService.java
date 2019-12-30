package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/18 15:56
 * @version:
 * @modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
//@MapperScan("com.leyou.item.mapper")
public class LyItemService {
    public static void main(String[] args) { SpringApplication.run(LyItemService.class,args);
    }
}
