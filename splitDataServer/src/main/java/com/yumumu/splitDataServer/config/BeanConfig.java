package com.yumumu.splitDataServer.config;

import com.yumumu.splitDataServer.model.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Cat getOneCat() {
        Cat cat = new Cat();
        cat.setName("CAT");
        cat.setPrice(1);
        return cat;
    }
}
