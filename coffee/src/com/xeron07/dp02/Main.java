package com.xeron07.dp02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription());
        beverage = new Moca(new Soy(beverage));

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
