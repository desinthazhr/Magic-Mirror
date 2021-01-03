import java.util.Scanner;

public class SingleObject {
    private Scanner sc = new Scanner(System.in);
    private String gender;
    private String username;
    private ModelClothes combo;

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {}

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void scanUser() {
        System.out.print("\nEnter Username : ");
        username = sc.nextLine();

        System.out.print("\nEnter Gender(Male/Female) : ");
        gender = sc.nextLine();

        gender = gender.toLowerCase();

        if(gender.equals("male") || gender.equals("female")) {
            showThemes();
        }
        else {
            System.out.println("Your input is wrong!");
            scanUser();
        }
    }

    public void showMenu() {
        System.out.println("\nMagic Mirror");
        scanUser();             
    }

    public void showThemes() {
        System.out.println("\nChoose Clothes Themes");
        System.out.println("1. Tema 1");
        System.out.println("2. Tema 2");
        System.out.println("3. Tema 3");
        System.out.println("4. Tema 4");
        System.out.println("5. Tema 5");

        System.out.print("\nEnter Your Choice : ");
        int pilihan = sc.nextInt();
        createClothes(pilihan);
    }

    public void colorMenu() {
        ColorCollection koleksiWarna = new ColorCollection();        

        System.out.print("\nDo You Want to change clothes color(y/n) : ");        
        sc.nextLine();
        String change = sc.nextLine();
        change = change.toLowerCase();

        if(change.equals("y")) {
            System.out.println("\nWhich one do you want to change");
            System.out.println("1. Baju");
            System.out.println("2. Celana");
            System.out.println("3. Alas Kaki");
            System.out.println("4. Aksesoris");

            System.out.print("\nEnter Your Choice : ");
            int pakaianPilihan = sc.nextInt();

            System.out.println("\nChoose color");
            int counter = 1; 
            String color[] = new String[koleksiWarna.getSize()];
            for(Iterator iter = koleksiWarna.getIterator(); iter.hasNext();) {                
                color[counter - 1] = (String)iter.next();
                System.out.println(counter + ". " + color[counter - 1]);
                counter++;
            }
            System.out.print("\nEnter Your Choice : ");
            int warnaPilihan = sc.nextInt();
            if(warnaPilihan <= koleksiWarna.getSize() && pakaianPilihan < 5) {
                changeColor(pakaianPilihan, color[warnaPilihan - 1]);
            }
            else {
                System.out.println("Your input is wrong!");
                colorMenu();
            }
        }    
        else {
            System.out.print("\nTry Another Clothes?(y/n) : ");
            change = sc.nextLine();
            change = change.toLowerCase();
            if(change.equals("y")) {
                showThemes();
            }
            else {
                System.out.println("\nThanks for Coming :)");
            }         
        }    
    }

    public void changeColor(int pilihanPakaian, String pilihanWarna) {
        if(pilihanPakaian == 1) {
            Baju baju = combo.getBaju();
            baju.setColor(pilihanWarna);
        }
        else if(pilihanPakaian == 2) {
            Celana celana = combo.getCelana();
            celana.setColor(pilihanWarna);
        }
        else if(pilihanPakaian == 3) {
            AlasKaki alasKaki = combo.getAlasKaki();
            alasKaki.setColor(pilihanWarna);
        }
        else if(pilihanPakaian == 4) {
            Aksesoris aksesoris = combo.getAksesoris();
            aksesoris.setColor(pilihanWarna);
        }        
        combo.show();
        colorMenu();
    }

    // create random clothes
    public void createClothes(int pilihan) {
        if(pilihan > 0 && pilihan <= 5) {
            Baju baju = new Baju();
            Celana celana = new Celana();
            AlasKaki alasKaki = new AlasKaki();
            Aksesoris aksesoris = new Aksesoris();

            gender = gender.toLowerCase();            
                        
            combo = new ModelClothes(baju, celana, alasKaki, aksesoris);
            combo.mixAndMatch(gender);
            combo.show();  

            colorMenu();
        }    
        else {
            System.out.println("Your input is wrong!");
            showThemes();
        }             
    }
}