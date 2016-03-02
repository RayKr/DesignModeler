package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class DuckCall implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("猎人制作的鸭鸣器");
    }
}
