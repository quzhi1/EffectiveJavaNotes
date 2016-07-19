package item8;

import java.awt.*;

/**
 * Created by zhiqu on 7/12/16.
 */
public class Item8Main {

    public static void main(String[] args) {
        System.out.println("************ Point ************");
        CaseInsensitiveStringBadIml cisBad = new CaseInsensitiveStringBadIml("Polish");
        CaseInsensitiveStringGoodIml cisGood = new CaseInsensitiveStringGoodIml("Polish");
        String s = "polish";
        System.out.println("// Broken Symmetry");
        System.out.println("cisBad.equals(s): " + cisBad.equals(s));
        System.out.println("s.equals(cisBad): " + s.equals(cisBad));
        System.out.println("// Fixed Symmetry");
        System.out.println("cisGood.equals(s): " + cisGood.equals(s));
        System.out.println("s.equals(cisGood): " + s.equals(cisGood));

        System.out.println("************ ColorPointBadTransitivity ************");
        Point p = new Point(1, 2);
        ColorPointBadSymmetry cpBadSymmetry = new ColorPointBadSymmetry(1, 2, Color.RED);
        System.out.println("// Broken Symmetry");
        System.out.println("cpBadSymmetry.equals(p): " + cpBadSymmetry.equals(p));
        System.out.println("p.equals(cpBadSymmetry): " + p.equals(cpBadSymmetry));
        System.out.println("// Broken Transitivity");
        ColorPointBadTransitivity p1 = new ColorPointBadTransitivity(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPointBadTransitivity p3 = new ColorPointBadTransitivity(1, 2, Color.BLUE);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p2.equals(p3): " + p2.equals(p3));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
    }

}
