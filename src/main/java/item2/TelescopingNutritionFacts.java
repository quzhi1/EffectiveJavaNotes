package item2; /**
 * Created by zhiqu on 7/12/16.
 */

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * Telescoping constructor pattern - does not scale well!
 **/
public class TelescopingNutritionFacts {

    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional
    private final int sodium; // (mg) optional
    private final int carbohydrate; // (g) optional

    public TelescopingNutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat, int sodium,
                                     int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder
            .toString(this, ToStringStyle.SHORT_PREFIX_STYLE, true, true);
    }
}