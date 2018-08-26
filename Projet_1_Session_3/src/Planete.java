import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Planete {

    protected String nom;
    Random random = new Random();
    int chance;
    int nB;

    public String getNom() {
        return nom;
    }

    public void explorer (Vaisseau vaisseau){
        //Essence
        chance = random.nextInt(100);
        System.out.println("Vous avez dépensé " + chance + " bidon d'essence");
        vaisseau.setCarburant((vaisseau.getCarburant()-chance));
        //Pirate
        if (random.nextInt(10)< 3){
            System.out.println("Vous avez été attaquer par des pirates");
            chance = random.nextInt(20);
            System.out.println("Vous avez perdu : " + chance + " vie");
            vaisseau.setPointDeVie((vaisseau.getPointDeVie()-chance));
        }
        //Objet
        chance = random.nextInt(5);
        System.out.println("Lors de l'exploration vous avez trouvé : " + chance + " objets");
        for (int i = 0; i< chance ; i++){
            nB = random.nextInt(5);
            if (nB == 0){
                vaisseau.Inventaire.add(new MysteryBox());
                System.out.println("MysteryBox");
            }
            if (nB == 1){
                vaisseau.Inventaire.add(new Télécommande());
                System.out.println("Télécommande");
            }
            if (nB == 2){
                vaisseau.Inventaire.add(new Sac());
                System.out.println("Sac");
            }
            if (nB == 3) {
                vaisseau.Inventaire.add(new Crayon());
                System.out.println("Crayon");
            }
            if (nB == 4){
                vaisseau.Inventaire.add(new Nukacola());
                System.out.println("Nukacola");
            }

        }



    }


}
