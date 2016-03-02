package observer.observable;

/**
 * Created by Ray on 2016/2/15.
 */
public class TestObservable {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        TempBoard t = new TempBoard();
        w.addObserver(t);
        w.setMeasurements(44, 55, 22);
    }
}
