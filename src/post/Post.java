package post;

import java.util.*;

public class Post {
    
    static ArrayList<Ujsag> list = new ArrayList<Ujsag>();
    
    private static Boolean finished=false;
    private static Boolean bejelentkezett=false;
    
     public static void main(String[] args) {
        new Post().start();
        
    }

    private void start() {
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
    
}
