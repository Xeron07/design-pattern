package com.xeron07.dp02;

public class BigScreen implements Observer {

    @Override
    public void update(double p, double h, double t) {
        System.out.println(String.format("Update Data from Big Screen\nPressure:%.2f\nHumidity:%.2f\nTemperature:%.2f\n",p,h,t));
    }
}
