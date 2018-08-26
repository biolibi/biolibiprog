import java.util.ArrayList;

public class Vaisseau {

    int Carburant = 500;
    int PointDeVie = 100;
    String PlaneteActuel = "Terre";
    String RevenirEnArrière;

    public String getPlaneteActuel() {
        return PlaneteActuel;
    }

    public void setPlaneteActuel(String planeteActuel) {
        PlaneteActuel = planeteActuel;
    }

    public String getRevenirEnArrière() {
        return RevenirEnArrière;
    }

    public void setRevenirEnArrière(String revenirEnArrière) {
        RevenirEnArrière = revenirEnArrière;
    }

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
