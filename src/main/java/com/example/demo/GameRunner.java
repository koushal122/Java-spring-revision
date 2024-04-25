package com.example.demo;

import com.example.demo.game.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    public GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole=gamingConsole;
    }
    public void run(){
        System.out.println(gamingConsole.up());
        System.out.println(gamingConsole.down());
        System.out.println(gamingConsole.left());
        System.out.println(gamingConsole.right());
    }
}
