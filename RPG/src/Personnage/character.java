package Personnage;

public abstract class character {

     int defense;
     int pointdevie;
     String nom;
     public boolean attaque;
     int weapon;

     public void setWeapon(int weapon) { this.weapon = weapon; }

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

     public abstract void attaque(character personnageAttaque);
}
