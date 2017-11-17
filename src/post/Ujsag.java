
package post;


public class Ujsag {
    private String nev;
    private int ar;
    
    ///////////////////////////////////////
    
    public Ujsag(String _nev, int _ar){
        nev=_nev;
        ar=_ar;
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
}
