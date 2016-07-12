package item2; /**
 * Created by zhiqu on 7/12/16.
 */

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * JavaBeans Pattern - allows inconsistency, mandates mutability
 **/
public class JavaBeansNutritionFacts {

    // Parameters initialized to default values (if any)
    private int servingSize = -1; // Required; no default value
    private int servings = -1; // " " " "
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public JavaBeansNutritionFacts() {
    }

    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder
            .toString(this, ToStringStyle.SHORT_PREFIX_STYLE, true, true);
    }
}
