package catv.product;

/**
 * Created by Ray on 2016/2/14.
 */
public abstract class PctBusiness {
    // 子产品类别
    protected String pcttype;

    // 策略的引用
    protected PctStrategy strategy;

    // 设置策略
    public void setStrategy(PctStrategy strategy) {
        this.strategy = strategy;
    }

    public PctBusiness(String pcttype) {
        this.pcttype = pcttype;
    }

    /**
     * 利用策略的统一接口处理业务
     */
    public void handBusiness() {
        strategy.hand(this.pcttype);
    }

}
