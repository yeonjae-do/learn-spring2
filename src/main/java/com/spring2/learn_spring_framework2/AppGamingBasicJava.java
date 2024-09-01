package com.spring2.learn_spring_framework2;

import com.spring2.learn_spring_framework2.game.GameRunner;
import com.spring2.learn_spring_framework2.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args){

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }

}
