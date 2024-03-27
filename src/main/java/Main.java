import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner NutritionTracker = new Scanner(System.in);
   int NutritionAmount = 1;
    while (NutritionAmount <= 1) {
      System.out.println("How many food items would you like to input?: ");
      NutritionAmount =  NutritionTracker.nextInt();
      NutritionTracker.nextLine();
      double sum = 0;
      for (int i = 1; i <= NutritionAmount; i++) {
    System.out.println("Enter the name of the food item: ");
    String name = NutritionTracker.nextLine();
    System.out.println("Enter the amount of fat in "+ (name) + " (grams): ");
    double fat = NutritionTracker.nextDouble();
    NutritionTracker.nextLine();
    System.out.println("Enter the amount of carbs in "+ (name) + " (grams): ");
    double carbs = NutritionTracker.nextDouble();
    NutritionTracker.nextLine();
    System.out.println("Enter the amount of proteins in "+ (name) + " (grams): ");
    double protein = NutritionTracker.nextDouble();
    NutritionTracker.nextLine();
    System.out.println("Enter the amount of servings");
    double servings = NutritionTracker.nextDouble();
    NutritionTracker.nextLine();
         food food = new food(name,fat,carbs,protein,servings);
        System.out.println("Nutritional information per serving of "+ (name) + ":");
        System.out.println(" Fat: " + String.format("%.2f",food.getfat()) + " g");
        System.out.println(" Carbohydrates: " + String.format("%.2f",food.getcarbs()) + " g");
        System.out.println(" Protein: " + String.format("%.2f",food.getprotein()) + " g");
        System.out.println(" Total Calories for " + String.format("%.2f",(servings)) + " servings of " + (name) + ": " + String.format("%.2f",food.CalcServings()));
        sum += food.CalcServings();
      if (food.getfat() > food.getcarbs() && food.getfat() > food.getprotein())
        System.out.println("Dominant Macronutrient: Fat");
        else if (food.getcarbs() > food.getfat() && food.getcarbs() > food.getprotein())
          System.out.println("Dominant Macronutrient: Carbohydrates");
        else if (food.getprotein() > food.getfat() && food.getprotein() > food.getcarbs())
          System.out.println("Dominant Macronutrient: Protein");
        System.out.println("  ");
      }
      System.out.println("  ");
      System.out.println("Total combined calories for all food items: " + String.format("%.2f",sum));
      System.out.println("Thank you for using the Nutirition Information System!");
}
}
}
