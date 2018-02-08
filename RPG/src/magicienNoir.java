import java.util.Random;

public class magicienNoir extends magicien {

    Random mortsubitte = new Random();
    int empoisonnement = 0;
    Random sort = new Random();
    public magicienNoir (){
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
            System.out.println("Le magicien noir a utilisé empoissonnement. Il lui reste " + pointdemagie + " Point de magie");
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            if (personnageAttaque.getPointdevie() <= 0){
                personnageAttaque.attaque = true;
            }

        }
        if (sortrandom == 1 && 10 <= pointdemagie ){
            int mortOuNon = 0;
            mortOuNon = mortsubitte.nextInt(10);
            if (mortOuNon == 0){
            personnageAttaque.setPointdevie(0);
            System.out.println("Le magicien noir a utilisé mort subite. Il lui reste " + pointdemagie + " Point de magie");
            System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
            }
            if (mortOuNon != 0){
                System.out.println("Le magicien noir a utilisé mort subite. Il lui reste " + pointdemagie + " Point de magie");
                System.out.println("Il reste " + personnageAttaque.getPointdevie() + " point de vie"+ " à " + personnageAttaque.getNom());
                personnageAttaque.attaque = false;
            }
        }
        else if (pointdemagie < 2){
            System.out.println("Le magicien noir n'a pas pu lancer de sort");
        }

    }
}

