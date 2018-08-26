import java.util.ArrayList;

public class Vaisseau {

    int Carburant = 500;
    int PointDeVie = 100;

    public int getCarburant() {
        return Carburant;
    }

    public void setCarburant(int carburant) {
        Carburant = carburant;
    }

    public int getPointDeVie() {
        return PointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        PointDeVie = pointDeVie;
    }

    ArrayList Inventaire = new ArrayList();

}
