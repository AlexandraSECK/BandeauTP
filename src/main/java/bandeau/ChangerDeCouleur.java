/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Classe Léa
 */
package bandeau;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author seck
 */
public class ChangerDeCouleur extends Effet{
    
    ChangerDeCouleur(String texte){
        super(texte);
    }

    @Override
    void afficheToiSur(Bandeau ba) {
                ba.setMessage(texte);

        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        Color c= new Color(r, g, b);
        ba.setForeground(c);
        ba.sleep(500);

    }
    
    
    
    
}
