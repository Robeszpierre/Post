
package post;

import static post.Menu.reader;
import static post.Post.list;
import java.io.*;
import java.util.*;

public class Ugyfel extends Latogato {
    
    public void belepes(){}
    
    public void megrendeles(){
        System.out.println("Melyik termekbol szeretne vasarolni?");
        int i=reader.nextInt();
        fizetes(i);
    }
    
    public void fizetes(int id){
        
        class Bankcard{
            public String nev;
            public String pw;
            
            Bankcard(String _n, String _pw){
                nev=_n;
                pw=_pw;
            }
        }
        
        try{
            ArrayList<Bankcard>bank = new ArrayList<Bankcard>();
            Scanner Fileinput=new Scanner(new File("./src/post/bka"));
            while(Fileinput.hasNextLine()){
                bank.add(new Bankcard(Fileinput.next(),Fileinput.next()));
            }
            System.out.println("Kezpenzzel vagy bankkarrtyaval fizetne? (1/2)");
            int val=reader.nextInt();
            switch(val){
                case 1:
                    list.get(id).setDb(list.get(id).getDb()-1);
                    System.out.println("Koszonjuk a vasarlast!");
                    break;
                case 2:
                    System.out.println("Adja meg a bankkartyaszamat!");     //bankkárya azonosítása
                    String vevo=reader.next();
                    boolean siker=false;
                    for(int i=0; i<bank.size(); i++){
                        if (bank.get(i).nev.equals(vevo)){
                            int proba=0;
                            do{                                             //jelszó max 3x
                                proba++;
                                System.out.println("Adja meg a jelszavat!");
                                String pw=reader.next();
                                if(pw.equals(bank.get(i).pw)){
                                    siker=true;
                                } else {
                                    System.out.println("Rossz jelszo");
                                }
                            }while(proba<=3 || siker!=true);
                        }
                    }
                    if (siker!=true){
                        System.out.println("Sikertelen tranzakció");
                    } else {
                        list.get(id).setDb(list.get(id).getDb()-1);
                        System.out.println("Koszonjuk a vasarlast!");
                    }                    
                    break;
            }
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto!");
        }
        
    }
}
