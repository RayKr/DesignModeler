package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("加装火箭推动装置，可以飞啦！");
    }
}
