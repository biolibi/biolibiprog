public class Nukacola extends Objet {

    public Nukacola (){
        this.nom = "Nukacola";
    }
    public void utiliser (Vaisseau vaisseau) {
            System.out.println("Tu deviens radioactif et récupère 20 points de vie");
            vaisseau.setPointDeVie(vaisseau.getPointDeVie()+20);
            System.out.println("Tu as maintenant : " + vaisseau.getPointDeVie() + " points de vie");
    }
}
