
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String a[]){
    Vaisseau vaisseau = new Vaisseau();
        simulation(vaisseau);
    }

    public static void simulation (Vaisseau vaisseau){
        java.lang.String brillant = (char)27 + "[1m";
        java.lang.String noir = (char)27 + "[30m";
        Scanner sc = new Scanner(System.in);
        int nB;
        boolean Mort = false;

        while (Mort == false){
            if (vaisseau.getPointDeVie() <= 0)
                Mort = true;

            if (vaisseau.getCarburant() <= 0)
                Mort = true;
            System.out.println(brillant+"Que voulez-vous faire?");
            System.out.println("1) Examiner le vaisseau");
            System.out.println("2) Explorer une planète");
            System.out.println("3) Utilisez un objet dans l'inventaire");
            System.out.println("4) Revenir en arrière"+noir);
            if (0 <vaisseau.getPointDeVie() && 0 < vaisseau.getCarburant()){
                nB = unNombre(sc);
                if (nB == 1)
                    examiner(vaisseau);
                if (nB == 2)
                    explorationPlanete(vaisseau);
                if (nB == 3)
                    utiliser(vaisseau);
                if (nB == 4){
                    revenirArrière(vaisseau);
                }
            }
        }
    }

    public static void explorationPlanete (Vaisseau vaisseau){
        java.lang.String rouge = (char)27 + "[31m";
        java.lang.String noir = (char)27 + "[30m";
    Random random = new Random();
    int chance = (random.nextInt(6));
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
    System.out.println(rouge+"Vous explorer la planète: " + vaisseauExplorer.getNom()+noir);
    vaisseauExplorer.explorer(vaisseau);
}
    public static void examiner (Vaisseau vaisseau){
        java.lang.String brillant = (char)27 + "[1m";
        java.lang.String rouge = (char)27 + "[31m";
        java.lang.String teal = (char)27 + "[35m";
        java.lang.String vert = (char)27 + "[32m";
        java.lang.String noir = (char)27 + "[30m";
    System.out.println(vert+"Quantité d'essence : " + vaisseau.getCarburant());
    System.out.println(teal+"Points de vie : " + vaisseau.getPointDeVie()+noir);
    planeteActuel(vaisseau);
    System.out.println(rouge+"Inventaire : ");
    if ( 1 <= vaisseau.Inventaire.size() ){
        for (int i =0; i < vaisseau.Inventaire.size();i++){
            Objet objet = (Objet)vaisseau.Inventaire.get(i);
            System.out.println(brillant+objet.nom+noir);
        }
    }
}
    public static void utiliser(Vaisseau vaisseau){
        Scanner sc = new Scanner(System.in);
        int nB;
        int choix;
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
            choix = unNombre(sc);
            if (choix == 1){
                objet.utiliser(vaisseau);
                vaisseau.Inventaire.remove(nB);
            }

        } }

        public static int unNombre(Scanner sc){
        while (!sc.hasNextInt()){
            System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
        }
        return sc.nextInt();
    }







        public  static void revenirArrière (Vaisseau vaisseau){

            if (0 < vaisseau.retour.size() ){
                Vaisseau tempo;
                ArrayList inventaire = new ArrayList();
                tempo= vaisseau.retour.get(vaisseau.retour.size()-1);
                vaisseau.retour.remove(vaisseau.retour.size()-1);
                vaisseau.setPointDeVie(tempo.getPointDeVie());
                vaisseau.setCarburant(tempo.getCarburant());
                vaisseau.getInventaire().clear();
                vaisseau.setPlaneteActuel(tempo.getRevenirEnArrière());

                System.out.println("Vous êtes téléporter vers votre ancienne exploration et laisser derrière vous tous vos objets");
                vaisseau.setPlaneteActuel(vaisseau.getRevenirEnArrière());
                System.out.println("Vous êtes désormais sur la planète: " + vaisseau.getPlaneteActuel());

            }

            else  {
                System.out.println("Vous êtes perdu dans l'espace");
                System.out.println("Fin de la partie");
                System.exit(0);
            }

        }



        public static void planeteActuel (Vaisseau vaisseau){
        System.out.println("Planète actuel: " + vaisseau.PlaneteActuel);
        }


}
