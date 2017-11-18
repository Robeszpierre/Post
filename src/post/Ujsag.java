
package post;


public class Ujsag {
    private String nev;
    private int ar;
    private int darabSzam;
    
    ///////////////////////////////////////
    
    public Ujsag(String _nev, int _ar, int _darabSzam){
        nev=_nev;
        ar=_ar;
        darabSzam= _darabSzam;
    }
    
    public void setNev(String _nev){
        nev=_nev;
    }
    
    public void setAr(int _ar){
        ar=_ar;
    }
    
    public String getNev(){
        return nev;
    }
    
    public int getAr(){
        return ar;
    }
    
    public String kiir(){
        return nev + " " + ar;
    }
}
