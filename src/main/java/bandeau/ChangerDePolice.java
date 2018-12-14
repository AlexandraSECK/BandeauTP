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
public class ChangerDePolice extends Effet {
    String newFont;
    String style;
    int taille;
    Font f;
    
    ChangerDePolice(String font, String style,int taille,String texte){
        super(texte);
        this.newFont=font;
        this.style=style;
        this.taille=taille;
        switch(this.style){
            case "BOLD":
              f=new Font(newFont, Font.BOLD, taille);
              break;
            case "ITALIC":
              f=new Font(newFont, Font.ITALIC, taille);
            break;
            default:
              f=new Font(newFont, Font.BOLD, taille);
              break;
        }
    }    
    
    @Override
    void afficheToiSur(Bandeau b) {
        b.setMessage(texte);
        b.sleep(2000);
        b.setFont(f);
        b.sleep(1000);
    }
    
   //Creer scenario
   //scenario.addEffect (new Nomdeleffet("texte",paramètre),nbrepetion).
   //creer lebandeau
    //s.playlescenario(lebandeau)
}
