package com.xeron07.dp02;

public class Expresso extends Beverage{

    public Expresso(){
        description="Expresso ";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
