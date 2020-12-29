public abstract class ClothesDecorator implements Clothes {
   protected Baju decoratedBaju;
   protected Celana decoratedCelana;
   protected AlasKaki decoratedAlasKaki;
   protected Aksesoris decoratedAksesoris;

   public ClothesDecorator(Baju decoratedBaju, Celana decoratedCelana, AlasKaki decoratedAlasKaki, Aksesoris decoratedAksesoris){
      this.decoratedBaju = decoratedBaju;
      this.decoratedCelana = decoratedCelana;
      this.decoratedAlasKaki = decoratedAlasKaki;
      this.decoratedAksesoris = decoratedAksesoris;

   }

   public void show(){
      this.decoratedBaju.show();
      this.decoratedCelana.show();
      this.decoratedAlasKaki.show();
      this.decoratedAksesoris.show();
   }	
}