public class CelanaCollection implements Collection {
    public String MaleModelCelana[] = {"Jeans" , "Kulot" ,"Chinos" , "Track Pants", "Flare Pants", "Skinny Pants"};
    public String FemaleModelCelana[] = {"Rok", "Jeans" , "Kulot" ,"Chinos" , "Track Pants", "Flare Pants", "Skinny Pants"};

    @Override
    public Iterator getIterator() {
        return new CelanaIterator();
    }

    private class CelanaIterator implements Iterator {

        int indexM, indexF;

        @Override
        public Object getMaleClothes() {        
            int rand = 0 + (int)(Math.random() * (((MaleModelCelana.length - 1) - 0) + 1));            
            return MaleModelCelana[rand];            
        }

        @Override
        public Object getFemaleClothes() {        
            int rand = 0 + (int)(Math.random() * (((FemaleModelCelana.length - 1) - 0) + 1));            
            return FemaleModelCelana[rand];            
        }	

        @Override
        public Object getNext(String gender) {
            if(this.hasNext()) {
                if(gender.equals("male")) {
                    return MaleModelCelana[indexM++];
                }                
                else {
                    return FemaleModelCelana[indexF++];
                }
            }
            return null;            
        }
        
        @Override
        public boolean hasNext() {
            if(indexM < MaleModelCelana.length || indexF < FemaleModelCelana.length){
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