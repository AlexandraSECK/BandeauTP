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
public class Tourner extends Effet{
    int sens;
    int angle;
    Tourner(String texte, int sens, int angle){
         super(texte);
         //-1 : à l'envers
         //1: a l'endroit
         this.sens=sens;
         this.angle=angle;
    }
    
    @Override
    void afficheToiSur(Bandeau b) {
        double angleR=Math.toRadians((double)angle);
       b.setMessage("On tourne");
	for (int i = 0; i <= 75; i++) {
                System.out.println(angleR);
		b.setRotation(sens*i*angleR/75);
                
		b.sleep(50);
	}
        
    }
    
    
}
