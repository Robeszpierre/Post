package post;

import java.awt.Choice;
import java.util.Scanner; 

public class Menu {
    static Scanner reader = new Scanner(System.in);
    
    //Megjeleniti a menut es varja a valaszt
    public static void displayRegistrationMenu(){
        System.out.println("1 - Login\n" + "2 - Registration\n" + "3 - Login as Admin\n" + "9 - Exit");
        
        System.out.print("Enter a number: ");
        executeCommand(reader.nextInt());
    }
    
    //Vegrehajtja a parancsot
    private static void executeCommand(int input){
        switch(input){
            case 1: 
                
            case 9: Post.finished();
        }
    }
}