package observer;

/**
 * Created by Ray on 2016/2/15.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
