
package post;


public class Ujsag {
    private String nev;
    private int ar;

    private int db;
    private int odb;
    
    ///////////////////////////////////////
    
    public Ujsag(String _nev, int _ar, int _db){
        nev=_nev;
        ar=_ar;
        db= _db;
        odb=db;
    }
    
    public void setNev(String _nev){
        nev=_nev;
    }
    
    public void setAr(int _ar){
        ar=_ar;
    }
    
    public void setDb(int _db){
        db=_db;
    }
    
    public String getNev(){
        return nev;
    }
    
    public int getAr(){
        return ar;
    }
    
    public int getDb(){
        return db;
    }
    
    public String kiir(){
        return nev + " " + ar + " " + db;
    }
}
