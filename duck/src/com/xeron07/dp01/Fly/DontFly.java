package com.xeron07.dp01.Fly;

public class DontFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("It Doesn\'t fly.");
    }
}
