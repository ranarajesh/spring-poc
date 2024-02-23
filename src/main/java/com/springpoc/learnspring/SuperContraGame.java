package com.springpoc.learnspring;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Go jump");
    }
    public void down(){
        System.out.println("Sit down");
    }
    public void left(){
        System.out.println("Go left");
    }
    public void right(){
        System.out.println("UP right");
    }
}
    
// Only thing constant in technology is change
// - business requirements change 
// - Frameworks change
// - Code changes 
// we want loose coupling as much as possible
// we want to make functional changes with as less code changes as possible
