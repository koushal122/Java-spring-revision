package com.example.demo.SetterBasedDependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class YourBussiness{
    Dependency1 dependency1;
    Dependency2 dependency2;

    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString(){
        return "dependency1 -> "+dependency1+" dependency2 -> "+dependency2;
    }
}

//In above class spring auto-wire/inject dependency while creating constructor.

@Component
class Dependency1{ }

@Component
class Dependency2{ }

@Component
@ComponentScan
public class SetterBasedInjection {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SetterBasedInjection.class)) {
            System.out.println(context.getBean(YourBussiness.class));
        }

    }
}


/*  output without adding setter injection/ means without adding @Autowired annotation in setter methods ->
dependency1 -> null dependency2 -> null
* */



/*  output after adding @Autowired annotation in setter method of YourBussiness class ->
dependency1 -> com.example.demo.SetterBasedInjection.Dependency1@7c7a06ec dependency2 -> com.example.demo.SetterBasedInjection.Dependency2@75d4a5c2
* */

