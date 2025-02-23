import org.junit.jupiter.api.Test;
import personalizedmealplangenerator.*;

// Testing Personalized Meal Plan Generator Program
public class TestingPersonalizedMealPlanGenerator
{
    @Test
    void testPersonalizedMealPlanGenerator()
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
