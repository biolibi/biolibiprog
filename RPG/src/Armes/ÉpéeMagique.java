package Armes;

public class ÉpéeMagique implements Magique , Tranchant {

    @Override
    public int Tranchant() {
        int damage =6;
        return damage;
    }

    @Override
    public int Magique() {
        int damage = 3;
        return damage;
    }

}
