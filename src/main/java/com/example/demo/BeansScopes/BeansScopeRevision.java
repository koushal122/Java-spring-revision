package com.example.demo.BeansScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}

@Configuration
@ComponentScan
public class BeansScopeRevision {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeansScopeRevision.class)) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }

}


//  --------------   output --------------------------------
//com.example.demo.BeansScopes.NormalClass@29647f75
//com.example.demo.BeansScopes.NormalClass@29647f75
//com.example.demo.BeansScopes.NormalClass@29647f75
//com.example.demo.BeansScopes.PrototypeClass@3315d2d7
//com.example.demo.BeansScopes.PrototypeClass@d6e7bab
//com.example.demo.BeansScopes.PrototypeClass@5fa07e12
//com.example.demo.BeansScopes.PrototypeClass@55b53d44
