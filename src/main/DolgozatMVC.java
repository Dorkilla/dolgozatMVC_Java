package main;

import modell.AutoModell;
import nezet.FelugroNezetA;
import vezerlo.FelugroVezerloA;


public class DolgozatMVC {

   
    public static void main(String[] args) {
      AutoModell modell = new AutoModell();
      
      FelugroNezetA nezet = new FelugroNezetA();
      new FelugroVezerloA(modell,nezet);
    }
    
}
