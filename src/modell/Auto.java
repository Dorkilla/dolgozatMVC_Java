package modell;

public class Auto {
    private String szin;
    private String rendszam;
    private boolean extra;
    private boolean festes;
    
    public Auto(String szin, String rendszam){
        this(szin, rendszam,false,false);
        
    }
    
    public Auto(String szin, String rendszam, boolean extra, boolean festes ) {
        this.szin = szin;
        this.rendszam = rendszam;
        this.extra = extra;
        this.festes = festes;
    }
    
    public void setExtra(boolean extra) {
        this.extra = extra;
    }
    
    public void setFestes(boolean festes){
        this.festes = festes;
    }
     
    public String getszin() {
        return szin;
    }

    public String getrendszam() {
       return rendszam;
    }
    
    public boolean Festes(){
        return festes;
    }
    
    public boolean Extra(){
        return extra;
    }
}
