package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.qucakBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
    }

}
