public class Aksesoris implements Clothes {
   private String model;
   private String color;

   @Override
   public void show() {
      System.out.println("\nType  : Aksesoris");
   }

   public void setModel(String model) {
      this.model = model;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getModel() {
      return this.model;
   }
   
   public String getColor() {
      return this.color;
   }
}