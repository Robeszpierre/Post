package post;

import java.util.Scanner; 

public class Menu {
    
    //Megjeleniti a menut es varja a valaszt
    static void displayMainMenu(){
        System.out.println("1 Vasarlo\n" + "2 Kiado\n" + "3 Postas\n" + "4 Admin\n");
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
    }
}
