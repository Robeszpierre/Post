package post;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Post {
    
    static ArrayList<Ujsag> list = new ArrayList<Ujsag>();
    
    private static Boolean finished=false;
    private static Boolean bejelentkezett=false;
    
     public static void main(String[] args) {
        new Post().start();
        
    }

    private void start() {
        termekekBetoltese();
        Latogato latogato=new Latogato();
        while(!finished){
            if(!bejelentkezett){
                Menu.regiszTraciosMenu(latogato);
            }else if(bejelentkezett){
                Ugyfel ugyfel=new Ugyfel();
                Menu.ugyfelMenu(ugyfel);
            }
        }
    }

    public static void finished(){
        finished=true;
    }
   
    public static void bejelentkezett(){
        bejelentkezett=true;
    }
    
    public static void kijelentkezett() {
        bejelentkezett=false;
    }
    
    private void termekekBetoltese(){
        try{
        Scanner fileInput=new Scanner(new File("src/post/Termekek/ujsagok.txt"));
        while(fileInput.hasNext()){
            String nev=fileInput.nextLine();
            int ar=Integer.parseInt(fileInput.nextLine());
            int darabSzam=Integer.parseInt(fileInput.nextLine());
            list.add(new Ujsag(nev, ar, darabSzam));
        }
        fileInput.close();
        }catch(FileNotFoundException e){
            System.out.println("File nem talalhato");
        }
    }
}
