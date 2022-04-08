package com.xeron07.dp02;

public class Moca extends CondimentObject{
    Beverage beverage;

    public Moca(Beverage b){
        this.beverage=b;
    }

    @Override
    public double cost() {
        return 0.6+this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",Moca ";
    }
}
