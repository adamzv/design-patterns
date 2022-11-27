package weatherstation;

/**
 *
 * @author KI
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject wd) {
        weatherData = wd;
        weatherData.registerObserver(this);
    }

    public void update(float t, float h, float p) {
        temperature = t;
        humidity = h;
        pressure = p;
        display();
    }

    public void display() {
        System.out.println("\nDisplej 1 - Aktualne podmienky");
        System.out.println("==============================");
        System.out.println("teplota: " + temperature + " °C");
        System.out.println("vlhkost: " + humidity  + " %");
        System.out.println("tlak: " + pressure  + " hPa");
    }
}