
package Vaisseau;

import dechets.Matiere;

import java.util.ArrayList;

/**
 * Created by BelSi1731422 on 2018-04-26.
 */
public class Leger extends Vaisseau {
    public Leger(ArrayList<Matiere> cargo, String nom , int maxCapacite) {
       this.cargo = new ArrayList<Matiere>();
        this.nom = "Leger";
        this.maxCapacite = 10;
    }
}
