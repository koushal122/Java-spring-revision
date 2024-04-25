package com.example.demo.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//by using this component annotation we said spring that create bean of this class as well
//it will automatically create object of below class.
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
