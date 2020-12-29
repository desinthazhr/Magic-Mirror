public class BajuCollection implements Collection {
   public String MaleModelBaju[] = {"Kemeja" , "Kaos" ,"Jas" , "Jaket", "Sweater", "Polo Shirt"};
   public String FemaleModelBaju[] = {"Kemeja" , "Kaos" ,"Jas" , "Jaket", "Sweater", "Polo Shirt"};

   @Override
   public Iterator getIterator() {
      return new BajuIterator();
   }

   private class BajuIterator implements Iterator {
      int indexM, indexF;

      @Override
      public Object getMaleClothes() {        
         int rand = 0 + (int)(Math.random() * (((MaleModelBaju.length - 1) - 0) + 1));            
         return MaleModelBaju[rand];            
      }

      @Override
      public Object getFemaleClothes() {        
         int rand = 0 + (int)(Math.random() * (((FemaleModelBaju.length - 1) - 0) + 1));            
         return FemaleModelBaju[rand];            
      }	

      @Override
      public Object getNext(String gender) {
         if(this.hasNext()) {
               if(gender.equals("male")) {
                  return MaleModelBaju[indexM++];
               }                
               else {
                  return FemaleModelBaju[indexF++];
               }
         }
         return null;            
      }
        
      @Override
      public boolean hasNext() {
         if(indexM < MaleModelBaju.length || indexF < FemaleModelBaju.length){
               return true;
         }
         return false;
      }

      @Override
      public Object random() {
         // do nothing
            return 0;
      }
      @Override
      public Object next() {
         // do nothing
            return 0;
      }
   }
}