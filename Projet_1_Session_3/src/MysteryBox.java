import java.util.Random;
import java.util.Scanner;

public class MysteryBox extends Objet {

    public MysteryBox (){
        this.nom = "MysteryBox";
    }

    public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }

    public void utiliser (Vaisseau vaisseau){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int nB;
        nB = random.nextInt(5);
        int perte;
        perte = random.nextInt(21);
        int choix;
        if (nB == 0){
            System.out.println("Tu as percé ton réservoir d'essence en ouvrant la boîte tu perds : " + perte + " bidons d'essence" );
            vaisseau.setCarburant(vaisseau.getCarburant()-perte);
        }
        //conditions
        if (nB == 1){
            System.out.println("Vous trouvez un fruit étrange voulez-vous le manger?");
            System.out.println("1) Oui");
            System.out.println("2) Non");
            choix = unNombre(sc);
            if (choix == 1){
                System.out.println("Vous ne vous sentez très bien");
                System.out.println("Vous mangez votre bras et gagnez de la vie");
                vaisseau.setPointDeVie(vaisseau.getPointDeVie()+10);
                System.out.println("Vous avez désormais : " + vaisseau.getPointDeVie() + " points de vie");
            }
            if (choix == 2){
                System.out.println("Vous êtes mort");
                vaisseau.setPointDeVie(0);
            }
        }
        if (nB == 2){
            System.out.println("Vous trouvez un vaisseau");
            System.out.println("Vous récupérer un bidons de 20 gallons");
            if (vaisseau.getCarburant() <= 424)
                vaisseau.setCarburant(vaisseau.getCarburant()+76);
            if (424 < vaisseau.getCarburant())
                vaisseau.setCarburant(500);

        }

        if (nB == 3){
            System.out.println("Vous trouvez une clé spécial");
            System.out.println("Elle a de grande chance d'améliorer votre vaisseau, voulez-vous l'utilisez?");
            System.out.println("1) oui");
            System.out.println("2) non");
            choix = unNombre(sc);
            if (choix == 1){
                System.out.println("Vous tentez d'améliorer votre vaisseau");
                choix = random.nextInt(10);
                if (choix != 0)
                    System.out.println("Vous avez échoués");
                if (choix == 0){
                    System.out.println("Vous avez réussi");
                    System.out.println("Votre vaisseaux gagne +20 points de vie , +200 litres supplémentaire ainsi que votre réservoir est désormais remplis et votre vaisseau réparé");
                    vaisseau.setCarburant(700);
                    vaisseau.setPointDeVie(120);

                }
            }
        }
        if (nB == 4){
            System.out.println("Vous trouvez des pirates");
            System.out.println("Ils vous volent tous vos objets");
            vaisseau.Inventaire.clear();
        }

    }
}
