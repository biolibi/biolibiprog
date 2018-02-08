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

    public void setDefense(int defense) {
        this.defense = defense;
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

    public void setForce (int force) {
        this.force = force;
    }

    public int getForce () {
        return force;
    }

    public  void setAttaque(boolean attaque){ this.attaque = attaque; }

    public int getAttaque(){return  force; }

    public  void attaque (Character personnageAttaque){
        personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-((2*force)-personnageAttaque.getDefense()));
        System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
        if (personnageAttaque.getPointdevie() < 1){
            personnageAttaque.attaque = true;
        }
    }



}
