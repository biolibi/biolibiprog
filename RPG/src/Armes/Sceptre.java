package Armes;

public class Sceptre implements Magique , Contondant {

    @Override
    public int Contondant() {
        int damage = 3;
        return damage;
    }

    @Override
    public int Magique() {
        int damage =6;
        return damage;
    }

}
