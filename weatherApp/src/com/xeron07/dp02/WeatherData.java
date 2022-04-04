package com.xeron07.dp02;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private double pressure;
    private double humidity;
    private double temp;

    public WeatherData(){
        this.observers=new ArrayList<Observer>();
    }

    public void setMeasurement(double p, double h, double t){
        this.pressure=p;
        this.humidity=h;
        this.temp=t;
        updateMeasurement();
    }



    public void updateMeasurement(){
        notifyChanged();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index>=0)
        observers.remove(index);
    }

    @Override
    public void notifyChanged() {
        for (Observer ob: observers) {
            ob.update(this.pressure,this.humidity,this.temp);
        }
    }
}
