package com.example.demo.game;

import org.springframework.stereotype.Component;


public class MicronGame implements GamingConsole{
    @Override
    public String up() {
        return "Micron Up";
    }

    @Override
    public String down() {
        return "Micron down";
    }

    @Override
    public String left() {
        return "Micron left";
    }

    @Override
    public String right() {
        return "Micron right";
    }
}
