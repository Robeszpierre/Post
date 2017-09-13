package post;

import java.util.Scanner; 
import java.util.InputMismatchException;

public class Menu {
    
    //Megjeleniti a menut es varja a valaszt
    static void displayMainMenu(){
        System.out.println("1 Vasarlo\n" + "2 Kiado\n" + "3 Postas\n" + "4 Admin\n");
        Scanner reader = new Scanner(System.in);
        
        //Input
        int choice = 0;
        do{
            try {
            choice = reader.nextInt();
            if(choice < 1 || choice > 4) {
                System.out.println("Only numbers from 1 to 4 are accepted.");
            }
        } catch (InputMismatchException e ) {
            System.out.println("Input exception occurred: Wrong input type.");
        }
        reader.nextLine();
        }while(choice < 1 || choice > 4);
    }
}
