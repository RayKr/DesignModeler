package adapter;

/**
 * 适配鸭子的火鸡适配器类
 * Created by Ray on 2016/2/5.
 */
public class TurkeyAdapter implements Duck {
    // 实现Duck接口是因为要将火鸡伪装成鸭子，所以必须要实现鸭子的行为接口

    // 在内部声明火鸡，即把火鸡塞入鸭子的皮囊中，但记住：任何时候都是面向接口开发
    Turkey turkey;

    // 构造函数初始化，这步操作就如同指定将哪一只火鸡塞入鸭子皮囊。
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // 用火鸡的咯咯叫顶包鸭子的呱呱叫
        turkey.gobble();
    }

    @Override
    public void fly() {
        // 由于火鸡飞行距离短，所以让他连续飞5次来模拟鸭子的飞行。
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
