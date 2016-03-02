package template;

/**
 * 咖啡因饮料抽象类
 * Created by Ray on 2016/2/6.
 */
public abstract class CaffeineBeverage {

    // final用于限制子类不要覆盖此方法，该方法就是算法冲泡咖啡因饮料的算法骨架
    final void prepareRecipe() {
        // 1. 把水煮沸
        boilWater();
        // 2. 沸水冲泡该饮料
        brew();
        // 3. 将饮料倒入杯子
        pourInCup();
        // 4. 加调料
        addCondiments();
    }

    // 抽象方法封装的是变化的量，子类中具体实现
    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
