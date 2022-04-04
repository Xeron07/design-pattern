package com.xeron07.dp02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();
        Observer bigScreen = new BigScreen();
        Observer smallScreen = new SmallScreen();

        weatherData.addObserver(bigScreen);
        weatherData.addObserver(smallScreen);

        weatherData.setMeasurement(10.5,11.5,12.6);
        weatherData.setMeasurement(10.5,11.5,13.6);

        weatherData.removeObserver(smallScreen);

        weatherData.setMeasurement(14.5,11.5,12.6);
    }
}
