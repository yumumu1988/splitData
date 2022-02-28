package com.yumumu.splitDataWeb;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SplitDataWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SplitDataWebApplication.class, args);
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(5), new ThreadPoolExecutor.AbortPolicy());
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Thread thread = new Thread();
	}

}
