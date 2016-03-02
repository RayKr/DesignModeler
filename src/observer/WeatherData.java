package observer;

import java.util.ArrayList;

/**
 * Created by Ray on 2016/2/15.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    /**
     * 向各观察者发布通知
     * 调用的是观察者的方法
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            // 一一向观察者通知温度、湿度、压力信息
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者。
     */
    public void measurementsChanged() {
        notifyObserver();
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
