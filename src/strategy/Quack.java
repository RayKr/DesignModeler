package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
