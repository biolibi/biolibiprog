package Vaisseau;
import Centre.CentreDeTri;
import dechets.*;
import planetes.Planete;




import java.util.*;


/**
 * Created by BelSi1731422 on 2018-04-26.
 */
public abstract class Vaisseau {
    protected ArrayList<Matiere> cargo;
    protected String nom;
    protected int maxCapacite;


    public void depot (Vaisseau vaisseau , CentreDeTri centreDeTri)
    {
        triAvantLeDépot(vaisseau);

        for(int i=0;i< vaisseau.maxCapacite ;i++){
            if (vaisseau.cargo.get(i) instanceof Gadolinium);{
                if (centreDeTri.getQuantitéMinGado() < centreDeTri.getQuantitéMaxGado()){
                    centreDeTri.setQuantitéMinGado(centreDeTri.getQuantitéMinGado()+1);
                }
                else if (centreDeTri.getQuantitéMinGado() == centreDeTri.getQuantitéMaxGado()){
                    recycler(centreDeTri , centreDeTri.getQuantitéMaxGado());
                }
            }

            if (vaisseau.cargo.get(i) instanceof Neptunium);{

                if (centreDeTri.getQuantitéMinNeptu() < centreDeTri.getQuantitéMaxNeptu()){
                    centreDeTri.setQuantitéMinNeptu(centreDeTri.getQuantitéMinNeptu()+1);
                }
                else if (centreDeTri.getQuantitéMinNeptu() == centreDeTri.getQuantitéMaxNeptu()){
                    recycler(centreDeTri,centreDeTri.getQuantitéMaxNeptu());
                }

            }

            if (vaisseau.cargo.get(i) instanceof Plutonium);{
                if (centreDeTri.getQuantitéMinPluto() < centreDeTri.getQuantitéMaxPluto()){
                    centreDeTri.setQuantitéMinPluto(centreDeTri.getQuantitéMinPluto()+1);
                }
                else if (centreDeTri.getQuantitéMinPluto() == centreDeTri.getQuantitéMaxPluto()){
                    recycler(centreDeTri,centreDeTri.getQuantitéMaxPluto());
                }
            }

            if (vaisseau.cargo.get(i) instanceof Terbium);{
                if (centreDeTri.getQuantitéMinTher() < centreDeTri.getQuantitéMaxTher()){
                    centreDeTri.setQuantitéMinTher(centreDeTri.getQuantitéMinTher()+1);
                }
                if (centreDeTri.getQuantitéMinTher() == centreDeTri.getQuantitéMaxTher()){
                    recycler(centreDeTri,centreDeTri.getQuantitéMaxTher());
                }
            }

            if (vaisseau.cargo.get(i) instanceof Thulium);{
                if (centreDeTri.getQuantitéMinThul() < centreDeTri.getQuantitéMaxThul()){
                    centreDeTri.setQuantitéMinThul(centreDeTri.getQuantitéMinThul()+1);
                }
                if (centreDeTri.getQuantitéMinThul() == centreDeTri.getQuantitéMaxThul()){
                    recycler(centreDeTri,centreDeTri.getQuantitéMaxThul());
                }
            }
        }

    }

    //À terminé (pas sur de comprendre)
    public static void recycler (CentreDeTri centreDeTri , Integer matiere){
        if (centreDeTri.getQuantitéMaxPluto() == matiere){
            centreDeTri.setQuantitéMinPluto(550);
        }
        if (centreDeTri.getQuantitéMaxNeptu() == matiere){

        }
        if (centreDeTri.getQuantitéMaxGado() == matiere){

        }
        if (centreDeTri.getQuantitéMaxTher() == matiere){

        }
        if (centreDeTri.getQuantitéMaxThul() == matiere){

        }
    }


