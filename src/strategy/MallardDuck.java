package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // 在构造函数初始化的时候，指定本类采用哪种策略
        qucakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("我是绿头鸭！");
    }

}
