package com.liang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Component(value = "people")
public class People {
    @Value("小明")
    private String name;
    @Autowired
    @Qualifier(value = "dog")
    //@Resource(name = "dog")
    private Dog dog;
    @Autowired
    private Cat cat;
    public People(){}
    public People(String name,Dog dog,Cat cat){
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
