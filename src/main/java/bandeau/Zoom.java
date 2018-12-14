/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author seck
 */
public class Zoom extends Effet {

    int coefficient;
    
    Zoom(int coef, String texte){
        super(texte);
        this.coefficient=coef;
    }
    
    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        b.sleep(500);
        Font oldFont=b.getFont();
        int a= oldFont.getSize();      
        for (int i = a; i <a*coefficient ; i+=2) {
            Font newFont = oldFont.deriveFont((float)i);
            b.setFont(newFont);
		b.sleep(100);
            b.setFont(oldFont);    
	}
    }
    
    
}

