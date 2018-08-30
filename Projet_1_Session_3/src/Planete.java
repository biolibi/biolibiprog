
import java.lang.reflect.Field;
import java.util.Random;


public class Planete implements Cloneable {

    protected String nom;
    Random random = new Random();
    protected int chance;
    protected int nB;

    public String getNom() {
        return nom;
    }

    private static Object ClonerUnObjet(Vaisseau vaisseau){
        try{
            Object clone = vaisseau.getClass().newInstance();
            for (Field field : vaisseau.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                field.set(clone, field.get(vaisseau));
            }
            vaisseau.retour.add((Vaisseau) clone);
            return clone;
        }catch(Exception e){
            return null;
        }
    }

    public void explorer (Vaisseau vaisseau){
        java.lang.String bleu = (char)27 + "[34m";
        java.lang.String noir = (char)27 + "[30m";
        //Retour
        ClonerUnObjet(vaisseau);


        //Essence
        chance = random.nextInt(100);
        System.out.println("Vous avez dépensé " + chance + " bidon d'essence");
        vaisseau.setCarburant((vaisseau.getCarburant()-chance));
        //Pirate
        if (random.nextInt(10)< 3){
            System.out.println("Vous avez été attaquer par des pirates");
            chance = random.nextInt(40);
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
                System.out.println(bleu+"MysteryBox"+noir);
            }
            if (nB == 1){
                vaisseau.Inventaire.add(new Télécommande());
                System.out.println(bleu+"Télécommande"+noir);
            }
            if (nB == 2){
                vaisseau.Inventaire.add(new Sac());
                System.out.println(bleu+"Sac"+noir);
            }
            if (nB == 3) {
                vaisseau.Inventaire.add(new Crayon());
                System.out.println(bleu+"Crayon"+noir);
            }
            if (nB == 4){
                vaisseau.Inventaire.add(new Nukacola());
                System.out.println(bleu+"Nukacola"+noir);
            }

        }



    }


}
