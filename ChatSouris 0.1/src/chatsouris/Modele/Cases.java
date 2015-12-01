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
public class Cases extends Niveau{

    private final int [][] level;
    
    public Cases(int nbFD, int nbFG, int nbFB, int nbFH, int n, int p) {
        super(nbFD, nbFG, nbFB, nbFH);
        level = new int[n][p];
    }

    
}
