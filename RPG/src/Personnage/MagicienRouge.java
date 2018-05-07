package Personnage;

import Sort.BouleDeFeu;

import java.util.Random;

public class MagicienRouge extends Magicien {

    Random sort = new Random();
    public MagicienRouge(){
        this.defense = 1;
        this.pointdevie = 60;
        this.nom = "Magicien rouge";
        this.attaque = true;
        this.pointdemagie = 40 ;
    }


    public int getDefense() {
        return defense;
    }

    public int getPointdevie() {
        return pointdevie;
    }

    public void setPointdevie(int pointdevie) {
        this.pointdevie = pointdevie;
    }

    public String getNom() {
        return nom;
    }

    public  void attaque (character personnageAttaque){

        int sortrandom = 0;
        sortrandom = sort.nextInt(2);

        if (sortrandom == 0 && 5 <= pointdemagie ){
            pointdemagie = pointdemagie-5;
            personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-(5+weapon));
            System.out.println("Le Magicien rouge a utilisé boule de feu. Il lui reste " + pointdemagie + " point de magie" );
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){

            }
        }
        if (sortrandom == 1 && 5 <= pointdemagie ){
            pointdemagie = pointdemagie-5;
            personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-((7+weapon)-personnageAttaque.getDefense()));
            System.out.println("Le Magicien rouge a utilisé pic de glace. Il lui reste " + pointdemagie + " point de magie" );
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){

            }
        }
        else if (pointdemagie < 5){
            System.out.println("Le Personnage.Magicien rouge n'a pas pu lancer de Sort.Sort");
            personnageAttaque.attaque = false;
        }
    }



}
