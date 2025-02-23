package personalizedmealplangenerator;

// Creating main class PersonalizedMealPlanGenerator
public class PersonalizedMealPlanGenerator
{
    // Main Method
    public static void main(String[] args)
    {
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        Meal mealDetails = new Meal();
        System.out.println(mealDetails.generatePlan(vegetarianMeal));
        System.out.println(mealDetails.generatePlan(veganMeal));
        System.out.println(mealDetails.generatePlan(ketoMeal));
        System.out.println(mealDetails.generatePlan(highProteinMeal));
    }
}

