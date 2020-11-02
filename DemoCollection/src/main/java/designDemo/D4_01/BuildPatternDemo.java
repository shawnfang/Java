package designDemo.D4_01;

public class BuildPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegBurger = mealBuilder.prepareNonVegMeal();
        System.out.println(vegBurger.getCost());
        vegBurger.showItems();
    }
}
