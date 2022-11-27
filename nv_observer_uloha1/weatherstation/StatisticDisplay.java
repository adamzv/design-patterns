package weatherstation;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private float minTemp = Float.MAX_VALUE;
    private float maxTemp = Float.MIN_VALUE;
    private float avgTemp;
    private float sum = 0f;
    private int n = 0;

    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nDisplej 2 - Statistika");
        System.out.println("==============================");
        System.out.println("min. teplota: " + minTemp + " °C");
        System.out.println("max. teplota: " + maxTemp  + " °C");
        System.out.println("priem. teplota: " + avgTemp  + " °C");
    }

    @Override
    public void update(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        sum += temperature;
        n += 1;
        avgTemp = sum / n;
        display();
    }
}
