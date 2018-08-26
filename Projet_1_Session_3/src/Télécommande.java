import java.util.Random;
import java.util.Scanner;

public class Télécommande extends Objet {
    public Télécommande (){
        this.nom = "Télécommande";
    }
    public void utiliser(Vaisseau vaisseau){
        System.out.println("Vous commander un vaisseau de pirate pour vous abordez");
        Random random = new Random();
        int nB;
        System.out.println("Ils vous proposent deux solutions:");
        System.out.println("1)...");
        System.out.println("2)...");
        nB = random.nextInt(1);
        System.out.println("Vous ne comprenez pas les deux choix et choissisez l'un aléatoire");
        System.out.println("Vous avez choisis: " + (nB+1));
        if (nB == 0){
            System.out.println("Les pirates décide de vous donner deux MysteryBox ainsi que +20 points de vie");
            vaisseau.Inventaire.add(new MysteryBox());
            vaisseau.Inventaire.add(new MysteryBox());
            vaisseau.setPointDeVie(vaisseau.getPointDeVie()+20);
        }
        if (nB == 1){
            System.out.println("Vous perdez 50 points de vie, il y avait un piège");
        }

    }
}
