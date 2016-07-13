package item8;

/**
 * Created by zhiqu on 7/12/16.
 */
public class Item8Main {

    public static void main(String[] args) {
        CaseInsensitiveStringBadIml cisBad = new CaseInsensitiveStringBadIml("Polish");
        CaseInsensitiveStringGoodIml cisGood = new CaseInsensitiveStringGoodIml("Polish");
        String s = "polish";
        System.out.println("cisBad.equals(s): " + cisBad.equals(s));
        System.out.println("s.equals(cisBad): " + s.equals(cisBad));
        System.out.println("cisGood.equals(s): " + cisGood.equals(s));
        System.out.println("s.equals(cisGood): " + s.equals(cisGood));
    }
}
