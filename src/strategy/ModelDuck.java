package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class ModelDuck extends Duck {

    ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.qucakBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println("我是模型鸭！");
    }
}
