package com.yumumu.splitDataServer.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor2 implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains("mySpringLeaningBean"))
            System.out.println("222 BeforeInitialization: " + bean.toString() + "; BEAN_NAME: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains("mySpringLeaningBean"))
            System.out.println("222 AfterInitialization: " + bean.toString() + "; BEAN_NAME: " + beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
