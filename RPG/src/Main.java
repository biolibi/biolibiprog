import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        int joueurquiattaque = 0;
        int joueurattaquer = 1;
        int entredeux;
        Character Joueur[] = new Character[2];
        boolean perdant = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("RPG simulator");
        for (int i = 0; i <= 1;i++){

            System.out.println("Joueur " + i +" , quel personnage voulez-vous avoir?");
            System.out.println("1) Magicien noir");
            System.out.println("2) Magicien rouge");
            System.out.println("3) Paladin");
            System.out.println("4) Barbare");
            choix = sc.nextInt();
            if (choix == 1){
                Joueur[i] = new MagicienNoir();
            }
            if (choix == 2){
                Joueur[i] = new MagicienRouge();
            }
            if (choix == 3){
                Joueur[i] = new Paladin();
            }
            if (choix == 4){
                Joueur[i] = new Barbare();
            }
        }

        while (perdant == true  ){
        Joueur[joueurquiattaque].attaque(Joueur[joueurattaquer]);
        if (Joueur[joueurattaquer].getPointdevie() < 1){
            perdant = false;
            System.out.println(Joueur[joueurattaquer].getNom() + joueurattaquer  +  " a perdu");
        }
        if (Joueur[joueurattaquer] instanceof Magicien && Joueur[joueurquiattaque] instanceof Magicien){
            if (Joueur[joueurattaquer].attaque == false && Joueur[joueurquiattaque].attaque == false){
                System.out.println("Il y a égalité");
                perdant = false;
            }
        }
            entredeux = joueurattaquer ;
            joueurattaquer = joueurquiattaque;
            joueurquiattaque = entredeux;
        }
    sc.close();
    }
}

