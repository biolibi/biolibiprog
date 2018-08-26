public class Sac extends Objet {
    public Sac (){
        this.nom = "Sac";
    }
    public void utiliser (Vaisseau vaisseau){
        System.out.println("Tu utilise le sac à dos pour récuperer tes déchets. Tu as désormais une poubelle!");
    }
}
