package decorator;

/**
 * Created by Ray on 2016/2/17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
