/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author seck
 */
public class Scenario {
    
    List<Effet> listeEffets= new LinkedList<>();
    List<Integer> listeRepetitions=new LinkedList<>();
    
    public void addEffect(Effet e, Integer nbrep){
        listeEffets.add(e);
        listeRepetitions.add(nbrep);
    }
    
    public void playOn(Bandeau b){
        for(int i=0; i<listeEffets.size() ;i++){
            for(int j=0;j<listeRepetitions.get(i);j++){
                listeEffets.get(i).afficheToiSur(b);
            }
        }
    }
}
