package vaisseau;

import java.util.ArrayList;

/**
 * Created by BelSi1731422 on 2018-04-26.
 */
public class Leger extends Vaisseau {
    public Leger() {
        this.cargo = new ArrayList<>();
        this.nom = "Leger";
        this.maxCapacite = 10;
    }
}
