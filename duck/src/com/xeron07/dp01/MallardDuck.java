package com.xeron07.dp01;

import com.xeron07.dp01.Fly.FlyHigh;
import com.xeron07.dp01.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(String name, int size){
        this.name=name;
        this.size=size;
        this.flyBehaviour=new FlyHigh();
        this.quackBehaviour = new Quack();
    }


}
