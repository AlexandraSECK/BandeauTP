/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author erwalind
 */
public class Tourner extends Effet {
    int angle;
    int sens; //1 pour sens aiguilles d'une montre; -1 pour l'inverse
    
    public Tourner(String texte, int a, int s){
        super(texte);
        this.angle = a;
        this.sens = s;
        
    }

    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        b.sleep(500);
        
        double a1 = Math.toRadians((double)angle);
        
                
        for (int i = 0; i <= 100; i++) {
		b.setRotation(a1*i*sens/100);
		b.sleep(10);
	}
    }
}
