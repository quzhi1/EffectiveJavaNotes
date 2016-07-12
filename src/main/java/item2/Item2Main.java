package item2;

/**
 * Created by zhiqu on 7/12/16.
 */
public class Item2Main {

    public static void main(String[] args) {
        // Telescoping
        TelescopingNutritionFacts telescopingNutritionFacts = new TelescopingNutritionFacts(240, 8, 100, 0, 35, 27);

        // JavaBeans
        JavaBeansNutritionFacts javaBeansNutritionFacts = new JavaBeansNutritionFacts();
        javaBeansNutritionFacts.setServingSize(240);
        javaBeansNutritionFacts.setServings(8);
        javaBeansNutritionFacts.setCalories(100);
        javaBeansNutritionFacts.setSodium(35);
        javaBeansNutritionFacts.setCarbohydrate(27);

        // Builder
        BuilderNutritionFacts cocaCola = new BuilderNutritionFacts.Builder(240, 8)
            .calories(100)
            .sodium(35)
            .carbohydrate(27)
            .build();

        System.out.println(telescopingNutritionFacts);
        System.out.println(javaBeansNutritionFacts);
        System.out.println(cocaCola);
    }
}