package item17;

/**
 * Created by zhiqu on 8/9/16.
 */
public class Super {

    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}