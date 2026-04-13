interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T plan) {
        this.plan = plan;
    }
}

public class MealDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> m2 = new Meal<>(new VeganMeal());

        System.out.println(m1);
        System.out.println(m2);
    }
}