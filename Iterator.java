public interface Iterator {
   public Object getMaleClothes();
   public Object getFemaleClothes();
   public Object next();
   public Object getNext(String gender);
   public boolean hasNext();
   public Object random();
}