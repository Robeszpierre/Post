
package post;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static post.Menu.reader;
import static post.Post.list;

public class Latogato {
    
    public static void listazas(){
        try{
            if (list.isEmpty()) {
                System.out.println("A termekek nem erhetoek el!");
            } else {
                System.out.println("A termekek listaja:");
                for(int i=0; i<list.size(); i++){
                    System.out.println(i+1 + " " + list.get(i).kiir());
                }
            }
        }catch(Exception e){
            System.out.println("A funkcio nem erheto el!");
        }
    }
    
    protected void kereses(){
        try{
            int max=-1;
            try{
                System.out.println("Adja meg a keresett termek maximalis arat!");
                max=reader.nextInt();
            }catch(Exception e){
                System.out.println("Helytelen parameter!");
            }
            if(max!=-1){
                boolean volt=false;
                for(int i=0; i<list.size(); i++){
                    if (list.get(i).getAr()<=max){
                        volt=true;
                        System.out.println(i+1 + " " + list.get(i).kiir());
                    }
                }
            }
        }catch(Exception e){
            System.out.println("A funkcio nem erheto el!");
        }
    }
    public void regisztracio(){
        System.out.print("Add meg a felhasznaloneved: ");
        String felhasznalonev=reader.next();
        Boolean letezik=false;
        while(!letezik){
        File felhasznaloFile = new File("./src/post/Felhasznalok/"+felhasznalonev+".txt");
            if(!felhasznaloFile.exists()){
                letezik=true;
            }else{
                System.out.print("Felhasznalonev mar letezik!\nAdj meg masik felhasznalonevet: ");
                felhasznalonev=reader.next();
            }
        }
        System.out.print("Add meg a jelszavad: ");
        String jelszo=reader.next();
        try {
            PrintWriter ujFelhasznaloFile = new PrintWriter("./src/post/Felhasznalok/"+felhasznalonev+".txt");
            ujFelhasznaloFile.println(jelszo);
            ujFelhasznaloFile.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File nem talalhato");
        }
    } 
    
    public void bejelentkezes(){
        System.out.print("Add meg a felhasznaloneved: ");
        String felhasznalonev=reader.next();
            try{
                    Scanner Fileinput=new Scanner(new File("./src/post/Felhasznalok/"+felhasznalonev+".txt"));
                    System.out.print("Add meg a jeszavad: ");
                    if(Fileinput.next().equals(reader.next())){
                        System.out.println("Sikeresen bejelentkeztel!");
                        Post.bejelentkezett();
                        if(felhasznalonev.equals("admin")){
                            Post.bejelentkezettAdminkent();
                        }
                        if(felhasznalonev.equals("beszallito")){
                            Post.bejelentkezettBeszallitokent();
                        }
                    }else{
                        System.out.println("Rossz jelszot adtal meg!");
                    }
            }catch(FileNotFoundException e){
                    System.out.println("Nincs ilyen felhasznalonev, regisztralj!");
            }    
    }
}
