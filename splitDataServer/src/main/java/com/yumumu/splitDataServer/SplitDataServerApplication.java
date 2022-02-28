package com.yumumu.splitDataServer;

import com.yumumu.splitDataServer.interfaces.IDemoService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@SpringBootApplication
@EnableDubbo
public class SplitDataServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitDataServerApplication.class, args);
		ServiceLoader<IDemoService> loader = ServiceLoader.load(IDemoService.class);
		loader.forEach(e->{
			try {
				System.out.println(e);
				e.getFullName("Tom");
			} catch (Exception ee) {
				System.out.println(ee.getMessage());
			}
		});
	}

}
