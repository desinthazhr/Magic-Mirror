public class ModelClothes extends ClothesDecorator{
    //get Collection
    private BajuCollection KoleksiBaju = new BajuCollection();
    private CelanaCollection KoleksiCelana = new CelanaCollection();
    private AlasKakiCollection KoleksiAlasKaki = new AlasKakiCollection();
    private AksesorisCollection KoleksiAksesoris = new AksesorisCollection();
    private ColorCollection KoleksiWarna = new ColorCollection();

    public ModelClothes(Baju decoratedBaju, Celana decoratedCelana, AlasKaki decoratedAlasKaki, Aksesoris decoratedAksesoris) {
        super(decoratedBaju, decoratedCelana, decoratedAlasKaki, decoratedAksesoris);
    }

    @Override
    public void show() {
        decoratedBaju.show();
        System.out.println("Model : " + decoratedBaju.getModel());
        System.out.println("Warna : " + decoratedBaju.getColor());
                        
        decoratedCelana.show();
        System.out.println("Model : " + decoratedCelana.getModel());
        System.out.println("Warna : " + decoratedCelana.getColor());
        
        decoratedAlasKaki.show();
        System.out.println("Model : " + decoratedAlasKaki.getModel());
        System.out.println("Warna : " + decoratedAlasKaki.getColor());     
       
        decoratedAksesoris.show();
        System.out.println("Model : " + decoratedAksesoris.getModel());
        System.out.println("Warna : " + decoratedAksesoris.getColor());      
    }

    public void mixAndMatch(String gender) {
        setBaju(decoratedBaju, gender);
        setCelana(decoratedCelana, gender);
        setAlasKaki(decoratedAlasKaki, gender);
        setAksesoris(decoratedAksesoris);
    }

    public void setBaju(Baju decoratedBaju, String gender) {        
        Iterator iter = KoleksiBaju.getIterator(); 
        String name;
        if(gender.equals("male")) {
            name = (String)iter.getMaleClothes();        
        }                
        else {
            name = (String)iter.getFemaleClothes();        
        }
        decoratedBaju.setModel(name);
        decoratedBaju.setColor(makeColor());
        
    }
    public void setCelana(Celana decoratedCelana, String gender) {        
        Iterator iter = KoleksiCelana.getIterator();     
        String name;
        if(gender.equals("male")) {
            name = (String)iter.getMaleClothes();        
        }            
        else {
            name = (String)iter.getFemaleClothes();        
        }
        decoratedCelana.setModel(name);
        decoratedCelana.setColor(makeColor());
        
    }
    public void setAlasKaki(AlasKaki decoratedAlasKaki, String gender) {        
        Iterator iter = KoleksiAlasKaki.getIterator();         
        String name;
        if(gender.equals("male")) {
            name = (String)iter.getMaleClothes();         
        }        
        else {
            name = (String)iter.getFemaleClothes();         
        }
        decoratedAlasKaki.setModel(name);
        decoratedAlasKaki.setColor(makeColor());
           
    }
    public void setAksesoris(Aksesoris decoratedAksesoris) {        
        Iterator iter = KoleksiAksesoris.getIterator();         
        String name = (String)iter.random();                              
        decoratedAksesoris.setModel(name);
        decoratedAksesoris.setColor(makeColor());
         
    }

    public Baju getBaju() {
        return decoratedBaju;
    }

    public Celana getCelana() {
        return decoratedCelana;
    }

    public AlasKaki getAlasKaki() {
        return decoratedAlasKaki;
    }

    public Aksesoris getAksesoris() {
        return decoratedAksesoris;
    }

    public String makeColor() {
        Iterator iter = KoleksiWarna.getIterator();         
        String warna = (String)iter.random();
        return warna;               
    }
}