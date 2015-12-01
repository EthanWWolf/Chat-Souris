/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatSouris.Modele;

/**
 *
 * @author w.monnet
 */
public class Niveau extends Jeux{
    private final int nombreFlecheDroite;
    private final int nombreFlecheGauche;
    private final int nombreFlecheBas;
    private final int nombreFlecheHaut;

    
    public Niveau (int nbFD, int nbFG, int nbFB, int nbFH){
        nombreFlecheDroite = nbFD;
        nombreFlecheGauche = nbFG;
        nombreFlecheBas = nbFB;
        nombreFlecheHaut = nbFH;
    }
    
    public int getNombreFlecheDroite() {
        return nombreFlecheDroite;
    }

    public int getNombreFlecheGauche() {
        return nombreFlecheGauche;
    }

    public int getNombreFlecheBas() {
        return nombreFlecheBas;
    }

    public int getNombreFlecheHaut() {
        return nombreFlecheHaut;
    }
     
    public void supprimerFleche(){
        
    }
    
    public void ajouterFleche(){
        
    }
}
