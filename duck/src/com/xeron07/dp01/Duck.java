package com.xeron07.dp01;

import com.xeron07.dp01.Fly.FlyBehaviour;
import com.xeron07.dp01.Quack.QuackBehaviour;

public class Duck {

    String name;
    int size;

    //fly behaviour of a duck
    FlyBehaviour flyBehaviour;

    //quack behaviour of a duck
    QuackBehaviour quackBehaviour;


    public void display(){
        System.out.println(String.format("This is a %s with size of %d",this.name,this.size));
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour=flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }




}
