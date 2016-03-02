package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("叫不出声");
    }
}
