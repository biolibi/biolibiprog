package Personnage;

public class Paladin extends Guerrier {




    public Paladin(){
        this.force = 5;
        this.defense = 5;
        this.pointdevie = 80;
        this.nom = "Paladin";
        this.attaque = true;
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
        personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-((2*(force+weapon))-personnageAttaque.getDefense()));
        System.out.println("Le paladin attaque");
        System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
        if (personnageAttaque.getPointdevie() < 1){
            personnageAttaque.attaque = true;
        }
    }



}
