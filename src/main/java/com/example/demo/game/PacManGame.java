package com.example.demo.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
    @Override
    public String up() {
        return "PacMan Up";
    }

    @Override
    public String down() {
        return "PacMan down";
    }

    @Override
    public String left() {
        return "PacMan left";
    }

    @Override
    public String right() {
        return "PacMan right";
    }
}
