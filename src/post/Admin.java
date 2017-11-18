
package post;

import static post.Menu.reader;
import static post.Post.list;

public class Admin {
    
    public void felvitel(){
        try{
            String n; 
            int a;
            int d;
            boolean ok=false;
            while(ok!=true){
                try{
                    ok=true;
                    System.out.println("Adja meg a termek nevet!");
                    n=reader.next();
                    System.out.println("Adja meg a termek arat!");
                    a=reader.nextInt();
                    System.out.println("Adja meg a termek darabszamat!");
                    d=reader.nextInt();
                    list.add(new Ujsag(n,a,d));
                }catch(Exception e){
                    ok=false;
                    System.out.println("Helytelenul kitoltott adatlap!");
                }
            }
            System.out.println("A termeket rogzitettuk a rendszerben.");
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto!");
        }
    }
    
    public void modositas(){
        try{
            boolean ok=false;
            while(ok!=true){
                try{
                    ok=true;
                    System.out.println("Melyik termek adatait szeretne valtoztatni? (index)");
                    int i=reader.nextInt()-1;
                    System.out.println("1 - A termek nevet kivanja modositani");
                    System.out.println("2 - A termek arat kivanja modositani");
                    int adattag=reader.nextInt();
                    if (adattag==1) {
                        System.out.println("Adja meg a termek uj nevet!");
                        list.get(i).setNev(reader.next());
                        ok=true;
                    }
                    if (adattag==2) {
                        System.out.println("Adja meg a termek uj arat!");
                        list.get(i).setAr(reader.nextInt());
                        ok=true;
                    }
                }catch(Exception e){
                    ok=false;
                    System.out.println("Helytelenul kitoltott adatlap!");
                }
            }
            System.out.println("A termek adatlapja frissitve.");
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto!");
        }
    }
    
    public void torles(){
        try{
            System.out.println("Melyik termek adatait szeretne torolni? (index)");
            int i=reader.nextInt();
            System.out.println("Biztosan torolni akarja a " + i-- + ".elemet? (y/n)");
            String ok=reader.next();
            if(ok.equals("y")){list.remove(i); System.out.println("A termek torolve.");}
            else {System.out.println("A termek nem lett torolve");}
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto!");
        }
    }
    
}
