package vezerlo;

import modell.AutoModell;
import nezet.FelugroNezetA;

public class FelugroVezerloA {
     private AutoModell modell;
     private FelugroNezetA nezet;
     
public FelugroVezerloA(AutoModell modell, FelugroNezetA nezet) {
    this.modell=modell;
    this.nezet=nezet;
    
    start();
}

    private void start() {
        nezet.megjelenit(modell.kezdes());
         nezet.megjelenit(modell.valasztas());
    }
}
