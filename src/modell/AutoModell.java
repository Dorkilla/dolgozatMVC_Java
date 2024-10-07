package modell;

import javax.swing.JOptionPane;


public class AutoModell {
    private Auto[] autok;
    private boolean extraValasztasa;
    private boolean festesValasztasa;
  
    
    public AutoModell(){
        autok = new Auto[3];
        autok[0] = new Auto("piros", "ROL-126");
        autok[1] = new Auto("fehér", "SAZ-088");
        autok[2] = new Auto("fekete", "TOT-625");
        
    }
    
    public String kezdes(){
        String s = "";
        int i = 1;
        for(Auto autok : autok){
            String a = autok.getszin();
            String f = autok.getrendszam();
            s += i++ + ". " + a + " " + f + "\n";
        }
        return s;
    }
    
    public boolean getExtraValasztasa(){
        return extraValasztasa;
    }
    
    public void setExtraValasztasa(boolean extraValasztasa){
        this.extraValasztasa = extraValasztasa;
    }
    
    public boolean getFestesValasztasa(){
        return festesValasztasa;
    }
    
    public void setFestesValasztasa(boolean festesValasztasa){
        this.festesValasztasa = festesValasztasa;
    }
    
    public String valasztas() {
        JOptionPane.showMessageDialog(null, "Kérsz extrát?");
       if(extraValasztasa==true){
           JOptionPane.showMessageDialog(null, "Mosás elvégezve");
       }else{
            JOptionPane.showMessageDialog(null, "Nem kértél extrát");
       }
        return null;
    }
}

