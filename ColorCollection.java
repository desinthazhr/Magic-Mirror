public class ColorCollection implements Collection {
    public String KoleksiWarna[] = {"Putih" , "Hijau" ,"Kuning" , "Hitam", "Biru", "Merah", "Jingga", "Ungu", "Abu-abu"};

    @Override
    public Iterator getIterator() {
        return new ColorIterator();
    }

    public int getSize() {
        return KoleksiWarna.length;
    }

    private class ColorIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
        
            if(index < KoleksiWarna.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
        
            if(this.hasNext()){
                return KoleksiWarna[index++];
            }
            return null;
        }	

        @Override
        public Object random() {
            int rand = 0 + (int)(Math.random() * (((KoleksiWarna.length - 1) - 0) + 1));
            if(this.hasNext()){
                return KoleksiWarna[rand];
            }
            return null;
        }

        @Override
        public Object getMaleClothes() {        
            // do nothing
            return 0;        
        }

        @Override
        public Object getFemaleClothes() {        
            // do nothing
            return 0;           
        }	 
        @Override
        public Object getNext(String gender) {
            // do nothing
            return 0;
        }
    }
}