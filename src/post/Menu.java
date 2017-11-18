package post;

import java.awt.Choice;
import java.util.Scanner; 

public class Menu {
    static Scanner reader = new Scanner(System.in);
    
    //Megjeleniti a latogato menut es varja a valaszt
    public static void regiszTraciosMenu(Latogato latogato){
        System.out.println("1 - Bejelentkezes\n" + "2 - Registration\n" + "9 - Kilepes");
        
        System.out.print("Add meg a parancs sorszamat: ");
        executeCommand(reader.nextInt(), latogato);
    }
    
    //Vegrehajtja a parancsot
    private static void executeCommand(int input, Latogato latogato){
        switch(input){
            case 1: latogato.bejelentkezes();
            break;
            case 2: latogato.regisztracio();
            break;
            case 9: Post.finished();
        }
    }
    
    //Megjeleniti az ugyfel menut es varja a valaszt
    public static void ugyfelMenu(Ugyfel ugyfel){
        System.out.println("1 - listazas\n" + "2 - kereses\n" + "3 - megrendeles\n" + "8 - kijelentkezes\n" + "9 - Kilepes a programbol");
        System.out.print("Add meg a parancs sorszamat ");
        executeCommand2(reader.nextInt(), ugyfel);
    }
    
     //Vegrehajtja a parancsot
    private static void executeCommand2(int input, Ugyfel ugyfel){
        switch(input){
            case 1: Ugyfel.listazas();
            break;
            case 2: ugyfel.kereses();
            break;
            case 3: ugyfel.megrendeles();
            break;
            case 8: Post.kijelentkezett();
            break;
            case 9: Post.finished();
        }
    }
    
    //Megjeleniti az admin menut es varja a valaszt
    public static void adminMenu(Admin admin){
        System.out.println("1 - listazas\n" + "2 - felvitel\n" + "3 - modositas\n" + "4 - torles\n" + "8 - kijelentkezes\n" + "9 - Kilepes a programbol");
        System.out.print("Add meg a parancs sorszamat ");
        executeCommand3(reader.nextInt(), admin);
    }

    private static void executeCommand3(int input, Admin admin) {
        switch(input){
            case 1: Ugyfel.listazas();
            break;
            case 2: admin.felvitel();
            break;
            case 3: admin.modositas();
            break;
            case 8: Post.kijelentkezettAdminkent();
                    Post.kijelentkezett();
            break;
            case 9: Post.finished();
        }
    }
}

