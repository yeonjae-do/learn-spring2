package com.spring2.learn_spring_framework2;

import com.spring2.learn_spring_framework2.game.GameRunner;
import com.spring2.learn_spring_framework2.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args){

        var game = new PacManGame(); // 객체생성
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game); // 객체생성 + game 으로 의존성 연결, GamingConsole이 GameRunner의 의존성
        gameRunner.run();
    }

}
