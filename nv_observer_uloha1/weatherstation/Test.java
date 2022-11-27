package weatherstation;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vytvorme si meteostanicu
        WeatherData wd = new WeatherData();
        
        // vytvorme displej
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        StatisticDisplay sd = new StatisticDisplay(wd);
        ForecastDisplay fd = new ForecastDisplay(wd);

        // simulujme nove meranie teploty, tlaku a vlhkosti
        // sledujme vypis
        wd.setMeasurements(7.9f, 70.0f, 1034.3f);
        wd.setMeasurements(8.3f, 71.0f, 1034.2f);
        wd.setMeasurements(5.7f, 71.0f, 1034.2f);
        wd.setMeasurements(10.7f, 71.0f, 1034.2f);
    }

}
