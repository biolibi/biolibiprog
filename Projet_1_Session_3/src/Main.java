import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        Vaisseau vaisseau = new Vaisseau();
        int nB;
        explorationPlanete(vaisseau);
        System.out.println("Que voulez-vous faire?");
        System.out.println("1) Examiner le vaisseau");
         nB = unNombre(sc);
        if (nB == 1)
            examiner(vaisseau);


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
    System.out.println("Vous explorer la planète: " + vaisseauExplorer.getNom());
    vaisseauExplorer.explorer(vaisseau);
}
public static void examiner (Vaisseau vaisseau){
    System.out.println("Quantité d'essence : " + vaisseau.getCarburant());
    System.out.println("Points de vie : " + vaisseau.getPointDeVie());
    System.out.println("Inventaire : ");
    if ( 1 <= vaisseau.Inventaire.size() ){
        for (int i =0; i < vaisseau.Inventaire.size();i++){
            Objet objet = (Objet)vaisseau.Inventaire.get(i);
            System.out.println(objet.nom);
        }
    }
}
    public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }
}