    public void remplir(Vaisseau vaisseau, Planete planete){
        Random choix = new Random();
        int chanceGalo = planete.getNbganolinium();
        int chanceNept = planete.getNbNeptunium();
        int chancePlut = planete.getNbPlutonium();
        int chanceTerb = planete.getNbTerbium();
        int index;

        for (int i =0; i< vaisseau.maxCapacite;i++){
            index = choix.nextInt(100);
            if (index < chanceGalo){
                vaisseau.cargo.add(new Gadolinium());
            }
            else if (index >= chanceGalo && index < (chanceGalo+chanceNept)){
                vaisseau.cargo.add(new Neptunium());
            }
            else if (index >= (chanceGalo+chanceNept) && index < (chanceGalo+chanceNept+chancePlut)){
                vaisseau.cargo.add(new Plutonium());
            }
            else if (index >= (chanceGalo+chanceNept+chancePlut) && index < (chanceGalo+chanceNept+chancePlut+chanceTerb)){
                vaisseau.cargo.add(new Terbium());
            }
            else if (index >= (chanceGalo+chanceNept+chancePlut+chanceTerb) && index <100){
                vaisseau.cargo.add(new Thulium());
            }
        }
    }
    // ????????
    public static void transfertDeMatiere (Vaisseau vaisseauDispo , Matiere matiere){
     if (vaisseauDispo.cargo.size() == 0)  {
         for (int i =0; i<= vaisseauDispo.maxCapacite;i++){

         }
     }
    }

    //TRI Des ressources avant le dépot
    public static void triAvantLeDépot(Vaisseau vaisseau )
    {
        int elementNonTrié[] = new int[vaisseau.maxCapacite];
        for (int i=0; i <vaisseau.maxCapacite;i++){
            if (vaisseau.cargo.get(i) instanceof Gadolinium);{
                elementNonTrié[i] = new Gadolinium().getMasseVolumique();
            }
            if (vaisseau.cargo.get(i) instanceof Plutonium);{
                elementNonTrié[i] = new Plutonium().getMasseVolumique();
            }
            if (vaisseau.cargo.get(i) instanceof Neptunium);{
                elementNonTrié[i] = new Neptunium().getMasseVolumique();
            }
            if (vaisseau.cargo.get(i) instanceof Thulium);{
                elementNonTrié[i] = new Thulium().getMasseVolumique();
            }
            if (vaisseau.cargo.get(i) instanceof Terbium);{
                elementNonTrié[i] = new Terbium().getMasseVolumique();
            }
        }
        int N = elementNonTrié.length;
        if (N == 0)
            return;
        int max = elementNonTrié[0], min = elementNonTrié[0];
        for (int i = 1; i < N; i++)
        {
            if (elementNonTrié[i] > max){
                max = elementNonTrié[i];
            }
            if (elementNonTrié[i] < min){
                min = elementNonTrié[i];
            }

        }
        int écart = max - min + 1;

        int[] count = new int[écart];

        for (int i = 0; i < N; i++){
            count[elementNonTrié[i] - min]++;
        }


        for (int i = 1; i < écart; i++){
            count[i] += count[i - 1];
        }

        int j = 0;

        for (int i = 0; i < écart; i++){
            while (j < count[i])
                elementNonTrié[j++] = i + min;
        }

        for (int i = 0; i <vaisseau.maxCapacite;i++){
            if (elementNonTrié[i] == new Gadolinium().getMasseVolumique() )
                vaisseau.cargo.set(i,new Gadolinium());

            if (elementNonTrié[i] == new Plutonium().getMasseVolumique())
                vaisseau.cargo.set(i,new Plutonium());

            if (elementNonTrié[i] == new Neptunium().getMasseVolumique())
                vaisseau.cargo.set(i,new Neptunium());

            if (elementNonTrié[i] == new Terbium().getMasseVolumique())
                vaisseau.cargo.set(i,new Terbium());

            if (elementNonTrié[i] == new Thulium().getMasseVolumique())
                vaisseau.cargo.set(i, new Thulium());
        }

    }



}

