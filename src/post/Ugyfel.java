
package post;

import static post.Menu.reader;
import static post.Post.list;
import java.io.*;
import java.util.*;

public class Ugyfel extends Latogato {

    public void megrendeles(){
        try{
            System.out.println("Adja meg a kereses felteteleit!");
            kereses();
            System.out.println("Melyik termekbol szeretne vasarolni? (index)");
            int i=reader.nextInt();
            System.out.println("Biztosan a " + i-- + ".elemet szeretne megvasarolni? (i/n)");
            String val=reader.next();
            if (val.equals("i")){
                fizetes(i);
            } else {
                System.out.println("Ajanlat elutasitva.");
            }
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto");
        }
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
            Scanner Fileinput=new Scanner(new File("./src/post/Bankkartya/bka.txt"));
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
                    int i=0;
                    while (!bank.get(i).nev.equals(vevo) && i<bank.size()){
                        i++;
                    }
                    
                    boolean ok=false;
                    int proba=0;
                    while (proba<3 && ok!=true){
                        System.out.println("Adja meg a jelszavat!");
                        String passw=reader.next();
                        if(bank.get(i).pw.equals(passw)){
                            ok=true;
                            list.get(id).setDb(list.get(id).getDb()-1);
                            System.out.println("Koszonjuk a vasarlast!");
                        } else {
                            System.out.println("Hibas jelszo!");
                        }
                    }    
                    break;
            }
        }catch(Exception e){
            System.out.println("A  bankkartyas funkcio nem elerheto!");
        }
        
    }
}
