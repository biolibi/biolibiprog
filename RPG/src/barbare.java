public class barbare extends guerrier {


    public barbare (){
        this.force = 10;
        this.defense = 3;
        this.pointdevie = 100;
        this.nom = "Barbare";
        this.attaque = true;
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
