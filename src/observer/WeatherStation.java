package observer;

import java.util.Observable;

/**
 * Created by Ray on 2016/2/15.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(82, 35, 23.4f);
        weatherData.setMeasurements(71, 52, 50.5f);

    }
}
