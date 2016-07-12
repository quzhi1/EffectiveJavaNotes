package item3;

/**
 * Created by zhiqu on 7/12/16.
 */
public class StaticFactoryElvis {

    private static final StaticFactoryElvis INSTANCE = new StaticFactoryElvis();

    private StaticFactoryElvis() {
        // Do something
    }

    public static StaticFactoryElvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        // Do something
    }
}
