package weatherstation;

public class ForecastDisplay implements Observer,DisplayElement {
    private float pressure;
    private String msg;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nDisplej 3 - Predpoved pocasia");
        System.out.println("==============================");
        System.out.println(msg);
    }

    @Override
    public void update(float t, float h, float p) {
        if (p > pressure) {
            msg = "pocasie sa zlepsi";
        } else if (p < pressure) {
            msg = "ochladi sa, mozno bude prsat";
        } else {
            msg = "ziadna zmena nehrozi";
        }
        this.pressure = p;
        display();
    }
}
