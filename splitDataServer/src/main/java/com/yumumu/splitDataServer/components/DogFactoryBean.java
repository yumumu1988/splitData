package com.yumumu.splitDataServer.components;

import com.yumumu.splitDataServer.model.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class DogFactoryBean implements FactoryBean<Dog> {

    @Override
    public Dog getObject() throws Exception {
        Dog dog = new Dog();
        dog.setName("DOG");
        dog.setPrice(2);
        return dog;
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

}
