package com.xeron07.dp02;

public class Soy extends CondimentObject {
    Beverage beverage;

    public Soy(Beverage b){
        this.beverage=b;
    }

    @Override
    public double cost() {
        return 0.8+this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",Soy ";
    }
}
