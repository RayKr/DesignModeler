package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我有翅膀，我会飞。");
    }
}
