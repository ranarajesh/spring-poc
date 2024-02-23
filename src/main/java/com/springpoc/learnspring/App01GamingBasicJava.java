package com.springpoc.learnspring;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        //var game = new MarioGame();
         // var game = new SuperContraGame();
        var game = new PacMan(); // 1: Object Creation 
        var gameRunner = new GameRunner(game); 
        // 2: Object Creation + Wiring of Dependencies ( Injecting the dependency)
        // Game is a Dependency of GameRunner 
        // problem here we have multiple dependencies then we need to create and injecting manually to overcome this lets use spring to inject dependency 
        gameRunner.run();
    }
}
