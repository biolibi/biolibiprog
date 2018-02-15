package Armes;

public class ÉpéeLourde implements Tranchant , Contondant {

    public int Contondant() {
        int damage = 3;
        return damage;
    }


    public int Tranchant() {
        int damage =6 ;
        return damage;
    }
}
