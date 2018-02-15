package Armes;

public class Masamune implements Contondant , Tranchant , Magique {


    public int Magique() {
        int damage = 6;
        return damage;
    }

    public int Contondant() {
        int damage = 5;
        return damage;
    }

    public int Tranchant() {
        int damage = 6;
        return damage;
    }
}
