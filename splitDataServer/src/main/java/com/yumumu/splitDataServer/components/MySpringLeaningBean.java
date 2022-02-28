package com.yumumu.splitDataServer.components;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MySpringLeaningBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("111 BeanFactoryAware: " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("111 BeanNameAware: " + s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("111 InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("111 ApplicationContextAware: " + applicationContext.toString());
    }

    public MySpringLeaningBean() {
        System.out.println("111 Constructor");
    }

    @PostConstruct
    private void MyConstruct() {
        System.out.println("111 PostConstruct");
    }
}
