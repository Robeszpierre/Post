
package post;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import static post.Menu.reader;
import static post.Post.list;

public class Latogato {
    
    public static void listazas(){
    }
    protected void kereses(){
    }
    public void regisztracio(){} 
    
    public void bejelentkezes(){
        System.out.print("Add meg a felhasznaloneved: ");
        String felhasznalonev=reader.next();
            try{
                    Scanner Fileinput=new Scanner(new File("./src/post/Felhasznalok/"+felhasznalonev+".txt"));
                    System.out.print("Add meg a jeszavad: ");
                    if(Fileinput.next().equals(reader.next())){
                        System.out.println("Sikeresen bejelentkeztel!");
                    }else{
                        System.out.println("Rossz jelszot adtal meg!");
                    }
            }catch(FileNotFoundException e){
                    System.out.println("Nincs ilyen felhasznalonev, regisztralj!");
            }    
    }
}
