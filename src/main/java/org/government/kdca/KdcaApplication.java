package org.government.kdca;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.government.kdca"})
@MapperScan(basePackages = {"org.government.kdca"})
public class KdcaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KdcaApplication.class, args);
	}
}
