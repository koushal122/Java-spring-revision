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
            context.getBean(GameRunner.class).run();
        }
    }
}
