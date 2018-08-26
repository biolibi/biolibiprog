import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        Vaisseau vaisseau = new Vaisseau();
        int nB;
        boolean Mort = false;
        while (Mort == false){
            if (vaisseau.getPointDeVie() <= 0)
                Mort = true;

            if (vaisseau.getCarburant() <= 0)
                Mort = true;
        System.out.println("Que voulez-vous faire?");
        System.out.println("1) Examiner le vaisseau");
        System.out.println("2) Explorer une planète");
        System.out.println("3) Utilisez un objet dans l'inventaire");
        System.out.println("4) Revenir en arrière");
        if (0 <vaisseau.getPointDeVie() && 0 < vaisseau.getCarburant()){
         nB = unNombre(sc);
        if (nB == 1)
            examiner(vaisseau);
        if (nB == 2)
            explorationPlanete(vaisseau);
        if (nB == 3)
            utiliser(vaisseau);
        if (nB == 4)
            revenirArrière(vaisseau);
        }
        }
    }
    public static void explorationPlanete (Vaisseau vaisseau){
    Random random = new Random();
    int chance = (random.nextInt(5));
    List listeDePlanete = new ArrayList();
    listeDePlanete.add(new Venus(vaisseau));
    listeDePlanete.add(new Mars(vaisseau));
    listeDePlanete.add(new Jupiter(vaisseau));
    listeDePlanete.add(new Pluton(vaisseau));
    listeDePlanete.add(new Terre(vaisseau));
    listeDePlanete.add(new Neptune(vaisseau));

    Planete vaisseauExplorer = (Planete) listeDePlanete.get(chance);
    vaisseau.setRevenirEnArrière(vaisseau.getPlaneteActuel());
    vaisseau.setPlaneteActuel(vaisseauExplorer.getNom());
    System.out.println("Vous explorer la planète: " + vaisseauExplorer.getNom());
    vaisseauExplorer.explorer(vaisseau);
}
    public static void examiner (Vaisseau vaisseau){
    System.out.println("Quantité d'essence : " + vaisseau.getCarburant());
    System.out.println("Points de vie : " + vaisseau.getPointDeVie());
    planeteActuel(vaisseau);
    System.out.println("Inventaire : ");
    if ( 1 <= vaisseau.Inventaire.size() ){
        for (int i =0; i < vaisseau.Inventaire.size();i++){
            Objet objet = (Objet)vaisseau.Inventaire.get(i);
            System.out.println(objet.nom);
        }
    }
}
    public static void utiliser(Vaisseau vaisseau){
        Scanner sc = new Scanner(System.in);
        int nB;
        System.out.println("Inventaire : ");
        if ( 1 <= vaisseau.Inventaire.size() ){
            for (int i =0; i < vaisseau.Inventaire.size();i++){
                Objet objet = (Objet)vaisseau.Inventaire.get(i);
                System.out.println("Objet numéro: " +i +" "+  objet.nom);
            }
        }
        System.out.println("Quel objet voulez-vous utlisez? (entrez le numéro)");
        nB = unNombre(sc);
        if (nB < vaisseau.Inventaire.size()){
            Objet objet = (Objet)vaisseau.Inventaire.get(nB);
            System.out.println("Vous allez utliser l'objet : " + objet.nom);
            System.out.println("1) Confirmer");
            System.out.println("2) Quitter");
            nB = unNombre(sc);
            if (nB == 1)
                objet.utiliser(vaisseau);
        }

    }
    public static void planeteActuel (Vaisseau vaisseau){
        System.out.println("Planète actuel: " + vaisseau.PlaneteActuel);
    }
    public static void revenirArrière (Vaisseau vaisseau){
        System.out.println("Vous êtes téléporter vers votre ancienne exploration");
        vaisseau.setPlaneteActuel(vaisseau.getRevenirEnArrière());
        System.out.println("Vous êtes désormais sur la planète: " + vaisseau.getPlaneteActuel());
        if (vaisseau.getPlaneteActuel() == null){
            System.out.println("Vous êtes perdu dans l'espace");
            System.out.println("Fin de la partie");
            vaisseau.setPointDeVie(0);
        }
    }

    public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }
}
