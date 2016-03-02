package decorator;

/**
 * Created by Ray on 2016/2/17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
