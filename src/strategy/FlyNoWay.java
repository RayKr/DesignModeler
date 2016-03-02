package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞。");
    }
}
