public class AksesorisCollection implements Collection {
    public String ModelAksesoris[] = {"Jam" , "Topi" ,"Gelang" , "Kacamata", "Kalung", "Bros", "Tali Pinggang", "Syal"};

    @Override
    public Iterator getIterator() {
        return new AksesorisIterator();
    }

    private class AksesorisIterator implements Iterator {

        int index;

        @Override
        public Object next() {
        
            if(this.hasNext()){
                return ModelAksesoris[index++];
            }
            return null;
        }	

        @Override
        public Object random() {
            int rand = 0 + (int)(Math.random() * (((ModelAksesoris.length - 1) - 0) + 1));
            if(this.hasNext()){
                return ModelAksesoris[rand];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
        
            if(index < ModelAksesoris.length){
                return true;
            }
            return false;
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
            //do nothing
            return 0;
        }        
    }
}