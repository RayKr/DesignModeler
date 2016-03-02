package strategy;

/**
 * Created by Ray on 2016/2/14.
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior qucakBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQucakBehavior(QuackBehavior qucakBehavior) {
        this.qucakBehavior = qucakBehavior;
    }

    protected void swim() {
    }

    protected abstract void display();

    public void performQuack() {
        qucakBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
