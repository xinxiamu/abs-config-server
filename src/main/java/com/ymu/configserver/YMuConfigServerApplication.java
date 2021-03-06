package com.ymu.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableConfigServer // 开启配置中心功能
@SpringBootApplication
public class YMuConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(YMuConfigServerApplication.class, args);
	}
}
