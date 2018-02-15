import Armes.*;
import Personnage.*;
import Personnage.character;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        int joueurquiattaque = 0;
        int joueurattaquer = 1;
        int entredeux;
        character Joueur[] = new character[2];
        boolean perdant = true;
        int arme = 0;
        Contondant ArmeContondant[] = new Contondant[2];
        Tranchant ArmeTranchante[] = new Tranchant[2];
        Magique ArmeMagique[] = new Magique[2];

        Scanner sc = new Scanner(System.in);

        System.out.println("RPG simulator");
        for (int i = 0; i <= 1;i++){
            arme = 0;
            System.out.println("Joueur " + i +" , quel personnage voulez-vous avoir?");
            System.out.println("1) Magicien noir");
            System.out.println("2) Magicien rouge");
            System.out.println("3) Paladin");
            System.out.println("4) Barbare");
            choix = sc.nextInt();
            if (choix == 1){
                Joueur[i] = new MagicienNoir();
                System.out.println("Quel arme voulez-vous?");
                System.out.println("1) Masamune\n2) Sceptre\n3) Épée Magique \n4) Baguette" );
                arme = sc.nextInt();
                if (arme == 1){ ArmeMagique[i] = new Masamune(); } if (arme == 2){ ArmeMagique[i] = new Sceptre(); } if (arme == 3){ ArmeMagique[i] = new ÉpéeMagique(); } if (arme == 4){ ArmeMagique[i] = new Baguette(); }
                Joueur[i].setWeapon(ArmeMagique[i].Magique());
            }
            if (choix == 2){
                Joueur[i] = new MagicienRouge();
                System.out.println("Quel arme voulez-vous?");
                System.out.println("1) Masamune\n2) Sceptre\n3) Épée Magique \n4) Baguette" );
                arme = sc.nextInt();
                if (arme == 1){ ArmeMagique[i] = new Masamune(); } if (arme == 2){ ArmeMagique[i] = new Sceptre(); } if (arme == 3){ ArmeMagique[i] = new ÉpéeMagique(); } if (arme == 4){ ArmeMagique[i] = new Baguette(); }
                Joueur[i].setWeapon(ArmeMagique[i].Magique());
            }
            if (choix == 3){
                Joueur[i] = new Paladin();
                System.out.println("Quel arme voulez-vous?");
                System.out.println("1) Épée\n2) ÉpéeLourde\n3) Épée Magique \n4) Masamune" );
                arme = sc.nextInt();
                if (arme == 1){ ArmeTranchante[i] = new Épée(); } if (arme == 2){ ArmeTranchante[i] = new ÉpéeLourde(); } if (arme == 3){ ArmeTranchante[i] = new ÉpéeMagique(); } if (arme == 4){ ArmeTranchante[i] = new Masamune(); }
                Joueur[i].setWeapon(ArmeTranchante[i].Tranchant());
            }
            if (choix == 4){
                Joueur[i] = new Barbare();
                System.out.println("Quel arme voulez-vous?");
                System.out.println("1) Masse\n2) ÉpéeLourde\n3) Sceptre \n4) Masamune" );
                arme = sc.nextInt();
                if (arme == 1){ ArmeContondant[i] = new Masse(); } if (arme == 2){ ArmeContondant[i] = new ÉpéeLourde(); } if (arme == 3){ ArmeContondant[i] = new Sceptre(); } if (arme == 4){ ArmeContondant[i] = new Masamune(); }
                Joueur[i].setWeapon(ArmeContondant[i].Contondant());
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

