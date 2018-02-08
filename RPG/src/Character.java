public abstract class Character {

     int defense;
     int pointdevie;
     String nom;
     boolean attaque;

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

     public boolean isAttaque() {
          return attaque;
     }

     public void setAttaque(boolean attaque) {
          this.attaque = attaque;
     }

     public abstract void attaque(Character personnageAttaque);
}
