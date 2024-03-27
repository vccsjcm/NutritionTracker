public class food {
   private String name;
   private double fat;
   private double carbs;
   private double protein;
  private double servings;
 public food(String name, double fat, double carbs, double protein, double servings){
   this.name = name;
   this.fat = fat;
   this.carbs = carbs;
   this.protein = protein;
   this.servings = servings;

 }

// Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String name) {

   }


   // Getter
   public double getfat() {
     return fat;
   }

   // Setter
   public void setfat(Double fat) {

   }
  // Getter
   public double getcarbs() {
     return carbs;
   }
  public double getprotein() {
     return protein;
   }
   // Setter
   public void setCurrentPrice(Double price){

   }
   public double CalcServings() {
     return servings * (fat * 9 + carbs * 4 + protein * 4);


   }
}


