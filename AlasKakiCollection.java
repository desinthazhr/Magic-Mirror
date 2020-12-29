public class AlasKakiCollection implements Collection {
    public String MaleModelAlasKaki[] = {"Sneaker" , "Sandal", "Boots"};
    public String FemaleModelAlasKaki[] = {"Sneaker" , "Sandal", "Heels", "Flat Shoes", "Boots"};

    @Override
    public Iterator getIterator() {
        return new AlasKakiIterator();
    }

    private class AlasKakiIterator implements Iterator {

        int indexM, indexF;

        @Override
        public Object getMaleClothes() {        
            int rand = 0 + (int)(Math.random() * (((MaleModelAlasKaki.length - 1) - 0) + 1));            
            return MaleModelAlasKaki[rand];            
        }

        @Override
        public Object getFemaleClothes() {        
            int rand = 0 + (int)(Math.random() * (((FemaleModelAlasKaki.length - 1) - 0) + 1));            
            return FemaleModelAlasKaki[rand];            
        }	

        @Override
        public Object getNext(String gender) {
            if(this.hasNext()) {
                if(gender.equals("male")) {
                    return MaleModelAlasKaki[indexM++];
                }                
                else {
                    return FemaleModelAlasKaki[indexF++];
                }
            }
            return null;            
        }
        
        @Override
        public boolean hasNext() {
            if(indexM < MaleModelAlasKaki.length || indexF < FemaleModelAlasKaki.length){
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