/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
 Contribution de la part de léa Netto
 */

package bandeau;

/**
 *
 * @author seck
 */
public abstract class Effet {
    String texte;
    
    Effet(String t){
        texte=t;
    }
    abstract void afficheToiSur(Bandeau b);
}
