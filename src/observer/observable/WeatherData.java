package observer.observable;

import java.util.Observable;

/**
 * Created by Ray on 2016/2/15.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    private UserBean userBean;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者。
     */
    public void measurementsChanged() {
        setChanged();
        userBean = new UserBean();
        userBean.setUserName("JingZonglei");
        notifyObservers(userBean);
    }

    /**
     * 从气象站获取数据的方法
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

}
