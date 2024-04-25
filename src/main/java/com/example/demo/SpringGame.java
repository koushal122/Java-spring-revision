package com.example.demo;

import com.example.demo.game.GamingConsole;
import com.example.demo.game.MicronGame;
import com.example.demo.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class SpringGame {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringGame.class)) {
            //here we are getting beans which return GameRunner type
            //and we have already added @Component annotation to the PacManGame class
            //and above we set component scan to whole .demo package.
            //in whole package spring scan and check that GameRunner is also set as bean using @Component annotation
            //and from below line we are calling run method of GameRunner class.
            context.getBean(GameRunner.class).run();

            //above we can observe that spring is auto-wiring the GameRunner constructor and taking PacMan Game as GamingConsole augment for constructor.
        }
    }
}
