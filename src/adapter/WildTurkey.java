package adapter;

/**
 * 火鸡
 * Created by Ray on 2016/2/5.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm fly a short distance");
    }
}
