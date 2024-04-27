package com.example.demo.ConstructorBasedDependencyInjectionRevision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class YourBussiness{
   Dependency1 dependency1;
   Dependency2 dependency2;

    //here @Autowired annotation is option
    @Autowired
    public YourBussiness(Dependency1 dependency1,Dependency2 dependency2){
        this.dependency1=dependency1;
        this.dependency2=dependency2;
        System.out.println("dependency1 -> "+dependency1);
        System.out.println("dependency2 -> "+dependency2);
    }
}

//In above class spring auto-wire/inject dependency while creating constructor.

@Component
class Dependency1{ }

@Component
class Dependency2{ }

@Component
@ComponentScan
class ConstructorBasedInjection {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ConstructorBasedInjection.class)) {
            context.getBean(YourBussiness.class);
        }

    }
}

/*  output ->
* dependency1 -> com.example.demo.DependencyInjectionRevision.Dependency1@74e52303
//dependency2 -> com.example.demo.DependencyInjectionRevision.Dependency2@47af7f3d
* */

