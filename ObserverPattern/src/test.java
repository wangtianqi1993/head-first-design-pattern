/**
 * Created by wtq on 2/28/16.
 */

import weatherdata.WeatherData;
import display.CurrentConditionsDisplay;

public class test {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 23, 44.3f);
    }
}
