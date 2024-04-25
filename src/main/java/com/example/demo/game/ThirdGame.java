package com.example.demo.game;

public class ThirdGame implements GamingConsole{
    @Override
    public String up() {
        return "Third Up";
    }

    @Override
    public String down() {
        return "Third down";
    }

    @Override
    public String left() {
        return "Third left";
    }

    @Override
    public String right() {
        return "Third right";
    }
}
