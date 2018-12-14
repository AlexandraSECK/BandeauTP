/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author seck
 */
public class main {
    
     public static void main(String[] args) {
	 Bandeau monBandeau = new Bandeau();
         Scenario s = new Scenario();
         s.addEffect(new ChangerDePolice("Monospaced","BOLD",20,"Changement de Police"),1);
         s.addEffect(new Zoom(2,"Zoom x2"),2);
         s.addEffect(new ChangerDeCouleur("Changement de couleur"),5);
         s.addEffect(new Tourner("On tourne maintenant", 1, 90),1);
         s.playOn(monBandeau);

         

    }
}

