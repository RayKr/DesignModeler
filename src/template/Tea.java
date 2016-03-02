package template;

/**
 * 茶
 * Created by Ray on 2016/2/6.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Lemon");
    }
}
