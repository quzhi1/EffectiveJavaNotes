package item9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiqu on 7/12/16.
 */
public class Item9Main {

    public static void main(String[] args) {
        System.out.println("******* Implement PhoneNum with no hash ***********");
        Map<PhoneNumberNoHash, String> m = new HashMap<PhoneNumberNoHash, String>();
        m.put(new PhoneNumberNoHash(707, 867, 5309), "Jenny");
        System.out
            .println("m.get(new PhoneNumberNoHash(707, 867, 5309)): " + m.get(new PhoneNumberNoHash(707, 867, 5309)));
    }

}
