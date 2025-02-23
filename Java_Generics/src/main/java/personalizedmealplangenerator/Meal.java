package personalizedmealplangenerator;
import java.util.ArrayList;
import java.util.List;
//Creating generic class Meal
public class Meal<T extends MealPlan>
{
    List<T> meals = new ArrayList<T>();

    public void addMeal (T meal)
    {
        meals.add(meal);
    }

    public List<T> getMeals(T meal)
    {
        return meals;
    }

    public String generatePlan(T meal)
    {
        return ("Generated Meal Plan is " + meal.getMealType());
    }
}
