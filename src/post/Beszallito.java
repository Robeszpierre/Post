
package post;

import static post.Menu.reader;
import static post.Post.list;
import static post.Latogato.listazas;
import java.util.*;

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

    public void beszerzesiIgenyAttekintes(){
        class Igeny{
            Ujsag uj;
            int megrendelesiIgeny;
            
            public Igeny(Ujsag uj){
                this.uj=uj;
                megrendelesiIgeny=uj.getOdb()-uj.getDb();
            }
        }
        
        ArrayList<Igeny>beszig=new ArrayList<Igeny>();
        
        try{
            if(list.isEmpty()){
                System.out.println("A rendszer nem talal megrendeleseket!");
            }else{
            
            for(int i=0; i<list.size(); i++){
                beszig.add(new Igeny(list.get(i)));
            }
           
                for(int i=0; i<list.size(); i++){
                    int max=0;
                    int maxid=0;
                    int h;
                    for(h=i+1; h<beszig.size(); h++){
                        if(beszig.get(h).megrendelesiIgeny>=max){
                            max=beszig.get(h).megrendelesiIgeny;
                            maxid=h;
                        }
                    }
                    System.out.println(beszig.get(h).megrendelesiIgeny + " " + beszig.get(h).uj.getNev());
                    beszig.remove(h);
                }            
            }
        }catch(Exception e){
            System.out.println("A funkcio nem elerheto!");
        }
    }
    
    public void kedvezmeny(){
        try{
            listazas();
            try{
                System.out.println("Melyik termek arat kivanja kedvezmenyezni? (index)");
                int i=reader.nextInt()-1;
                System.out.println("Hany szazalekos kedvezmenyt kivan ra adni? (int)");
                int kedv=reader.nextInt();
                list.get(i).setAr(list.get(i).getAr()-((list.get(i).getAr()*kedv)/100));
            }catch (Exception e){
                System.out.println("Helytelenul kitoltott adatlap!");
            }
        }catch(Exception e){
            System.out.println("A funkcio nem elereto!");
        }
    }
}
