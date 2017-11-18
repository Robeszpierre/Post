
package post;

import static post.Menu.reader;
import static post.Post.list;
import static post.Latogato.listazas;

public class Beszallito {
    
    public void arajanlat(){
        try{
            listazas();
            boolean ok=false;
            while(ok!=true){
                try{
                    System.out.println("Melyik termek arat kivanja beallitani? (index)");
                    int i=reader.nextInt()-1;
                    System.out.println("Mennyi legyen a termek uj ara?");
                    int a=reader.nextInt();
                    list.get(i).setAr(a);
                    ok=true;
                }catch(Exception e){
                    System.out.println("Helytelenul kitoltott adatlap!");
                }
            }
        }catch(Exception e){
            System.out.println("A funkcio nem elereto!");
        }
    }

    public void beszerzesiIgenyAttekintes(){}
    public void kedvezmeny(){}
}
