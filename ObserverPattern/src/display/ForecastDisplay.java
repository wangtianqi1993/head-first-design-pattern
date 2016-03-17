package display;
import java.util.Observable;
import java.util.Observer;
/**
 * Created by wtq on 2/29/16.
 */
public class ForecastDisplay implements Observer, DisplayElement{
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg)
    {
        WeatherData weatherData = (WeatherData)observable;
        if (observable instanceof WeatherData){
            currentPressure = weatherData.getPressure();
            lastPressure = currentPressure;
            display();
        }
    }
    public void display() {
        System.out.println("hello,world");
    }
}
