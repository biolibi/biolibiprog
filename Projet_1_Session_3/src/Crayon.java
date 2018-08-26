public class Crayon extends Objet {
    public Crayon (){
        this.nom = "Crayon";
    }
    public void utiliser (Vaisseau vaisseau){
        System.out.println("Vous dessinez un nouveau plan de vaisseau");
        System.out.println("Vous avez augmenter l'armure et gagner 35 points de vie");
        vaisseau.setPointDeVie(vaisseau.getPointDeVie()+35);
    }
}
