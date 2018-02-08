import java.util.Random;

public class MagicienNoir extends Magicien {

    Random mortsubitte = new Random();
    int empoisonnement = 0;
    Random sort = new Random();
    public MagicienNoir(){
        this.defense = 1;
        this.pointdevie = 60;
        this.nom = "MagicienNoir";
        this.attaque = true;
        this.pointdemagie = 50;
    }

    public int getPointdemagie() {
        return pointdemagie;
    }

    public void setPointdemagie(int pointdemagie) {
        this.pointdemagie = pointdemagie;
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

    public  void attaque (Character personnageAttaque){
        int sortrandom = 0;
        sortrandom = sort.nextInt(2);

        if (sortrandom == 0 && 2 <= pointdemagie ){
            empoisonnement = empoisonnement+2;
            pointdemagie = pointdemagie-2;
            personnageAttaque.setPointdevie(personnageAttaque.getPointdevie()-(empoisonnement));
            System.out.println("Le Magicien noir a utilisé empoissonnement. Il lui reste " + pointdemagie + " Point de magie");
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){

            }

        }
        if (sortrandom == 1 && 10 <= pointdemagie ){
            int mortOuNon = 0;
            pointdemagie = pointdemagie-10;
            mortOuNon = mortsubitte.nextInt(10);
            if (mortOuNon == 0){
            personnageAttaque.setPointdevie(0);
            System.out.println("Le Magicien noir a utilisé mort subite. Il lui reste " + pointdemagie + " Point de magie");
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            }
            if (mortOuNon != 0){
                System.out.println("Le Magicien noir a utilisé mort subite. Il lui reste " + pointdemagie + " Point de magie");
                System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());

            }
        }
        else if (pointdemagie < 2){
            System.out.println("Le Magicien noir n'a pas pu lancer de Sort");
            personnageAttaque.attaque = false;
        }

    }
}

