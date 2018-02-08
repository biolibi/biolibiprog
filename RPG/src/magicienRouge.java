import java.util.Random;

public class magicienRouge extends magicien {

    Random sort = new Random();
    public  magicienRouge (){
        this.defense = 1;
        this.pointdevie = 60;
        this.nom = "Magicien rouge";
        this.attaque = true;
        this.pointdemagie = 40 ;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPointdemagie() {
        return pointdemagie;
    }

    public void setPointdemagie(int pointdemagie) {
        this.pointdemagie = pointdemagie;
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  void attaque (Character personnageAttaque){

        int sortrandom = 0;
        sortrandom = sort.nextInt(2);

        if (sortrandom == 0 && 5 <= pointdemagie ){
            pointdemagie = pointdemagie-5;
            personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-5);
            System.out.println("Le magicien rouge a utilisé boule de feu. Il lui reste " + pointdemagie + " point de magie" );
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){
                personnageAttaque.attaque = true;
            }
        }

        if (sortrandom == 1 && 5 <= pointdemagie ){
            personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-((7)-personnageAttaque.getDefense()));
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){
                personnageAttaque.attaque = true;
            }
        }
        else if (pointdemagie < 5){
            System.out.println("Le magicien rouge n'a pas pu lancer de sort");
        }
    }



}
