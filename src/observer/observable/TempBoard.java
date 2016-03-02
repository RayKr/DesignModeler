package observer.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ray on 2016/2/15.
 */
public class TempBoard implements Observer {

    private String username;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData && arg instanceof UserBean) {
            // pull
            WeatherData w = (WeatherData) o;
            System.out.println("o:"+w.getTemperature()+ ";"+w.getHumidity()+";"+w.getPressure());

            // push
            UserBean userBean = (UserBean) arg;
            System.out.println("name:"+userBean.getUserName());
        }

    }
}
