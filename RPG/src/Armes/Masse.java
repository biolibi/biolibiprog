package Armes;

import Personnage.Barbare;

public class Masse implements Contondant {
    int damage = 5;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int Contondant() {
        return damage;
    }

}
